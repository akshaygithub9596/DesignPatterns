package com.exps.commons;

import com.exps.sdp.Printer;

public class TicketBookingServlet implements Runnable, Cloneable {

	@Override
	public void run() {
		Printer p = null;
		p = Printer.INSTANCE;
		System.out.println(p.hashCode() + "----->" + Thread.currentThread().getName());
	}

}
