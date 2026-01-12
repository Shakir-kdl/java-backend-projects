package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.config.MessageConfig;
import com.kodewala.message.Message;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
        MessageService messageService = context.getBean(MessageService.class);
         messageService.printMessageInfo();
    }
}
