package com.factoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestFactoryMethod {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("factory.xml");
		
		A od=(A) context.getBean("a");
		od.msg();

	}

}
