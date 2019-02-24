package com.webstack.client;

import com.webstack.factory.BikeFactory;
import com.webstack.factory.CarFactory;
import com.webstack.factory.abs.VehicleAbstarctFactory;
import com.webstack.service.Bike;
import com.webstack.service.Car;
import com.webstack.service.VehicleFactory;

public class VehicleClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarFactory carFactory = new VehicleAbstarctFactory().getCarFactory();			

		Car hondaCar = carFactory.getCar("honda");
		System.out.println(hondaCar.avgPrice());
		
		VehicleFactory carNewFactory = VehicleAbstarctFactory.getFactory("carFactory");
		Car newCar = carNewFactory.getCarFactory().getCar("Tata");
		
		System.out.println(newCar.avgPrice());

		BikeFactory bikeFactory = new VehicleAbstarctFactory().getBikeFactory();

		Bike yamahaBike = bikeFactory.getBike("yamaha");
		System.out.println(yamahaBike.avgPrice());
	}

}
