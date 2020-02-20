package com.vehicle;

public class PSV implements Vehicle {

	@Override
	public void spec() {
		//Overrides the interface default
		System.out.print("Part of the Peugeot group");

	}

}
