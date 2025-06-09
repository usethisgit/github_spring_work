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
        Alien alien1 = context.getBean("alien", Alien.class);
        Alien alien2 = context.getBean("alien", Alien.class);
       alien1.age = 20;
        System.out.println(alien1.age);
        System.out.println(alien2.age);

    }
}
