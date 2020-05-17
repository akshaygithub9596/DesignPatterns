package com.exps.vehicle;

import com.exps.tyre.Tyre;

public class SportsCar implements Car {
	private Tyre tyre = null;

	public SportsCar(Tyre tyre) {
		System.out.println("SportsCar.SportsCar()");
		this.tyre = tyre;
	}

	@Override
	public void roadTest() {
		System.out.println("SportsCar have "+tyre.info());
	}
}
