package com.kodewala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.kodewala.pojo.Notification;

@Component

public class NotificationService {
	@Autowired
	@Qualifier("smsNotification")
	Notification notification;

	public void doNotificationMgmt() {
		System.out.println("NotificationService.doNotificationMgmt().....Method Print");
	}

}
