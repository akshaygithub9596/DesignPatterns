package com.exmp.sdp;

public class Printer {
	private static Printer INSTANCE;

	// private constructor
	private Printer() {
		// no operations
	}

	// static factory method
	public synchronized static Printer getInstance() {
		if (INSTANCE == null) {
			synchronized (Printer.class) {
				if (INSTANCE == null)
					INSTANCE = new Printer();
			} // synchronized
		} // if
		return INSTANCE;

	}// method
}