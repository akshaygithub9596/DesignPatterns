package com.exps.test;

import com.exps.bike.BajajBike;
import com.exps.factory.ChennaiFactory;

public class SouthCustomer {

	public static void main(String[] args) {
		BajajBike bike = null;
		bike= ChennaiFactory.createBike("pulsor");
	}

}
