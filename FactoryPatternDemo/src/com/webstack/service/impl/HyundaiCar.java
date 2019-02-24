package com.webstack.service.impl;

import com.webstack.service.Car;
import com.webstack.service.Vehicle;

public class HyundaiCar extends Car implements Vehicle {

	@Override
	public int avgPrice() {
		return 70000;
	}

	@Override
	public String[] carType() {
		return new String[] { "Sedan", "Hachback", "XUV" };
	}

	@Override
	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return this;
	}

}
