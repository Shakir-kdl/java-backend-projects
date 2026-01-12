package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.kodewala.pojo.Account;

@Configuration
@ComponentScan("com.kodewala")
public class AccountConfig {
	
	@Bean("acc1")
	public Account createObject() {
		System.out.println("AccountConfig.createObject()....acc1");
		return new Account();
	}
	
	@Bean("acc2")
	@Primary
	public Account getObject() {
		System.out.println("AccountConfig.getObject()....acc2");
		return new Account();
	}

}
