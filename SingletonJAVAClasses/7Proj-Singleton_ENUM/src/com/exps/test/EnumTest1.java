package com.exps.test;

import com.exps.sdp.Printer;

public class EnumTest1 {

	public static void main(String[] args) {
		Printer p1 = null, p2 = null;
		p1 = Printer.INSTANCE;
		p2 = Printer.INSTANCE;
		
		System.out.println(p1.hashCode() + " === " + p2.hashCode());
		System.out.println("(p1==p2 ?)" + (p1 == p2));

	}

}