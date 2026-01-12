package com.kodewala.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean("user1")
	public User createdUserObj() {
		User user = new User();
		user.setUserName("Shaikh");
		user.setPassword("sg12345");
		return user;
	}

	@Bean("user2")
	public User constructUserObj() {
		User user = new User();
		user.setUserName("Khan");
		user.setPassword("5678ugb");
		return user;
	}

}
