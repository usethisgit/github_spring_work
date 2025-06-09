package com.upen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main(String[] args )
    {
        // the below line creates a spring container where objects are created
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Alien alien = context.getBean("alien", Alien.class);

        alien.code();
    }
}
