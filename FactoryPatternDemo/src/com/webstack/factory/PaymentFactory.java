package com.webstack.factory;

import com.webstack.service.IPayment;
import com.webstack.service.impl.CardPayment;
import com.webstack.service.impl.CashPayment;
import com.webstack.service.impl.PaytmPayement;

public class PaymentFactory {

	public static IPayment getPayment(String type) {
		if(type.equalsIgnoreCase("Cash")) {
			return new CashPayment();
		}else if(type.equalsIgnoreCase("Card")) {
			return new CardPayment();
		}else if(type.equalsIgnoreCase("Paytm")) {
			return new PaytmPayement();
		}
		return null;
	}
	
}
