package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.kodewala.pojo.Notification;

@Configuration
@ComponentScan("com.kodewala")
public class NotificationConfig {
	
	@Bean("emailNotification")
	public Notification notificationOne() {
		System.out.println("Email Notification...first bean");
		return new Notification();
	}

	@Bean("smsNotification")
	public Notification notificationTwo() {
		System.out.println("Sms Notification...second bean");
		return new Notification();
	}

	@Bean("pushNotification")
	@Primary
	public Notification notificationThree() {
		System.out.println("Push Notification...third bean");
		return new Notification();
	}

}
