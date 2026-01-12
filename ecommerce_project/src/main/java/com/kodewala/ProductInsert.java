package com.kodewala;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductInsert {

	public static void main(String[] args) {

		String csvPath = "C:\\Users\\shaik\\Downloads\\product_bulk_upload.csv";
		String sql = "INSERT INTO products(name, price, stock) VALUES (?, ?, ?)";

		int batchSize = 10;
		int count = 0;

		try (Connection con = DatabaseConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(sql);
				BufferedReader br = new BufferedReader(new FileReader(csvPath))) {

			String line;
			br.readLine();

			while ((line = br.readLine()) != null) {

				String[] data = line.split(",");

				ps.setString(1, data[0]);
				ps.setDouble(2, Double.parseDouble(data[1]));
				ps.setInt(3, Integer.parseInt(data[2]));

				ps.addBatch();
				count++;

				if (count % batchSize == 0) {
					ps.executeBatch();
				}
			}

			ps.executeBatch();

			System.out.println("Products inserted successfully!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
