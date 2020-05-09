package com.exps.test;

import java.lang.reflect.Constructor;

import com.exps.sdp.Printer;

public class ReflectionAPITest5 {

	public static void main(String[] args) {
		Printer p = null, p1 = null;
		Class c = null;
		Constructor con[] = null;
		// get object
		p = Printer.getInstance();

		// OBJ creation by reflection API
		try {

			// Load Class
			c = Class.forName("com.exps.sdp.Printer");

			// get all the constructor of class
			con = c.getDeclaredConstructors();
			/*for (int i = 0; i < con.length; i++) {
				System.out.println("con["+i+"] : "+con[i]); /// (for myUnderstanding)
			}*/
			// access constructor
			con[1].setAccessible(true);

			// create object using new instance method
			p1 = (Printer) con[1].newInstance();
			System.out.println("Reflection_API_Test.main()");
			System.out.println(p.hashCode() + "   " + p1.hashCode());
			System.out.println("p==p1 ?:" + (p == p1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}