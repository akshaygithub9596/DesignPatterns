package com.exps.recruitment;

public class PHPFresher extends Fresher{

	@Override
	public boolean conductTechnicalInterview() {
System.out.println("PHPFresher.conductTechnicalInterview()");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
System.out.println("PHPFresher.conductSystemTest()");
		return true;
	}

}
