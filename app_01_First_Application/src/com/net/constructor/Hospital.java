package com.net.constructor;

public class Hospital {
	
	private int id;
	private Patient patient;
	
	
	


	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public Patient getPatient() {
		return patient;
	}





	public void setPatient(Patient patient) {
		this.patient = patient;
	}





	public Hospital(Patient patient) {
		super();
		this.patient = patient;
	}







	@Override
	public String toString() {
		return "Hospital [id=" + id + ", patient=" + patient + "]";
	}
	
	
	
	
	
	

}
