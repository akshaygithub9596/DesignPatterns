package com.exps.factory;

import com.exps.bike.BajajBike;
import com.exps.bike.Discover;
import com.exps.bike.Platina;
import com.exps.bike.Pulsor;

public class ChennaiFactory extends BajajFactory {
	public void paint() {
		System.out.println("ChennaiFactory.paint()");
	}

	public void assemble() {
		System.out.println("ChennaiFactory.asssemble()");
	}

	public void roadTest() {
		System.out.println("ChennaiFactory.roadTest()");
	}

	public void oiling() {
		System.out.println("ChennaiFactory.oiling()");
	}

	public BajajBike createBajajBike(String model) {
		BajajBike bike = null;
		if (model.equalsIgnoreCase("pulsor")) {
			bike = new Pulsor();
			System.out.println("Creating Pulsor");
		} else if (model.equalsIgnoreCase("discover")) {
			bike = new Discover();
			System.out.println("Creating Discover");
		} else if (model.equalsIgnoreCase("platina")) {
			bike = new Platina();
			System.out.println("Creating Platina");
		} else
			throw new IllegalArgumentException("Wrong Input");
		return bike;
	}
}
