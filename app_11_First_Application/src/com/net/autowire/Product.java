package com.net.autowire;

public class Product {
	
	private int id;
	private String name;
	
	public Product()
	{
		System.out.println("product Object is created");
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

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

	
	
	
}
