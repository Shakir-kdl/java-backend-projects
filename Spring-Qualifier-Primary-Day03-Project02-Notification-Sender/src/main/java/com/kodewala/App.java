package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.config.NotificationConfig;
import com.kodewala.service.NotificationService;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(NotificationConfig.class);

		NotificationService service = context.getBean(NotificationService.class);
		service.doNotificationMgmt();

	}
}
