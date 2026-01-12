package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepStmtCommit {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		prepStmtComt();
	}

	public static void prepStmtComt() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/order_db", "root", "403403");
		con.setAutoCommit(false);
		String query = "insert into orders (odName,price) values(?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		for (int i = 1; i < 10; i++) {
			ps.setString(1, "Samsung_S20" + i);
			ps.setInt(2, 1500000);
			ps.addBatch();
		}

		int[] records = ps.executeBatch();
		con.commit();
		System.out.println("Record inserted : " + records.length);

	}

}
