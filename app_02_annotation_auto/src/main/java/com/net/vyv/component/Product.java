package com.net.vyv.component;

import org.springframework.stereotype.Component;

@Component(value="product")
public class Product {
	
	private int id;
	private String name;

	
	public Product()
	{
		System.out.println("product Object is created");
	}


	public int getId() {
		System.out.println("id calling");
		return id;
	}


	public void setId(int id) {
		System.out.println("id calling");
		this.id = id;
	}


	public String getName() {
		System.out.println("id calling");
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
