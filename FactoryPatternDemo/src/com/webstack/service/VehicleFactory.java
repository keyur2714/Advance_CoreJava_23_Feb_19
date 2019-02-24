package com.webstack.service;

import com.webstack.factory.BikeFactory;
import com.webstack.factory.CarFactory;

public interface VehicleFactory {
	CarFactory getCarFactory();
	BikeFactory getBikeFactory();
}
