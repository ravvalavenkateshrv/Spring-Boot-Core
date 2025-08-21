package com.net.autowiring;

public class Cart {

	private int id;
	private Product product2;
	
	
	public Cart() {
		super();
	}


	public Cart(int id, Product product2) {
		super();
		this.id = id;
		this.product2 = product2;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Product getProduct2() {
		return product2;
	}


	public void setProduct2(Product product2) {
		this.product2 = product2;
	}


	@Override
	public String toString() {
		return "Cart [id=" + id + ", product2=" + product2 + "]";
	}
	
	
	
}
