package com.net.vyv.config;

public class Student {
	
	private int id;
	private String name;
	
	
	
	public Student() {
		
		super();
		System.out.println("object is created");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
