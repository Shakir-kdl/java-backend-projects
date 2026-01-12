package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		jdbcTxn();
	}

	public static void jdbcTxn() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zepto_18_aug", "root", "403403");
			con.setAutoCommit(false);
			String orderUpdate = "update orders set status =? where id = ?";
			PreparedStatement ps = con.prepareStatement(orderUpdate);
			ps.setString(1, "PAID");
			ps.setInt(2, 1);
			int recordUpdated = ps.executeUpdate();
			if (recordUpdated > 0) {
				System.out.println("Order has been updated ");

			}
			String paymentUpdated = "update payment set status=? where payment_id = ?";
			ps = con.prepareStatement(paymentUpdated);
			ps.setString(1, "COMPLETED");
			ps.setInt(2, 12);
			recordUpdated = ps.executeUpdate();
			if (recordUpdated > 0) {
				System.out.println("Payment is successfull");
				ps = con.prepareStatement(orderUpdate);
				ps.setString(1, "SUCCESS");
				ps.setInt(2, 1);
				recordUpdated = ps.executeUpdate();
				if (recordUpdated > 0) {
					System.out.println("Order has been updated to Successfull");
				}

			}

			con.commit();

		} catch (Exception e) {

			try {
				if (con != null) {
					con.rollback();
				}

			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}
