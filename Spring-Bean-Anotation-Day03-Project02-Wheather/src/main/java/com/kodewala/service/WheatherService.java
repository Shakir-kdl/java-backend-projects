package com.kodewala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kodewala.wheather.Wheather;

@Component
public class WheatherService {

	@Autowired
	Wheather wheather;
	public void printWheatherInfo() {
		System.out.println("City: "+wheather.getCity());
		System.out.println("Temprature: "+wheather.getTemprature());
	}
}
