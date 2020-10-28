package com.test.Autoamtion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	protected WebDriver driver;
	private static String baseURL = "https://www.costco.ca/";

	@BeforeTest
	public void init() {

		driver = initChromeDriver();

		driver.manage().window().maximize();

		driver.get(baseURL);
	}

	@AfterTest
	public void tearDown() {

		driver.quit();

	}

	private WebDriver initChromeDriver() {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

		return new ChromeDriver();
	}

}
