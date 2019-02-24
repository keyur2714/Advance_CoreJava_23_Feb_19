package com.webstack.factory;

import com.webstack.service.Bike;
import com.webstack.service.VehicleFactory;
import com.webstack.service.impl.BajajBike;
import com.webstack.service.impl.HondaBike;
import com.webstack.service.impl.YamahaBike;

public class BikeFactory implements VehicleFactory{

	public Bike getBike(String type) {
		if ("Honda".equalsIgnoreCase(type)) {
			return new HondaBike();
		} else if ("Bajaj".equalsIgnoreCase(type)) {
			return new BajajBike();
		} else if ("Yamaha".equalsIgnoreCase(type)) {
			return new YamahaBike();
		}
		return null;
	}

	@Override
	public CarFactory getCarFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BikeFactory getBikeFactory() {
		// TODO Auto-generated method stub
		return this;
	}

}
