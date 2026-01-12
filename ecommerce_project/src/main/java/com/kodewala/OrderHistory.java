package com.kodewala;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OrderHistory {

	public static void viewOrders(int userId) {

		String sql = "SELECT order_id, total_amount, order_date "
				+ "FROM orders WHERE user_id = ? ORDER BY order_date DESC";

		try (Connection con = DatabaseConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY);) {
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();

			if (!rs.next()) {
				System.out.println("No order found.");
				return;
			}

			rs.beforeFirst();

			System.out.println("\n--- ORDER HISTORY ---");

			while (rs.next()) {

				int orderId = rs.getInt("order_id");
				double totalAmount = rs.getDouble("total_amount");
				Date orderDate = rs.getDate("order_date");

				System.out.println("Order ID: " + orderId);
				System.out.println("Total Amount: " + totalAmount);
				System.out.println("Order Date: " + orderDate);
				System.out.println("---------------------");
			}

		} catch (Exception e) {
			System.out.println("Error while fetching order history");
			e.printStackTrace();
		}
	}
}
