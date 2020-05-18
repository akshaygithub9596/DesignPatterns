package com.exps.recruitment;

public class DotNetFresher extends Fresher{

	@Override
	public boolean conductTechnicalInterview() {
System.out.println("DotNetFresher.conductTechnicalInterview()");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
System.out.println("DotNetFresher.conductSystemTest()");
		return true;
	}

}
