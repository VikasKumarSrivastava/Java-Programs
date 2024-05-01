package com.nt.comps;

public class HarleyDawidsonBike implements Bike {
	
	public HarleyDawidsonBike() {
		System.out.println("HarleyDawidsonBike.HarleyDawidsonBike() 0 param constructor");
	}

	@Override
	public void drive() {
		System.out.println("HarleyDawidsonBike.drive() called");
	}
}
