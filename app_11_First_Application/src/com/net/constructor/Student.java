package com.net.constructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Student {
	
	private int student;
	private String name;
	private ArrayList<String> nameList;
	private HashSet<String> collegeList;
	private HashMap<Integer,String> studentId;
	private Address address;
	
	
	
	public Student() {
		super();
	}


	

	public Student(int student, String name, ArrayList<String> nameList, HashSet<String> collegeList,
			HashMap<Integer, String> studentId, Address address) {
		super();
		this.student = student;
		this.name = name;
		this.nameList = nameList;
		this.collegeList = collegeList;
		this.studentId = studentId;
		this.address = address;
	}




	public Student(int student, String name, ArrayList<String> nameList, HashSet<String> collegeList,
			HashMap<Integer, String> studentId) {
		super();
		this.student = student;
		this.name = name;
		this.nameList = nameList;
		this.collegeList = collegeList;
		this.studentId = studentId;
	}




	public Student(int student, String name, ArrayList<String> nameList, HashSet<String> collegeList) {
		super();
		this.student = student;
		this.name = name;
		this.nameList = nameList;
		this.collegeList = collegeList;
	}




	public Student(int student, String name, ArrayList<String> nameList) {
		super();
		this.student = student;
		this.name = name;
		this.nameList = nameList;
	}



	public int getStudent() {
		return student;
	}



	public void setStudent(int student) {
		this.student = student;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public ArrayList<String> getNameList() {
		return nameList;
	}



	public void setNameList(ArrayList<String> nameList) {
		this.nameList = nameList;
	}



	public Student(int student, String name) {
		super();
		
		System.out.println("Called From Constructor");
		this.student = student;
		this.name = name;
	}




	@Override
	public String toString() {
		return "Student [student=" + student + ", name=" + name + ", nameList=" + nameList + ", collegeList="
				+ collegeList + ", studentId=" + studentId + ", address=" + address + "]";
	}








	
}
