package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		doJDBC();
	}

	public static void doJDBC() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/order_db", "root", "403403");
		Statement stmt = con.createStatement();
		String updateTable = "UPDATE  orders  set odName = 'Khan' where od_id=3";
		int updated = stmt.executeUpdate(updateTable);
		System.out.println("Recorded Updated: " + updated);

	}
}