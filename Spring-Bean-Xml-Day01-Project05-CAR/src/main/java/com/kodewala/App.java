package com.kodewala;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.pojo.Car;

public class App {
	public static void main(String[] args) {

		String xmlFile = "resource\\applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlFile);
		Map<String, Car> cars = context.getBeansOfType(Car.class);
		for (Car c : cars.values()) {
			System.out.println("Model Name: " + c.getModelName());
			System.out.println("Company Name: " + c.getCompanyName());
			System.out.println("Rent Per Day :" + c.getRentPerDay());

			System.out.println("----------------------------------------");
		}
	}
}
