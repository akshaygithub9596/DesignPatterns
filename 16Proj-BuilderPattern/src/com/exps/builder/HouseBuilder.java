package com.exps.builder;

import com.exps.product.House;

// builder interface 
public interface HouseBuilder {
	public void buildBasement();

	public void buildStructure();

	public void buildRoofing();

	public void buildInterior();

	public House buildHouse();
}
