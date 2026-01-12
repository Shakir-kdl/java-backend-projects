package com.kodewala.banking;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Banking {
@Value("SBI")
private String bankName;
@Value("Khandela")
private String branchName;
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}


}
