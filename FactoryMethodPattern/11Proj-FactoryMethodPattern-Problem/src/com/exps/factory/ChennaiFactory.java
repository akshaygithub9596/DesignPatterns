package com.exps.factory;

import com.exps.bike.BajajBike;
import com.exps.bike.Discover;
import com.exps.bike.Platina;
import com.exps.bike.Pulsor;

public class ChennaiFactory {

	public static void oiling() {
		System.out.println("ChennaiFactory.oiling()");
	}

	public static void assemble() {
		System.out.println("ChennaiFactory.asssemble()");
	}

	public static void paint() {
		System.out.println("ChennaiFactory.paint()");
	}

	public static void roadTest() {
		System.out.println("ChennaiFactory.roadTest()");
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
		paint();
		assemble();
		oiling();
		roadTest();
		return bike;
	}
}
