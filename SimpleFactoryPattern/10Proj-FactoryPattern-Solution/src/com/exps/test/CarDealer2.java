package com.exps.test;

import com.exps.Factory.CarFactory;
import com.exps.vehicle.Car;

public class CarDealer2 {

	public static void main(String[] args) {
		System.out.println("Luxory Car Dealer");
		Car car = null;

		// get Instance
		car = CarFactory.getCarInstance("Luxory");
		car.roadTest();
	}
}