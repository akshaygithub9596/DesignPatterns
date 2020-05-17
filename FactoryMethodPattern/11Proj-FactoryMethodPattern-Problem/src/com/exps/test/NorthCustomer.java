package com.exps.test;

import com.exps.bike.BajajBike;
import com.exps.factory.NagpurFactory;

public class NorthCustomer {

	public static void main(String[] args) {
		BajajBike bike = null;
		bike= NagpurFactory.createBike("pulsor");
	}

}
