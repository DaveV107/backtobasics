package com.vehicle;

public class Car {

	private String fuel;
	private int doors;
	private String bodytype;
	public Car(String fuel, int doors, String bodytype) {
		super();
		this.fuel = fuel;
		this.doors = doors;
		this.bodytype = bodytype;
	}
	@Override
	public String toString() {
		return "CarBuilder [fuel=" + fuel + ", doors=" + doors + ", bodytype=" + bodytype + "]";
	}
	
}
