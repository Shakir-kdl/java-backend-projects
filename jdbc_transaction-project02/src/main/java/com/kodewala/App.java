package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		processOrder();
	}

	public static void processOrder() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce_db", "root", "403403");
			con.setAutoCommit(false);
			String orderPaid = "UPDATE orders set status = ? where order_id=?";
			PreparedStatement ps = con.prepareStatement(orderPaid);
			ps.setString(1, "PAID");
			ps.setInt(2, 1);
			ps.executeUpdate();
			System.out.println("Order marked as PAID");

			String paymentDone = "UPDATE payment set status =? where payment_id=?";
			ps = con.prepareStatement(paymentDone);
			ps.setString(1, "COMPLETED");
			ps.setInt(2, 101);
			ps.executeUpdate();
			System.out.println("Payment COMPLETED");
			ps = con.prepareStatement(orderPaid);
			ps.setString(1, "SUCCESS");
			ps.setInt(2, 1);
			ps.executeUpdate();

			System.out.println("Order SUCCESS");
			con.commit();
			System.out.println("Transaction COMMITTED");

		} catch (Exception e) {

			try {
				if (con != null) {
					con.rollback();
					System.out.println("Transaction Rolled Back");
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();

		}
	}
}
