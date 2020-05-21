package com.exps.builder;

import com.exps.foundation.IglooFoundation;
import com.exps.interior.IceInterior;
import com.exps.product.House;
import com.exps.roofing.IglooRoofing;
import com.exps.structure.IglooStructure;

public class IglooHouseBuilder implements HouseBuilder {
	private House house;

	public IglooHouseBuilder(House house) {
		System.out.println("IglooHouseBuilder.IglooHouseBuilder(1-param)");
		this.house = house;
	}

	@Override
	public void buildBasement() {
		house.setFoundation(new IglooFoundation());
	}

	@Override
	public void buildStructure() {
		house.setStructure(new IglooStructure());
	}

	@Override
	public void buildRoofing() {
		house.setRoofing(new IglooRoofing());
	}

	@Override
	public void buildInterior() {
		house.setInterior(new IceInterior());
	}

	@Override
	public House buildHouse() {
		return house;
	}
}
