package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/ecommerce_db?useSSL=false&serverTimezone=UTC", "root", "403403");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}

}
