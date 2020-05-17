package com.exps.vehicle;

import com.exps.tyre.Tyre;

public class StandardCar implements Car {
	private Tyre tyre = null;

	public StandardCar(Tyre tyre) {
		System.out.println("StandardCar.StandardCar()");
		this.tyre = tyre;
	}

	@Override
	public void roadTest() {
		System.out.println("StandardCar have "+tyre.info());
	}

}
