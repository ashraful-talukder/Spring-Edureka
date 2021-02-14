package com.edureka.Spring_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("Customer.xml");
    	
    	CustomerService cust = (CustomerService) appContext.getBean("Proxy");
    }
}
 