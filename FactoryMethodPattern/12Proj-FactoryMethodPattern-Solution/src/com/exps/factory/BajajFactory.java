package com.exps.factory;

import com.exps.bike.BajajBike;

public abstract class BajajFactory {
	public abstract void paint();

	public abstract void assemble();

	public abstract void roadTest();

	public abstract void oiling();

	public abstract BajajBike createBajajBike(String model);

	public BajajBike manufactureBike(String model) {
		BajajBike bike = null;
		// get Bike
		bike = createBajajBike(model);
		System.out.println("Building "+model.toUpperCase()+" Bike");
		paint();
		assemble();
		roadTest();
		oiling();
		return bike;
	}
}
