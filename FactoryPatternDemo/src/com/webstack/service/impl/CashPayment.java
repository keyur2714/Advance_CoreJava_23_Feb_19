package com.webstack.service.impl;

import com.webstack.service.IPayment;

public class CashPayment implements IPayment{

	@Override
	public String payment() {
		return "I am accepting Cash Payment only.";
	}

}
