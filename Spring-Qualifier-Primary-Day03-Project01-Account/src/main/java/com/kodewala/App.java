package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.config.AccountConfig;
import com.kodewala.service.AccountService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AccountConfig.class);
        
        AccountService service = context.getBean(AccountService.class);
        
        service.doAccMgmt();
    }
}
