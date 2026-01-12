package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepPractice1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		preStmt();
	}

	public static void preStmt() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zepto_18_aug", "root", "403403");
		con.setAutoCommit(false);
		String insertQuery = "INSERT INTO employee(name,age) values(?,?)";

		PreparedStatement ps = con.prepareStatement(insertQuery);
		for (int i = 1; i < 1000; i++) {
			ps.setString(1, "Shaikh Shakir" + i);
			ps.setInt(2, 28);
			ps.addBatch();
		}
		int[] records = ps.executeBatch();
		con.commit();
		System.out.println("record inserted: " + records.length);

	}
}
