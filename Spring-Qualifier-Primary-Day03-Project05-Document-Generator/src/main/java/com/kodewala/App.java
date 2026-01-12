package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.config.DocumentGeneratorConfig;
import com.kodewala.service.DocumentGeneratorService;

public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new AnnotationConfigApplicationContext(DocumentGeneratorConfig.class);

		DocumentGeneratorService service = context.getBean(DocumentGeneratorService.class);

		service.doDocumentGeneInfo();
    }
}
