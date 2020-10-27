package com.test.Autoamtion;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNGTest {
	
	@Test
	public void addTest() {
		
		System.out.println("hello world !");
		
		Assert.assertEquals(1, 1);
	}

}
