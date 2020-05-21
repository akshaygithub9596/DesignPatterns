package com.exps.test;

import com.exps.factory.HouseFactory;
import com.exps.product.House;

public class BuilderTest {
	public static void main(String[] args) {
		House house =null;
		house= HouseFactory.getInstance("Igloo");
		System.out.println(house);
	}
}
