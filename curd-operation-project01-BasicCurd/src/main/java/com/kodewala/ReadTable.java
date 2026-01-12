package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		doJDBC();
	}

	public static void doJDBC() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/order_db", "root", "403403");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM orders");
		while (rs.next()) {
			int od_id = rs.getInt(1);
			String odName = rs.getString(2);
			int salary = rs.getInt(3);
			System.out.println("od_id: " + od_id + " odName: " + odName + " salary: " + salary);

		}

	}
}
