package com.exps.builder;

import com.exps.foundation.IglooFoundation;
import com.exps.foundation.StoneFoundation;
import com.exps.interior.IceInterior;
import com.exps.interior.MarbelGraniteInterior;
import com.exps.product.House;
import com.exps.roofing.IglooRoofing;
import com.exps.roofing.SandStoneRoofing;
import com.exps.structure.IglooStructure;
import com.exps.structure.TallStoneStructure;

public class MarbleHouseBuilder implements HouseBuilder {
	private House house;

	public MarbleHouseBuilder(House house) {
		System.out.println("MarbleHouseBuilder.MarbleHouseBuilder(1-param)");
		this.house = house;
	}

	@Override
	public void buildBasement() {
		house.setFoundation(new StoneFoundation());
	}

	@Override
	public void buildStructure() {
		house.setStructure(new TallStoneStructure());
	}

	@Override
	public void buildRoofing() {
		house.setRoofing(new SandStoneRoofing());
	}

	@Override
	public void buildInterior() {
		house.setInterior(new MarbelGraniteInterior());
	}

	@Override
	public House buildHouse() {
		return house;
	}
}
