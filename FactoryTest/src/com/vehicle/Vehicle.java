package com.vehicle;

public interface Vehicle {
	
	void spec();
	public default void colour() {
		System.out.println("Black");
	}

}
