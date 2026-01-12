package com.kodewala;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProductView {

	public static void viewProducts() {

		String sql = "SELECT product_id, name, price, stock FROM products";

		try (Connection con = DatabaseConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {

			System.out.println("\n--- Available Products ---");

			while (rs.next()) {

				int productId = rs.getInt("product_id");
				String name = rs.getString("name");
				double price = rs.getDouble("price");
				int stock = rs.getInt("stock");

				System.out.println("Product ID: " + productId);
				System.out.println("Name: " + name);
				System.out.println("Price: " + price);
				System.out.println("Stock: " + stock);
				System.out.println("----------------------");
			}

		} catch (Exception e) {
			System.out.println("Error while fetching products");
			e.printStackTrace();
		}
	}

	public static Product getProductById(int productId) {

		String sql = "SELECT name, price FROM products WHERE product_id=?";

		try (Connection con = DatabaseConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setInt(1, productId);

			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					return new Product(productId, rs.getString("name"), rs.getDouble("price"));
				}
			}

		} catch (Exception e) {
			System.out.println("Error while fetching product");
			e.printStackTrace();
		}
		return null;
	}

	public static void viewProductsWithPagination(Scanner sc) {

		int pageSize = 5;
		int page = 1;

		while (true) {

			int offset = (page - 1) * pageSize;

			String sql = "SELECT product_id, name, price, stock FROM products LIMIT ? OFFSET ?";

			try (Connection con = DatabaseConnection.getConnection();
					PreparedStatement ps = con.prepareStatement(sql)) {

				ps.setInt(1, pageSize);
				ps.setInt(2, offset);

				ResultSet rs = ps.executeQuery();

				System.out.println("\n--- Products (Page " + page + ") ---");

				boolean hasData = false;

				while (rs.next()) {
					hasData = true;
					System.out.println("Product ID: " + rs.getInt("product_id"));
					System.out.println("Name: " + rs.getString("name"));
					System.out.println("Price: " + rs.getDouble("price"));
					System.out.println("Stock: " + rs.getInt("stock"));
					System.out.println("---------------------");
				}

				if (!hasData) {
					System.out.println("No more products");
					page--;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("1. Next Page");
			System.out.println("2. Previous Page");
			System.out.println("3. Exit");
			System.out.print("Choose option: ");

			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				page++;
			} else if (choice == 2) {
				if (page > 1) {
					page--;
				}
			} else {
				break;
			}
		}
	}

}
