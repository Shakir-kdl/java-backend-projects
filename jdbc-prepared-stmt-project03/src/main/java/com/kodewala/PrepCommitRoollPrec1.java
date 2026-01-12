package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepCommitRoollPrec1 {

	public static void main(String[] args) {

		commitRoll();
	}

	public static void commitRoll() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/order_db", "root", "403403");
			con.setAutoCommit(false);
			String sql = "insert into payment (item,status) values(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "AC");
			ps.setInt(2, 20000);
			ps.executeUpdate();
			ps.setString(1, "HeadPhone");
			ps.setInt(2, 2000);
			ps.executeUpdate();
			ps.setString(1, "TV");
			ps.setInt(2, 12000);
			ps.executeUpdate();

			con.commit();
			System.out.println("First 3 Record Are Inserted!");

			ps.setString(1, "Oven");
			ps.setInt(2, 15000);
			ps.executeUpdate();
			ps.setString(1, "Fan");
			ps.setInt(2, 1800);
			ps.executeUpdate();
			con.rollback();
			System.out.println("Rollback Executed!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
