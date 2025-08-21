package com.net.constructor;

public class Address {
	
	private int id;
	private String street;
	public Address(int id, String street) {
		super();
		this.id = id;
		this.street = street;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + "]";
	}
	
	

}
