package com.net.vyv.field;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private int id;
	private String street;
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	

}
