package com.sample.productTest;

import org.testng.annotations.Test;

public class Classictest {
	
	@Test
	public void testing() {
		System.out.println("This is experemental");
		String browser = System.getProperty("browser");
		String enviorment = System.getProperty("env");
		
		System.out.println("BROWSER=======>"+browser);
		System.out.println("enviorment=======>"+enviorment);
		System.out.println("execute createProductWithNAmeTest");
	}

}
