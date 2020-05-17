package com.exps.vehicle;

import com.exps.tyre.Tyre;

public class LuxoryCar implements Car {
	private Tyre tyre = null;

	public LuxoryCar(Tyre tyre) {
		System.out.println("LuxoryCar.LuxoryCar()");
		this.tyre = tyre;
	}

	@Override
	public void roadTest() {
		System.out.println("LuxoryCar have "+tyre.info());
	}

}
