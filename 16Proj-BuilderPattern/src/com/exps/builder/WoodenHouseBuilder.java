package com.exps.builder;

import com.exps.foundation.WoodenFoundation;
import com.exps.interior.WoodenInterior;
import com.exps.product.House;
import com.exps.roofing.WoodenRoofing;
import com.exps.structure.WoodenStructure;

public class WoodenHouseBuilder implements HouseBuilder {
	private House house;

	public WoodenHouseBuilder(House house) {
		System.out.println("WoodenHouseBuilder.WoodenHouseBuilder(1param)");
		this.house = house;
	}

	@Override
	public void buildBasement() {
		house.setFoundation(new WoodenFoundation());
	}

	@Override
	public void buildStructure() {
		house.setStructure(new WoodenStructure());
	}

	@Override
	public void buildRoofing() {
		house.setRoofing(new WoodenRoofing());
	}

	@Override
	public void buildInterior() {
		house.setInterior(new WoodenInterior());
	}

	@Override
	public House buildHouse() {
		return house;
	}
}
