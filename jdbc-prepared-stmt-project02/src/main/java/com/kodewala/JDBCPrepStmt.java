package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCPrepStmt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		crudUsingPrepStmt();
	}

	public static void crudUsingPrepStmt() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zepto_18_aug", "root", "403403");
		String query = "select * from payment where payment_id =?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, 2);

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int paymentId = rs.getInt(1);
			String item = rs.getString(2);
			String status = rs.getString(3);
			System.out.println("paymentId: " + paymentId + " item: " + item + " status: " + status);

		}

	}

}
