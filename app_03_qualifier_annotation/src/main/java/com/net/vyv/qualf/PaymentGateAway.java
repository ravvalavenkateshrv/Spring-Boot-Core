package com.net.vyv.qualf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class PaymentGateAway {
	
	private int amount;
	private String userEmail;
	
	
	@Autowired
	@Qualifier("upiPayment")
	private PaymentType paymentType;
	
	
	

	public PaymentGateAway() {
	
		
		System.out.println("Payment GateAway object is created");
	}

	

	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public String getUserEmail() {
		return userEmail;
	}



	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}



	public PaymentType getPaymentType() {
		return paymentType;
	}




	
	
	
	
	

}
