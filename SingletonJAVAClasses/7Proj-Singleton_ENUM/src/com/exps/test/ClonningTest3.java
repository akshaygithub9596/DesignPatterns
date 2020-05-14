package com.exps.test;

import com.exps.sdp.Printer;

public class ClonningTest3 {

	public static void main(String[] args) {
		Printer p1 = null;
		Printer p2 = null;
		Printer p3 = null;
		p1 = Printer.INSTANCE;
		/*try {
			p2 = (Printer) p1.clone();
			p3 = (Printer) p2.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		/*here, though you try to cloning like Directly calling clone() or by writing user dfined methd 
		 * in printer class and calling clone() in that method will still not work because the clone() of 
		 * java.lang.Enum class is always throwing CloneNotSupportedException   
		*/ }

}
