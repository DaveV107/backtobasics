package com.vehicle;

public class Generic implements Vehicle {
	//generic as in default, fallback, last ditch option. Override for each is recommended

	@Override
	//annotation ensures compile will check that any implementers override this
	public void spec() {
		//This is the default spec. 
		//If the individual cars manufacturers don't override it, then a basic message is displayed
		System.out.println("A car");

	}

}
