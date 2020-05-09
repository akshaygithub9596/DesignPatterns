package com.exps.sdp;

import com.exps.commons.CommonUtils;

public class Printer extends CommonUtils {
	private static boolean flag = true;

	// private Constructor
	private Printer() {
		if(flag=true)
			throw new IllegalArgumentException("Object is aleady created");
		flag=true;
		System.out.println("Printer.Printer()");
	}

	// static factory method
	public static Printer getInstance() {
		return PrinterHolder.INSTANCE;
	}

	// b method
	public void printData(String data) {
		System.out.println("Printer.printData()::" + data);
	}

	// nested /static inner class
	private static class PrinterHolder {
		private static Printer INSTANCE = new Printer();
	}

	// to avoid clonning
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cloning Is not Allowed");

	}

	// to avoid deserialization

	public Object readResolve() {
		return PrinterHolder.INSTANCE;
		// throw new IllegalArgumentException("Deserialization is not Allowed");
	}
}
