package com.kodewala;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PlaceOrder {

	public static void placeOrder(int userId, Cart cart) {

		String orderSql = "INSERT INTO orders(user_id, total_amount) VALUES (?, ?)";
		String itemSql = "INSERT INTO order_item(order_id, product_id, quantity, price) VALUES (?, ?, ?, ?)";
		String stockSql = "UPDATE products SET stock = stock - ? WHERE product_id = ?";

		Connection con = null;

		try {
			con = DatabaseConnection.getConnection();
			con.setAutoCommit(false);

			double total = 0;

			for (CartItem item : cart.getCartItems().values()) {
				total = total + (item.getPrice() * item.getQuantity());
			}

			PreparedStatement orderPs = con.prepareStatement(orderSql, PreparedStatement.RETURN_GENERATED_KEYS);

			orderPs.setInt(1, userId);
			orderPs.setDouble(2, total);
			orderPs.executeUpdate();

			ResultSet rs = orderPs.getGeneratedKeys();
			rs.next();
			int orderId = rs.getInt(1);

			PreparedStatement itemPs = con.prepareStatement(itemSql);
			PreparedStatement stockPs = con.prepareStatement(stockSql);

			for (CartItem item : cart.getCartItems().values()) {

				itemPs.setInt(1, orderId);
				itemPs.setInt(2, item.getProductId());
				itemPs.setInt(3, item.getQuantity());
				itemPs.setDouble(4, item.getPrice());
				itemPs.addBatch();

				stockPs.setInt(1, item.getQuantity());
				stockPs.setInt(2, item.getProductId());
				stockPs.addBatch();
			}

			itemPs.executeBatch();
			stockPs.executeBatch();

			con.commit();
			cart.clearCart();

			orderPs.close();
			itemPs.close();
			stockPs.close();
			rs.close();
			con.close();

			System.out.println("Order placed successfully");

		} catch (Exception e) {
			try {
				if (con != null) {
					con.rollback();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			System.out.println("Order failed");
			e.printStackTrace();
		}

	}
}
