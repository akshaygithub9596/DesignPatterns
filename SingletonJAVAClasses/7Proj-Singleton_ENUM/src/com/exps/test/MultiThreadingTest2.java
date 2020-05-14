package com.exps.test;

import com.exps.commons.TicketBookingServlet;;

public class MultiThreadingTest2 {
	public static void main(String[] args) {
		TicketBookingServlet servlet = null;

		Thread thread1 = null;
		Thread thread2 = null;

		thread1.start();
		thread2.start();

	}
}
