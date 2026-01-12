package com.kodewala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.kodewala.pojo.Shipping;

@Component
public class ShippingService {

	@Autowired
	@Qualifier("blueDartDelivery")
	Shipping shipping;

	public void doShippingPartner() {
		System.out.println("ShippingService.doShippingPartner()....method");
	}
}
