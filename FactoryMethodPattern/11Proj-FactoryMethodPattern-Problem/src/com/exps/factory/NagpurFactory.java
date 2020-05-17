package com.exps.factory;

import com.exps.bike.BajajBike;
import com.exps.bike.Discover;
import com.exps.bike.Platina;
import com.exps.bike.Pulsor;

public class NagpurFactory {

	public static void assemble() {
		System.out.println("NagpurFactory.asssemble()");
	}

	public static void paint() {
		System.out.println("NagpurFactory.paint()");
	}

	public static void roadTest() {
		System.out.println("NagpurFactory.roadTest()");
	}

	public static BajajBike createBike(String model) {
		BajajBike bike = null;
		if (model.equalsIgnoreCase("pulsor")) {
			bike = new Pulsor();
			System.out.println("Creating Pulsor");
		} else if (model.equalsIgnoreCase("discover")) {
			bike = new Discover();
			System.out.println("Creating Discove");
		} else if (model.equalsIgnoreCase("platina")) {
			bike = new Platina();
			System.out.println("Creating Platina");
		} else
			throw new IllegalArgumentException("Wrong Input");

		assemble();
		paint();
		roadTest();
		return bike;
	}
}
