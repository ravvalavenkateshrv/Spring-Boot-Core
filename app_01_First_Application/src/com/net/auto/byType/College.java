package com.net.auto.byType;

public class College {
	
	private int id;
	private Student student;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", student=" + student + "]";
	}
	
	
	
	

}
