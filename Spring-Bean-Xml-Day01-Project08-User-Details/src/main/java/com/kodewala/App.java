package com.kodewala;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.pojo.Address;
import com.kodewala.pojo.User;

public class App 
{
    public static void main( String[] args )
    {
		String xmlFile = "resources\\applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlFile);
		Map<String, User> map = context.getBeansOfType(User.class);

		for (User us : map.values()) {
			System.out.println("Name: " + us.getName());
			System.out.println("Email :" + us.getEmail());

			Address ad = us.getAddress();
			System.out.println("City: " + ad.getCity());
			System.out.println("State: " + ad.getState());
			System.out.println("Pincode: " + ad.getPincode());
			System.out.println("----------------------------------");
		}

    }
}
