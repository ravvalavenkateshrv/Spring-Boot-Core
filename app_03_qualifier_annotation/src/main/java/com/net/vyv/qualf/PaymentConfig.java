package com.net.vyv.qualf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@ComponentScan("com.*")
@Configuration

public class PaymentConfig {
	
	
	@Bean
	
	public PaymentType upiPayment()
	{
		System.out.println("This is upi payment");
		 PaymentType payment=new PaymentType();
		 payment.setPaymentType("Upi Payment");
		
		return payment;
	}

	
	@Bean
	
	public PaymentType creditCard()
	{
		System.out.println("This is credit  cartpayment");
		 PaymentType payment=new PaymentType();
		 payment.setPaymentType("Credit Cart Payment");
		
		return payment;
	}
	
	@Bean
	public PaymentType debitCard()
	{
		System.out.println("This is Debit Cart payment");
		 PaymentType payment=new PaymentType();
		 payment.setPaymentType("Debit Card Payment");
		
		return payment;
	}


}
