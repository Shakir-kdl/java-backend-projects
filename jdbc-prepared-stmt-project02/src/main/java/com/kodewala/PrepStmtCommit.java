package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepStmtCommit {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		prepCommit();
	}

	public static void prepCommit() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zepto_18_aug", "root", "403403");
		con.setAutoCommit(false);
		String query = "insert into payment (item , status) values(?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		for (int i = 1; i < 10; i++) {
			ps.setString(1, "Iphone-16" + i);
			ps.setString(2, "Process");
			ps.addBatch();

		}
		int[] records = ps.executeBatch();
		con.commit();
		System.out.println("Records Inserted :" + records.length);
	}
}
