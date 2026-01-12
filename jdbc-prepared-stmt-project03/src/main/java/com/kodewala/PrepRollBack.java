package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepRollBack {

	public static void main(String[] args) {
		rollBack();
	}

	public static void rollBack() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/order_db", "root", "403403");
			con.setAutoCommit(false);
			String query = "insert into orders (odName,price) values(?,?)";

			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, "Realme-XT");
			ps.setInt(2, 14500);
			ps.executeUpdate();
			con.commit();
			System.out.println("Transaction Commited");

		} catch (Exception e) {
			e.printStackTrace();
			try {
				if (con != null) {
					con.rollback();
					System.out.println("Transaction rolled back");
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

}
