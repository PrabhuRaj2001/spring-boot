package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext application=new ClassPathXmlApplicationContext("spring.xml");
		staff d=application.getBean(Docter.class);
		d.work();
	
		
	}

}
