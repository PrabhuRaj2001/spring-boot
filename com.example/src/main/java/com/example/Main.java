package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext application=new AnnotationConfigApplicationContext(Annotationscan.class);
		Docter d=application.getBean(Docter.class);
		d.work();
	
		
	}

}
