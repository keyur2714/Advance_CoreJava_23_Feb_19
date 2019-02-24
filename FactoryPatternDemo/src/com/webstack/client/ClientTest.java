package com.webstack.client;

import com.webstack.factory.PaymentFactory;
import com.webstack.service.IPayment;
import com.webstack.service.impl.CardPayment;
import com.webstack.service.impl.CashPayment;
import com.webstack.service.impl.PaytmPayement;

public class ClientTest {

	public static void main(String[] args) {
		IPayment payment = null;
		
		payment = new CardPayment();		
		System.out.println(payment.payment());
		
		payment = new CashPayment();
		System.out.println(payment.payment());
		
		payment = new PaytmPayement();
		System.out.println(payment.payment());
		
		System.out.println("====================Using Factory===========");
	
		payment = PaymentFactory.getPayment("Paytm");
		System.out.println(payment.payment());
	}

}
