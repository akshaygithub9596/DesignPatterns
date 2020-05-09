package com.exmps.sdp;

import com.exmps.commons.CommonUtils;

public class Printer extends CommonUtils{
	private static Printer INSTANCE;
	private static boolean flag = false;

//private constructor 
	private Printer() {
		if (flag == true)
			throw new IllegalArgumentException("Object is already Created");
		flag = true;
		System.out.println("Printer.Printer()");
	}

//static factory method
	public static Printer getInstance() {
		// double null check
		if (INSTANCE == null) {
			// synchronized block
			synchronized (Printer.class) {
				if (INSTANCE == null) {
					INSTANCE = new Printer(); // lazy instantiation
				}
			}
		}
		return INSTANCE;
	}

	public void getData(String data) {
		System.out.println(data);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clonning is not supported");
	}

	public Object readResolve() {
		throw new IllegalArgumentException("DeSerialization is not allowed");
	}
}
