package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		doJDBC();

	}

	public static void doJDBC() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "403403");
		Statement stmt = con.createStatement();
		String createDb = "CREATE DATABASE IF NOT EXISTS order_db";
		stmt.executeUpdate(createDb);

		System.out.println("Database 'order_db' created successfully!");

	}
}
