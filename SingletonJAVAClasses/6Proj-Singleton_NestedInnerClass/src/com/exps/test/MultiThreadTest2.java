package com.exps.test;

import com.exps.commons.TicketBookingServlet;

public class MultiThreadTest2 {

	public static void main(String[] args) {
		Thread thread1 = null, thread2 = null;
		TicketBookingServlet servlet = null;

		servlet = new TicketBookingServlet();
		thread1 = new Thread(servlet);
		thread2 = new Thread(servlet);

		thread1.run();
		thread2.run();
	}

}
