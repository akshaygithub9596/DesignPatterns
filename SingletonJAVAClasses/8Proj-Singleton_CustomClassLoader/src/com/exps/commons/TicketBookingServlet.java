package com.exps.commons;

import com.exps.sdp.Printer;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		Printer p = null;
		p = Printer.getInstance();
		System.out.println("Current Thread : " + Thread.currentThread().getName() + " " + p.hashCode());
	}
}