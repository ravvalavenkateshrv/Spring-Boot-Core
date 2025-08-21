package com.net.vyv;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OrderInformation {

	private int id;
	private List<String> items;
	private Set<String> locations;
	private Map<String,Integer> productAndPrices;
	
	
	
	
	
	public Map<String, Integer> getProductAndPrices() {
		return productAndPrices;
	}
	public void setProductAndPrices(Map<String, Integer> productAndPrices) {
		this.productAndPrices = productAndPrices;
	}
	public Set<String> getLocations() {
		return locations;
	}
	public void setLocations(Set<String> locations) {
		this.locations = locations;
	}
	public OrderInformation()
	{
		System.out.println("Order Information is created");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	
	
}
