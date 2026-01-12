package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.kodewala.config.SpringConfig;

@Component
public class App

{

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//		User user = context.getBean(User.class);
//		System.out.println("User Name: " + user.getUserName());
//		System.out.println("Password: " + user.getPassword());

		UserService userService = context.getBean(UserService.class);

		userService.printUserInfo();

	}
}
