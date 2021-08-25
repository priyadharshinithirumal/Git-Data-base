package com.Test_NGnew;

import org.testng.annotations.Test;

public class Priority_example {

	@Test(priority = 0)
	private void distinction() {
		System.out.println("Passed exams with distinction");
	}
	
	@Test(priority = 1)
	private void firstclass() {
		System.out.println("Passed exams with firstclass");
	}
	
	@Test(priority = 2)
	private void secondclass() {
		System.out.println("Passed exams with secondclass");
	}
	
	@Test(priority = 3)
	private void arrear() {
		System.out.println("Obtained arrear");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
