package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepRollBack1 {

	public static void main(String[] args) {
		commitRollback();
	}

	public static void commitRollback() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/order_db", "root", "403403");
			con.setAutoCommit(false);
			String sql = "insert into orders (odName,price) values(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "Realme");
			ps.setInt(2, 145000);
			ps.executeUpdate();

			ps.setString(1, "samsung");
			ps.setInt(2, 15000);
			ps.executeUpdate();

			ps.setString(1, "apple");
			ps.setInt(2, 17100);
			ps.executeUpdate();

			con.commit();
			System.out.println("First 3 record committed");

			ps.setString(1, "Vivo");
			ps.setInt(2, 20000);
			ps.executeUpdate();

			ps.setString(1, "Sony");
			ps.setInt(2, 25000);
			ps.executeUpdate();

			con.rollback();
			System.out.println("Rollback Executed");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
