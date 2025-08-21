package com.net.autowire;

public class Cart {
	
	private int id;
	private Product product;
	
	
	
	
	
	public Cart(Product product) {
		super();
		this.product = product;
	}


	public Cart()
	{
		System.out.println("Cart Object is created");
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	@Override
	public String toString() {
		return "Cart [id=" + id + ", product=" + product + "]";
	}
	
	

}
