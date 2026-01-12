package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.config.BankingConfig;
import com.kodewala.service.BankingService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(BankingConfig.class);
        BankingService service= context.getBean(BankingService.class);
        service.printBankDetails();
    }
}
