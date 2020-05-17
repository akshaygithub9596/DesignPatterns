package com.exps.test;

import com.exps.bike.BajajBike;
import com.exps.factory.BajajFactory;
import com.exps.factory.ChennaiFactory;

public class SouthCustomer {

	public static void main(String[] args) {
		System.out.println("South Customer");
		BajajFactory factory = null;
		BajajBike bike = null;
	// get Bike
		factory= new ChennaiFactory();
		bike=factory.manufactureBike("pulsor");
		bike.drive();
	}

}
