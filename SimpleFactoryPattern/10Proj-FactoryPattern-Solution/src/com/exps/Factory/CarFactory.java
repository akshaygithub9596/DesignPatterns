package com.exps.Factory;

import com.exps.tyre.ApolloTyre;
import com.exps.tyre.MRFTyre;
import com.exps.tyre.MechellinTyre;
import com.exps.tyre.Tyre;
import com.exps.vehicle.Car;
import com.exps.vehicle.LuxoryCar;
import com.exps.vehicle.SportsCar;
import com.exps.vehicle.StandardCar;

public class CarFactory {
	//static factory method
	public static Car getCarInstance(String carType) {
		Car car = null;
		Tyre tyre = null;
		if (carType.equalsIgnoreCase(CarType.TYPE_STANDARD)) {
			tyre = new ApolloTyre();
			car = new StandardCar(tyre);
		} else if (carType.equalsIgnoreCase(CarType.TYPE_LUXORY)) {
			tyre = new MechellinTyre();
			car = new LuxoryCar(tyre);
		} else if (carType.equalsIgnoreCase(CarType.TYPE_SPORTS)) {
			tyre = new MRFTyre();
			car = new SportsCar(tyre);
		} else
			throw new IllegalArgumentException("Invalid car Type"); 
		return car;
	}
}