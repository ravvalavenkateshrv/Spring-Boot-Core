package com.net.vyv.qualf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new AnnotationConfigApplicationContext(PaymentConfig.class);
		PaymentGateAway payment=(PaymentGateAway)container.getBean("paymentGateAway");
		System.out.println("********Tesing purpose*******");
		System.out.println(payment.getPaymentType());
		System.out.println(payment.getUserEmail());

	}

}
