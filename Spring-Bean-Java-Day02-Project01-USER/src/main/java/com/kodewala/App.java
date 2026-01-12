package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.pojo.SpringConfig;
import com.kodewala.pojo.User;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		User user = (User) context.getBean("user1");
		System.out.println("User Name: " + user.getUserName());
		System.out.println("Password: " + user.getPassword());
		System.out.println("-------------------------------------------");

		User user1 = (User) context.getBean("user2");
		System.out.println("User Name: " + user1.getUserName());
		System.out.println("Password: " + user1.getPassword());
		

	}
}
