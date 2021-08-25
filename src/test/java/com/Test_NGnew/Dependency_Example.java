package com.Test_NGnew;

import org.testng.annotations.Test;

public class Dependency_Example {
	
	@Test
	private void primary() {
		System.out.println("Passed primary");
	}
	
	@Test(dependsOnMethods = "primary")
	private void secondary() {
		System.out.println("Passed secondary");
	}
	
	@Test(dependsOnMethods = "secondary")
	private void highschool() {
		System.out.println("Passed highschool");
	}
	
	@Test(dependsOnMethods = "highschool")
	private void Engineering() {
		System.out.println("Passed Engineering");
	}

}
