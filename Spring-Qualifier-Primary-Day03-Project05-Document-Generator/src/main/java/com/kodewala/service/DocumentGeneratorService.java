package com.kodewala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.kodewala.pojo.DocumentGenerator;

@Component
public class DocumentGeneratorService {
	@Autowired
	@Qualifier("excelGenerator")
	DocumentGenerator documentGenerator;

	public void doDocumentGeneInfo() {
		System.out.println("DocumentGeneratorService.doDocumentGeneInfo()");
	}
}
