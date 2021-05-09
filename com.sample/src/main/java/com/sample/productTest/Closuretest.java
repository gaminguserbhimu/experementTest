package com.sample.productTest;

import org.testng.annotations.Test;

public class Closuretest {
	
	@Test
	public void testing() {
		System.out.println("This is new experemental");
		String browser = System.getProperty("browser");
		String enviorment = System.getProperty("env");
		
		System.out.println("BROWSER=======>"+browser);
		System.out.println("enviorment=======>"+enviorment);
		System.out.println("execute createProductWithNAmeTest");
	}

}
