package com.exps.test;

import com.exps.tyre.ApolloTyre;
import com.exps.tyre.Tyre;
import com.exps.vehicle.Car;
import com.exps.vehicle.StandardCar;

public class CarDealer3 {

	public static void main(String[] args) {
		System.out.println("Standard Car Dealer");
		Tyre tyre = null;
		Car car = null;
		tyre = new ApolloTyre();
		car = new StandardCar(tyre);
		car.roadTest();
	}
}