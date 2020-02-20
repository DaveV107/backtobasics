package com.vehicle;

public class Mercedes implements Vehicle {

	@Override
	public void spec() {
		//Overrides the interface default
		System.out.println("The Mercedes Benz group");

	}

}
