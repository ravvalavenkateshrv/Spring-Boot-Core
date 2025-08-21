package com.net.vyv.qualf;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component("upiPayment")
public class PaymentType {
	
	private String paymentType;
	
	
	

	public PaymentType() {
	
		System.out.println("payment object is created");
	}

	public PaymentType(String paymentType) {
		super();
		this.paymentType = paymentType;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public String toString() {
		return "PaymentType [paymentType=" + paymentType + "]";
	}
	
	

}
