package com.net.vyv.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope(value="prototype")
@Component
public class Student {
	
	private int id;
	private String name;
	
	public Student ()
	{
		System.out.println("Object is created");
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
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
