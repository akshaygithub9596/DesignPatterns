package com.exps.recruitment;

public class JavaFresher extends Fresher{

	@Override
	public boolean conductTechnicalInterview() {
System.out.println("JavaFresher.conductTechnicalInterview()");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
System.out.println("JavaFresher.conductSystemTest()");
		return true;
	}

}
