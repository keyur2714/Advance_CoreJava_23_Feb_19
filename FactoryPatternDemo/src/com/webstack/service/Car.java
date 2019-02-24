package com.webstack.service;

public abstract class Car implements Vehicle{
	
	public abstract int avgPrice();
	public abstract String[] carType();
	
	public int noOfWheel() {
		return 4;
	}
	
	
}
