package com.exmps.sdp;

import com.exmps.commons.CommonsUtil;

public class Printer extends CommonsUtil {
	private static final long serialVersionUID = 345L; // recommended to take
	public static Printer INSTANCE;

	// private int a;
	// private constructor
	private Printer() {
		// no ops
	}

	// static factory method
	public static Printer getInstance() {
		if (INSTANCE == null) {// double null check
			synchronized (Printer.class) {// synchronized block
				if (INSTANCE == null)
					INSTANCE = new Printer();// lazy instantiation
			}
		}
		return INSTANCE;
	}

	/*// solving problem of cloning singleton (not recommended)
	public Object readResolve() {
		System.out.println("Printer.readResolve()");
		return INSTANCE;
	}*/

	// solving problem of cloning singleton ( recommended)
	public Object readResolve() {
		throw new IllegalArgumentException("DeSerialization is not allowed");
	}

}