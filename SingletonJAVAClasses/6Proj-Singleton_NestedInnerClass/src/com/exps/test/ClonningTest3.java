package com.exps.test;

import com.exps.sdp.Printer;

public class ClonningTest3 {

	public static void main(String[] args) {
		Printer p1 = null;
		Printer p2 = null;
		Printer p3 = null;
		p1 = Printer.getInstance();

		// do cloning
		try {
			p2 = (Printer) p1.clone();
			p3 = (Printer) p2.clone();
			System.out.println(p1.hashCode() + "____" + p2.hashCode() + "____" + p3.hashCode());
			System.out.println("p1==p2 " + (p1 == p2));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}