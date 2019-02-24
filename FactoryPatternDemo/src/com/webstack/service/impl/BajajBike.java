package com.webstack.service.impl;

import com.webstack.service.Bike;

public class BajajBike extends Bike {

	@Override
	public int avgPrice() {
		return 50000;
	}

	@Override
	public String[] bikeType() {
		return new String[] { "Regular", "Sports" };
	}

}
