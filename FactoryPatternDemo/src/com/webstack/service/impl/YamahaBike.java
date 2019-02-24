package com.webstack.service.impl;

import com.webstack.service.Bike;

public class YamahaBike extends Bike {

	@Override
	public int avgPrice() {
		return 100000;
	}

	@Override
	public String[] bikeType() {
		return new String[] { "Regular", "Sports", "Moped" };
	}

}
