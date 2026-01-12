package com.kodewala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kodewala.user.User;

@Component
public class UserService {

	@Autowired
	User user;

	public void printUserInfo() {
		System.out.println("User Name: " + user.getUserName());
		System.out.println("Password: " + user.getPassword());
	}
}
