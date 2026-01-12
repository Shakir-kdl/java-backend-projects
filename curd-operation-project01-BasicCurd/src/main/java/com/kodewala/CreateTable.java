package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		doJDBC();
	}

	public static void doJDBC() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/order_db", "root", "403403");
		Statement stmt = con.createStatement();
		String createTb = "CREATE TABLE orders ( od_id int PRIMARY KEY AUTO_INCREMENT,odName VARCHAR(20),price int)";
		stmt.execute(createTb);
		System.out.println("Table 'orders' is created sucessfully!");
	}
}
