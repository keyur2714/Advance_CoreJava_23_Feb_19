package com.webstack.service.impl;

import com.webstack.service.IPayment;

public class CardPayment implements IPayment{

	@Override
	public String payment() {		
		return "I am accepting Card Payment.";
	}

}
