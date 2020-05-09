package com.exps.test;

import com.exps.sdp.Printer;

public class InnerClassTest1 {

	public static void main(String[] args) {
		Printer p1 = null, p2 = null;
		p1 = Printer.getInstance();
		p2 = Printer.getInstance();
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println("p1==p2 ?" + "  " + (p1 == p2));
		p1.printData("hello");
	}

}
