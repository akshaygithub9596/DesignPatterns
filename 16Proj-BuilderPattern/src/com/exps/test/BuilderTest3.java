package com.exps.test;

import com.exps.factory.HouseFactory;
import com.exps.product.House;

public class BuilderTest3 {
	public static void main(String[] args) {
		House house =null;
		house= HouseFactory.getInstance("Wooden");
		System.out.println(house);
	}
}
