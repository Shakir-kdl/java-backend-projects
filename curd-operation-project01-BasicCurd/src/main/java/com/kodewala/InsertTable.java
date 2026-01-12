package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		doJDBC();
	}

	public static void doJDBC() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/order_db", "root", "403403");
		Statement stmt = con.createStatement();
		String insertTable = "INSERT INTO  orders(odName,price)VALUES('iphone',12000),('TV',14000),('AC',70000)";
		int inserted = stmt.executeUpdate(insertTable);
		System.out.println("Recorde inserted: " + inserted);

	}

}
