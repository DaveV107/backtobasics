package com.vehicle;

public class BMW implements Vehicle {
	@Override
	public void spec() {
		//Overrides the interface default
		System.out.println("Part of the Volkswagen Audi Group");		
	}
}
