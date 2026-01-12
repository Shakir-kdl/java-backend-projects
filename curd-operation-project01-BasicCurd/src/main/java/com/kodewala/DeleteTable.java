package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		doJDBC();
	}

	public static void doJDBC() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/order_db", "root", "403403");
		Statement stmt = con.createStatement();
		String deleteTable = "DELETE from orders where od_id = 6";
		int deleted = stmt.executeUpdate(deleteTable);
		System.out.println("Record Deleted: " + deleted);

	}
}
