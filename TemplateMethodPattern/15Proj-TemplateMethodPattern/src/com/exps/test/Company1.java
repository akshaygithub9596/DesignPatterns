package com.exps.test;

import com.exps.factory.FresherFactory;
import com.exps.recruitment.Fresher;

public class Company1 {

	public static void main(String[] args) {
		Fresher fresher = null;
		boolean flag = false;
		fresher = FresherFactory.getInstance("Java");
		flag = fresher.fresherRecruitmentDrive();
		if (flag)
			System.out.println("Fresher Recruited");
		else
			System.out.println("Fresher Failed in Recruitment");
	}

}
