package com.exmp.test;

import com.exmp.sdp.Printer;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		Printer p = null;
		p = Printer.getInstance();
		System.out.println(p.hashCode() + "_-_-_-_-_" + Thread.currentThread().getName());
	}

}
