package com.exps.test;

import com.exps.tyre.MechellinTyre;
import com.exps.tyre.Tyre;
import com.exps.vehicle.Car;
import com.exps.vehicle.LuxoryCar;

public class CarDealer1 {

	public static void main(String[] args) {
		System.out.println("Luxory Car Dealer");
		Tyre tyre = null;
		Car car = null;
		tyre = new MechellinTyre();
		car = new LuxoryCar(tyre);
		car.roadTest();
	}
}