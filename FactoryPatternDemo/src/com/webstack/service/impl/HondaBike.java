package com.webstack.service.impl;

import com.webstack.service.Bike;

public class HondaBike extends Bike {

	@Override
	public int avgPrice() {
		return 70000;
	}

	@Override
	public String[] bikeType() {
		return new String[] { "Regular", "Sports", "Moped" };
	}

}
