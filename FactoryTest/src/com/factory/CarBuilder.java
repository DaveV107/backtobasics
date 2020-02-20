package com.factory;

import com.vehicle.Car;

public class CarBuilder {
	private String fuel;
	private int doors;
	private String bodytype;
	
	public CarBuilder setFuel(String fuel) {
		this.fuel = fuel;
		return this;
	}
	public CarBuilder setDoors(int doors) {
		this.doors = doors;
		return this;
	}
	public CarBuilder setBodytype(String bodytype) {
		this.bodytype = bodytype;
		return this;
	}
	
	public Car getCar() {
		return new Car(fuel, doors, bodytype);
	}

}
