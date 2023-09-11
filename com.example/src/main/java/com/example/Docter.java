package com.example;

public class Docter implements staff {

	
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

}
