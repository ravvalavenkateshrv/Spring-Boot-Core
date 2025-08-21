package com.net.first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Student {
	
	private int id;
	private String name;
	private ArrayList<String> nameList;
	private HashSet<String> collegeList;
	private HashMap<Integer,String> hostelList;
	private Address address;
	
	
	
	
	public Student()
	{
		System.out.println("Student Object is created");
	}




	public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}




	public HashMap<Integer, String> getHostelList() {
		return hostelList;
	}




	public void setHostelList(HashMap<Integer, String> hostelList) {
		this.hostelList = hostelList;
	}




	







	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", nameList=" + nameList + ", collegeList=" + collegeList
				+ ", hostelList=" + hostelList + ", address=" + address + "]";
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


	public ArrayList<String> getNameList() {
		return nameList;
	}


	public void setNameList(ArrayList<String> nameList) {
		this.nameList = nameList;
	}


	public HashSet<String> getCollegeList() {
		return collegeList;
	}


	public void setCollegeList(HashSet<String> collegeList) {
		this.collegeList = collegeList;
	}


	

	
	
}
