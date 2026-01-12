package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.kodewala.pojo.DocumentGenerator;

@Configuration
@ComponentScan("com.kodewala")
public class DocumentGeneratorConfig {
	@Bean("pdfGenerator")
	public DocumentGenerator pdfGenerator() {
		System.out.println("PDF Generator..........First Bean");
		return new DocumentGenerator();
	}

	@Bean("wordGenerator")
	@Primary
	public DocumentGenerator wordGenerator() {
		System.out.println("WORD Generator..........Second Bean");
		return new DocumentGenerator();
	}

	@Bean("excelGenerator")
	public DocumentGenerator excelGenerator() {
		System.out.println("EXCEL Generator..........Third Bean");
		return new DocumentGenerator();
	}
}
