package com.exps.factory;

import com.exps.recruitment.DotNetFresher;
import com.exps.recruitment.Fresher;
import com.exps.recruitment.JavaFresher;
import com.exps.recruitment.PHPFresher;

public class FresherFactory {
	public static Fresher getInstance(String fresherType) {
		Fresher fresher = null;
		if (fresherType.equalsIgnoreCase("Java"))
			fresher = new JavaFresher();
		else if (fresherType.equalsIgnoreCase("DotNet"))
			fresher = new DotNetFresher();
		else if (fresherType.equalsIgnoreCase("PHP"))
			fresher = new PHPFresher();
		else
			throw new IllegalArgumentException("Invalid Input Type");
		return fresher;
	}
}
