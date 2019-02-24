package com.webstack.service.impl;

import com.webstack.service.IPayment;

public class PaytmPayement implements IPayment {

	@Override
	public String payment() {
		return "I am Accepting Paytm Payments.";
	}

}
