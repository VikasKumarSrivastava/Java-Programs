package com.nt.main;

import java.util.Scanner;

import com.nt.comps.Bike;
import com.nt.factory.BikeFactory;

public class TestingFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("give your bike type: ");
		String type=sc.nextLine();
		
		Bike bike = BikeFactory.orderBike(type);
		bike.drive();
		sc.close();
	}

}
