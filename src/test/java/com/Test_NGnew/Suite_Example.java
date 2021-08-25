package com.Test_NGnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suite_Example {
	
	WebDriver driver;
	
	
	@BeforeSuite
	private void launch_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\HOME\\\\eclipse-workspace\\\\selenium\\\\driver\\\\chromedriver(new).exe");
		driver=new ChromeDriver();
		
	}
	
	@Test
	private void google() {
		driver.get("https://www.google.com/");
		
	}
	
	@Test
	private void youtube() {
		driver.get("https://www.youtube.com/");

	}
	
	@Test
	private void instagram() {
		driver.get("https://www.instagram.com/?hl=en");
	}

	
	@AfterSuite
	private void close() {
		driver.quit();
	}
}
