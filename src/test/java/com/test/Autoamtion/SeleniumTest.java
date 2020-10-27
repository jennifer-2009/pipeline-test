package com.test.Autoamtion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	private static String baseURL = "https://www.costco.ca/";
	
	@Test
	public void CostcoHomePageTest() {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(baseURL);
		
		
	}

}
