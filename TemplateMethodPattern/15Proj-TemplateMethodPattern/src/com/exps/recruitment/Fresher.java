package com.exps.recruitment;

public abstract class Fresher {
	public boolean conductAptitudeTest() {
		System.out.println("Fresher :: Conducting Apttude Test");
		return true;
	}

	public boolean conductGDTest() {
		System.out.println("Fresher :: Conducting GD Test");
		return true;
	}

	public abstract boolean conductTechnicalInterview();

	public abstract boolean conductSystemTest();

	public boolean conductHRInterview() {
		System.out.println("Fresher :: Conducting HR Interview");
		return true;
	}

	// template method
	public boolean fresherRecruitmentDrive() {
		boolean flag = false;
		flag = conductAptitudeTest();
		if (flag)
			flag = conductGDTest();
		if (flag)
			flag = conductTechnicalInterview();
		if (flag)
			flag = conductSystemTest();
		if (flag)
			flag = conductHRInterview();
		return flag;
	}
}
