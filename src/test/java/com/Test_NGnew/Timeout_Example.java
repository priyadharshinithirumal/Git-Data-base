package com.Test_NGnew;

import org.testng.annotations.Test;

public class Timeout_Example {

	
	@Test
	public void sampleTestCase(){
			System.out.println("Im ready to execute");
		}
	
	@Test(timeOut=1000) // specify time in milliseconds
	public void executetimeOut() throws InterruptedException{
             Thread.sleep(500);
             System.out.println("PASSED");
	}   
	
	@Test(timeOut=1000) // specify time in milliseconds
	public void executetimeOut1() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("PASSED1");
	}

	
	
}
