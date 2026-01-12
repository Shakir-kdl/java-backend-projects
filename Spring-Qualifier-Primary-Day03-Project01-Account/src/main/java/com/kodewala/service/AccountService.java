package com.kodewala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.kodewala.pojo.Account;

@Component
public class AccountService {
	@Autowired
//	@Qualifier("acc1")
	Account account;
	public void doAccMgmt() {
		System.out.println("AccountService.doAccMgmt()");
	}
	
	

}
