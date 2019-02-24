package com.webstack.service.impl;

import com.webstack.service.Car;
import com.webstack.service.Vehicle;

public class TataCar extends Car implements Vehicle {

	@Override
	public int avgPrice() {
		return 600000;
	}

	@Override
	public String[] carType() {
		return new String[] { "Sedan", "Hachback" };
	}

	@Override
	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return this;
	}

}
