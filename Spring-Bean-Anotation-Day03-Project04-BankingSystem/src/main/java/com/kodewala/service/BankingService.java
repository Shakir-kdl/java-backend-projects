package com.kodewala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.kodewala.banking.Banking;

@Configuration
public class BankingService {
@Autowired
Banking banking;
public void printBankDetails() {
	System.out.println("BankName: "+banking.getBankName());
	System.out.println("Branch: "+banking.getBranchName());
}
}
