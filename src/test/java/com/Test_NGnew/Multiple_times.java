package com.Test_NGnew;

import org.testng.annotations.Test;

public class Multiple_times {
	
	@Test(invocationCount = 10)
	private void Login() {
		System.out.println("Username=TEST");
        System.out.println("Password=PASS");

	}
	

}
