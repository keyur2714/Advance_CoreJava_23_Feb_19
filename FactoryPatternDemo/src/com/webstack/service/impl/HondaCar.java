package com.webstack.service.impl;

import com.webstack.service.Car;
import com.webstack.service.Vehicle;

public class HondaCar extends Car {

	@Override
	public int avgPrice() {
		return 800000;
	}

	@Override
	public String[] carType() {
		return new String[] { "Sedan", "Hachback" };
	}

	@Override
	public Vehicle getVehicle() {
		return this;
	}

}
