package com.exmps.test;

import java.lang.reflect.Constructor;

import com.exmps.sdp.Printer;

public class Reflection_API_Test {

	public static void main(String[] args) {

		Printer p1 = null, p2 = null;
		Class c = null;
		Constructor con[] = null;

		// get Object
		p1 = Printer.getInstance();
		// OBJ creation by reflection API
		try {
			// Load Class
			c = Class.forName("com.exmps.sdp.Printer");
			// get all the constructor of class
			con = c.getDeclaredConstructors();
			// access constructor
			con[0].setAccessible(true);
			// create object using new instance method
			p2 = (Printer) con[0].newInstance();
			System.out.println("Reflection_API_Test.main()");
			System.out.println(p1.hashCode() + "   " + p2.hashCode());
			System.out.println("p1==p2 ?:"+(p1==p2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
