package com.exps.sdp;

import com.exps.commons.CommonsUtil;

public class Printer extends CommonsUtil {
	private static Printer INSTANCE;

	// private constructor
	private Printer() {
		// no operations
	}

	// static factory method
	public static Printer getInstance() {
		if (INSTANCE == null) {// double null check
			synchronized (Printer.class) {
				if (INSTANCE == null)
					INSTANCE = new Printer();// lazy instantiation
			}
		}
		return INSTANCE;
	}

	// business method
	public void dataPrinter(String data) {
		System.out.println(data);
	}

	// solving problem of cloning singleton (recommended)
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clonning is not supported");
	}

	// solving problem of cloning singleton (not recommended)
	/*@Override
	public Object clone() throws CloneNotSupportedException {
		//return INSTANCE;
		return this;
	}*/
}
