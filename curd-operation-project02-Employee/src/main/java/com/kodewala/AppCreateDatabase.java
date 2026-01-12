package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppCreateDatabase {

	public static void main(String[] args) {
		try {
			doJDBC();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static void doJDBC() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "403403");
		Statement stmt = con.createStatement();
		String sql = "CREATE DATABASE company_db";
		stmt.execute(sql);
		System.out.println("Database 'company_db' created Successfully");
	}

}
