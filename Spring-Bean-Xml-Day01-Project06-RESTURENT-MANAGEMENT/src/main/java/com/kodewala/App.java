package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.pojo.Item;
import com.kodewala.pojo.Order;

public class App {
	public static void main(String[] args) {
		String xmlFile = "resource\\applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlFile);

		Order order = (Order) context.getBean("order1");
		System.out.println("Order Id: " + order.getOrderId());
		System.out.println("Quantity: " + order.getQuantity());

		Item item = order.getItem();
		System.out.println("Item Name: " + item.getName());
		System.out.println("Item Price: " + item.getPrice());

		double total = item.getPrice() * order.getQuantity();
		System.out.println("Total Bill: " + total);
	}
}
