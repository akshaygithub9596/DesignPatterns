package com.exps.sdp;

import com.exps.commons.Utilty;

public enum Printer implements Utilty {
	INSTANCE;

	/*INSTANCE1; //Dont create more than one Constants, because it does eager Instantiation 
	 * 			and second object will  be wasted*/
	public void getData(String data) {
		System.out.println("Printer.getData()");
	}
}