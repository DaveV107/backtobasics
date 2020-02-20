package com.factory;


import com.vehicle.Car;
import com.vehicle.Vehicle;

public class FactoryMain {

	public static void main(String[] args) {

		CarFactory cf = new CarFactory();
		Vehicle car = cf.getInstance("BMW");
		car.spec();		
		car.colour();
		
		Car cb = new Car("diesel",  4,  "saloon");
		System.out.println(cb);
		
		Car cc = new CarBuilder().setBodytype("estate").setFuel("electric").getCar();
		System.out.println(cc);
		

	}

}
