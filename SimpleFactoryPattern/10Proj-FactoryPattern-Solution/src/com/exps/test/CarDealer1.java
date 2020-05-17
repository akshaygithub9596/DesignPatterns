package com.exps.test;

import com.exps.Factory.CarFactory;
import com.exps.tyre.MechellinTyre;
import com.exps.tyre.Tyre;
import com.exps.vehicle.Car;
import com.exps.vehicle.LuxoryCar;

public class CarDealer1 {

	public static void main(String[] args) {
		System.out.println("Standard Car Dealer");
		Car car = null;

		// get Instance
		car = CarFactory.getCarInstance("Standard");
		car.roadTest();
	}
}