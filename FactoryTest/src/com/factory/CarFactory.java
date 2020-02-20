package com.factory;

import com.vehicle.BMW;
import com.vehicle.Generic;
import com.vehicle.Mercedes;
import com.vehicle.PSV;
import com.vehicle.Vehicle;

public class CarFactory {
	
	public Vehicle getInstance(String str) {

		if(str.equals("BMW"))
			return new BMW();
		else if(str.equals("Merc"))
			return new Mercedes();
		else if(str.equals("Vauxhall"))
			return new PSV();
		else
			return new Generic();
			
	}

}
