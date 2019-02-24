package com.webstack.factory;

import com.webstack.service.Car;
import com.webstack.service.VehicleFactory;
import com.webstack.service.impl.HondaCar;
import com.webstack.service.impl.HyundaiCar;
import com.webstack.service.impl.TataCar;

public class CarFactory implements VehicleFactory{

	public static Car getCar(String type) {
		if ("Honda".equalsIgnoreCase(type)) {
			return new HondaCar();
		} else if ("Tata".equalsIgnoreCase(type)) {
			return new TataCar();
		} else if ("Hyundai".equalsIgnoreCase(type)) {
			return new HyundaiCar();
		}
		return null;
	}

	@Override
	public CarFactory getCarFactory() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public BikeFactory getBikeFactory() {
		// TODO Auto-generated method stub
		return null;
	}

}
