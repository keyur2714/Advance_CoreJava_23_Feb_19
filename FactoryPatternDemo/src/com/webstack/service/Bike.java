package com.webstack.service;

public abstract class Bike {
	
	public abstract int avgPrice();
	public abstract String[] bikeType();
	
	public int noOfWheel() {
		return 2;
	}
	
	
}
