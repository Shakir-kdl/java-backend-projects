package com.kodewala;

// JDBC ke required classes import ki ja rahi hain
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {

	// Program execution yahin se start hota hai
	public static void main(String[] args) {
		placeFoodOrder(); // food order transaction method call
	}

	// Ye method food delivery app ka complete transaction handle karta hai
	public static void placeFoodOrder() {

		// Database connection reference (abhi null hai)
		Connection con = null;

		try {
			// MySQL JDBC driver load kiya
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Database se connection banaya
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_delivery_db", "root", "403403");

			// Auto-commit band kiya
			// Ab database khud se save nahi karega
			con.setAutoCommit(false);

			// ===================== ORDER UPDATE : PLACED =====================

			// Order table ka status update karne ki SQL query
			String orderUpdated = "UPDATE food_order set status=? where order_id=?";

			// PreparedStatement banaya (query ek baar compile hoti hai)
			PreparedStatement ps = con.prepareStatement(orderUpdated);

			// ? ki jagah values set ki
			// order_id = 1 ka status = PLACED
			ps.setString(1, "PLACED");
			ps.setInt(2, 1);

			// Query execute ki aur updated rows ka count liya
			int recordUpdate = ps.executeUpdate();

			// Agar order update hua to message print
			if (recordUpdate > 0) {
				System.out.println("Order PLACED successfully");
			}

			// ===================== PAYMENT UPDATE : COMPLETE =====================

			// Payment table ka status update karne ki SQL query
			String paymentUpdate = "UPDATE payment set status=? where payment_id=?";

			// Naya PreparedStatement banaya payment ke liye
			ps = con.prepareStatement(paymentUpdate);

			// payment_id = 101 ka status = COMPLETE
			ps.setString(1, "COMPLETE");
			ps.setInt(2, 101);

			// Payment update execute ki
			recordUpdate = ps.executeUpdate();

			// Agar payment successful hui to message print
			if (recordUpdate > 0) {
				System.out.println("Payment Completed");
			}

			// ===================== ORDER UPDATE : SUCCESS =====================

			// Order ko final SUCCESS status dene ke liye wahi query reuse
			ps = con.prepareStatement(orderUpdated);

			// order_id = 1 ka status = SUCCESS
			ps.setString(1, "SUCCESS");
			ps.setInt(2, 1);

			// Final order update execute
			recordUpdate = ps.executeUpdate();

			// Agar update successful hua to message
			if (recordUpdate > 0) {
				System.out.println("Order SUCCESS");
			}

			// ===================== COMMIT TRANSACTION =====================

			// Sab steps successful hone par commit
			con.commit();

			// Commit confirmation message
			System.out.println("Transaction Committed");

		} catch (Exception e) {

			// Agar kisi bhi step mein error aaya
			try {
				// Connection null nahi hai to rollback karo
				if (con != null) {
					con.rollback(); // saare changes undo ho jaayenge
					System.out.println("Transaction RollBack");
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}

			// Actual error console mein print
			e.printStackTrace();
		}
	}
}
