package com.exps.test;

import com.exps.factory.HouseFactory;
import com.exps.product.House;

public class BuilderTest4 {
	public static void main(String[] args) {
		House house =null;
		house= HouseFactory.getInstance("Stone");
		System.out.println(house);
	}
}
