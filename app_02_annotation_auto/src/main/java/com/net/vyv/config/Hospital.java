package com.net.vyv.config;

public class Hospital {
	
	private int id;
	private String name;
	public Hospital() {
		
		System.out.println("Hospital Object is created");
	}
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + "]";
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
