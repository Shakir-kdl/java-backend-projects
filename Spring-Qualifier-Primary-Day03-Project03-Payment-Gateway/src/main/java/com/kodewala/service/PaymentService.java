package com.kodewala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.kodewala.pojo.Payment;

@Component
public class PaymentService {
	@Autowired
	@Qualifier("codPayment")
	Payment payment;

	public void doPaymentMethod() {
		System.out.println("PaymentService.doPaymentMethod()..Method Print");
	}
}
