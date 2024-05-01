package com.nt.comps;

public class AtherElectricBike implements Bike {

	public AtherElectricBike() {
		System.out.println("AtherElectricBike.AtherElectricBike() 0 param contructor called");
	}
	@Override
	public void drive() {
		System.out.println("AtherElectricBike.drive() called");

	}

}
