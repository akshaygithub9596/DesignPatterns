package com.exps.test;

import com.exps.Factory.CarFactory;
import com.exps.vehicle.Car;

public class CarDealer3 {

	public static void main(String[] args) {
		System.out.println("Sports Car Dealer");
		Car car = null;

		// get Instance
		car = CarFactory.getCarInstance("Sports");
		car.roadTest();

	}
}