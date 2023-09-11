package com.example;

public class Nurse implements staff{

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void work() {
		System.out.println("nurse connected");
		System.out.println(name);
		
	}

}
