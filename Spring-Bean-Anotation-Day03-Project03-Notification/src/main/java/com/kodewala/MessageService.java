package com.kodewala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kodewala.message.Message;

@Component
public class MessageService {
@Autowired
Message message;
public void printMessageInfo() {
	System.out.println("Message App: "+message.getMessageApp());
	System.out.println("System Name: "+message.getSystemName());
}
}
