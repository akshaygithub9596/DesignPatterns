package com.exps.test;

import com.exps.bike.BajajBike;
import com.exps.factory.BajajFactory;
import com.exps.factory.NagpurFactory;

public class NorthCustomer {

	public static void main(String[] args) {
		System.out.println("North Customer");
		BajajFactory factory = null;
		BajajBike bike = null;
		// get Bike
		factory = new NagpurFactory();
		bike = factory.manufactureBike("platina");
		bike.drive();
	}

}
