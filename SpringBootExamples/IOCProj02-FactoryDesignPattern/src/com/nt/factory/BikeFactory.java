package com.nt.factory;
import com.nt.comps.AtherElectricBike;
import com.nt.comps.Bike;
import com.nt.comps.HarleyDawidsonBike;
import com.nt.comps.HeroHondaBike;

public class BikeFactory {

	public static Bike orderBike(String type) {
		// TODO Auto-generated method stub
		Bike bike =null;
		
		if (type.equalsIgnoreCase("luxury")) {
			bike = new HarleyDawidsonBike();
			
		}else if(type.equalsIgnoreCase("standard")) {
			bike = new HeroHondaBike();
			
		}else if(type.equalsIgnoreCase("electric")) {
			bike = new AtherElectricBike();
		}
		else {
			throw new IllegalArgumentException("invalid bike type");
		}
		
		return bike;

	}

}
