package com.kodewala.message;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Message {
	@Value("FaceBook")
	private String messageApp;
	@Value ("Android")
	private  String systemName;
	
	public String getMessageApp() {
		return messageApp;
	}
	public void setMessageApp(String messageApp) {
		this.messageApp = messageApp;
	}
	public String getSystemName() {
		return systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}
	

}
