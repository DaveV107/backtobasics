package com.factory;

import com.vehicle.Car;
import com.vehicle.Vehicle;

public class FactoryMain {

	public static void main(String[] args) {

		//generic and interface
		CarFactory cf = new CarFactory();
		Vehicle car = cf.getInstance("Ford");
		car.spec();		//uses the spec defined by manufacturer or defaults to vehicle.spec if exists or generic.spec
		car.colour();	//uses the colour defined by manufacturer or defaults to  vehicle.colour or generic.colour
		
		Car cb = new Car("diesel",  4,  "saloon");
		System.out.println(cb);
		
		Car cc = new CarBuilder().setBodytype("estate").setFuel("electric").getCar();
		System.out.println(cc);
		

	}

}
