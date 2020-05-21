package com.exps.director;

import com.exps.builder.HouseBuilder;
import com.exps.product.House;

public class CivilEngineer {
	private HouseBuilder builder;

	public CivilEngineer(HouseBuilder builder) {
		System.out.println("CivilEngineer.CivilEngineer(1-param)");
		this.builder = builder;
	}

	// defines the constructor process
	public House constructHouse() {
		House house = null;
		builder.buildBasement();
		builder.buildStructure();
		builder.buildRoofing();
		builder.buildInterior();
		house = builder.buildHouse();
		return house;
	}
}
