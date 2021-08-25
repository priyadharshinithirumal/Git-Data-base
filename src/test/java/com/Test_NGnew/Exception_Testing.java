package com.Test_NGnew;

import org.testng.annotations.Test;

public class Exception_Testing {
	int i;
	@Test(expectedExceptions = ArithmeticException.class)
	private void ExceptionTesting() {
		i=10/0;
		System.out.println("print value of i="+i);

	}
}
