package com.exps.test;

import com.exps.tyre.MRFTyre;
import com.exps.tyre.Tyre;
import com.exps.vehicle.Car;
import com.exps.vehicle.SportsCar;

public class CarDealer2 {

	public static void main(String[] args) {

		System.out.println("Sports Car Dealer");
		Tyre tyre = null;
		Car car = null;
		tyre = new MRFTyre();
		car = new SportsCar(tyre);
		car.roadTest();
	}
}