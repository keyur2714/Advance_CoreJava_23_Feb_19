package com.webstack.factory.abs;

import com.webstack.factory.BikeFactory;
import com.webstack.factory.CarFactory;
import com.webstack.service.VehicleFactory;

public class VehicleAbstarctFactory implements VehicleFactory {

	public static VehicleFactory getFactory(String factoryType){
		if("carFactory".equalsIgnoreCase(factoryType)) {
			return new CarFactory().getCarFactory();
		}else if("bikeFactory".equalsIgnoreCase(factoryType)) {
			return new BikeFactory().getBikeFactory();
		}
		return null;
	}
	
	@Override
	public CarFactory getCarFactory() {
		// TODO Auto-generated method stub
		return new CarFactory();
	}

	@Override
	public BikeFactory getBikeFactory() {
		// TODO Auto-generated method stub
		return new BikeFactory();
	}

}
