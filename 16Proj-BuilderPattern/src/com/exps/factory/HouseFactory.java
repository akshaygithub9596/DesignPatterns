package com.exps.factory;

import com.exps.builder.ConcreteAndBrickHouseBuilder;
import com.exps.builder.HouseBuilder;
import com.exps.builder.IglooHouseBuilder;
import com.exps.builder.MarbleHouseBuilder;
import com.exps.builder.WoodenHouseBuilder;
import com.exps.director.CivilEngineer;
import com.exps.product.House;

public class HouseFactory {

	public static House getInstance(String houseType) {

		House house = null;
		CivilEngineer engineer = null;
		HouseBuilder builder = null;

		if (houseType.equalsIgnoreCase("wooden")) {
			builder = new WoodenHouseBuilder(new House());
		} else if (houseType.equalsIgnoreCase("Concrete")) {
			builder = new ConcreteAndBrickHouseBuilder(new House());
		} else if (houseType.equalsIgnoreCase("igloo")) {
			builder = new IglooHouseBuilder(new House());
		} else if (houseType.equalsIgnoreCase("stone")) {
			builder = new MarbleHouseBuilder(new House());
		} else
			throw new IllegalArgumentException("Invalid House Type");

		engineer = new CivilEngineer(builder);
		house = engineer.constructHouse();
		return house;
	}
}
