package com.Test_NGnew;

import org.testng.annotations.Test;

public class Grouping_exp {
	
	@Test(groups = "costly")
	private void Apple() {
		System.out.println("Apple mobile");

	}
	
	@Test
	private void Moto() {
		System.out.println("Moto mobile");

	}
	
	@Test
	private void Huawei() {
		System.out.println("Huawei mobile");
	}
	
	@Test(groups = "costly")
	private void Samsung() {
		System.out.println("Samsung mobile");
	}

}
