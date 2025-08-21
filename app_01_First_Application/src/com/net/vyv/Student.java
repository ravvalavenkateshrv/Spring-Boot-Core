package com.net.vyv;

public class Student {
	
	private String name;
	private String age;
	
	
	
	
	
	public Student(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}

	
	public Student()
	{
		System.out.println("Student Object is created");
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age ;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public void getStudentDetails()
	{
		System.out.println(this.age);
		System.out.println(this.name);
	}
}
