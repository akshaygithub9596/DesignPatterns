package com.nt.sdp;

public class Printer {
//	private static Printer INSTANCE = new Printer();// eager instantiation==wrong-practice
	private static Printer INSTANCE;

	/*static {
		INSTANCE= new Printer();// eager instantiation== wrong-practice
	}*/

	// private constructor
	private Printer() {
		// no operations
		//System.out.println("Printer.Printer()");
	}

	/*	public static Printer getInstance() {
			return INSTANCE;
		}
	*/

	// static factory method
	public static Printer getInstance() {
		if (INSTANCE == null)
			INSTANCE = new Printer();// Lazy Instantiation-Good Practice
		return INSTANCE;
	}

	// business method
	public void printData(String data) {
		System.out.println(data);
	}
}