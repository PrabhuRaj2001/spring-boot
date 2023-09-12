package com.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Docter implements staff,BeanNameAware {

	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Docter connected");
		System.out.println(name);
		
	}
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		System.out.println("checked");
		
	}
	
	@PostConstruct
	public void post()
	{
		System.out.println("post called");
	}

}
