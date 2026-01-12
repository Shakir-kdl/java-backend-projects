package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepStmtPrec {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		prepStmt();
	}

	public static void prepStmt() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/order_db", "root", "403403");
		String query = "select * from orders where od_id = ? and odName = ? and price = ?";

		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, 3);
		ps.setString(2, "Khan");
		ps.setInt(3, 70000);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int od_Id = rs.getInt(1);
			String odName = rs.getString(2);
			int salary = rs.getInt(3);

			System.out.println("od_Id: " + od_Id + " odName : " + odName + " salary : " + salary);

		}

	}

}
