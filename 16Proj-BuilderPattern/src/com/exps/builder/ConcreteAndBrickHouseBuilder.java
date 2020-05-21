package com.exps.builder;

import com.exps.foundation.ConcreteFoundation;
import com.exps.interior.WoodenInterior;
import com.exps.product.House;
import com.exps.roofing.ConcreteSlabRoofing;
import com.exps.structure.ConcreteAndSteelStructure;

public class ConcreteAndBrickHouseBuilder implements HouseBuilder {
	private House house;

	public ConcreteAndBrickHouseBuilder(House house) {
		System.out.println("ConcreteAndBrickHouseBuilder.ConcreteAndBrickHouseBuilder(1param)");
		this.house = house;
	}

	@Override
	public void buildBasement() {
		house.setFoundation(new ConcreteFoundation());
	}

	@Override
	public void buildStructure() {
		house.setStructure(new ConcreteAndSteelStructure());
	}

	@Override
	public void buildRoofing() {
		house.setRoofing(new ConcreteSlabRoofing());
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
