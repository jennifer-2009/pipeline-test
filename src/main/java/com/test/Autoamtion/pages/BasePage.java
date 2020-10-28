package com.test.Autoamtion.pages;

import org.openqa.selenium.WebDriver;

import com.test.Autoamtion.util.WebDriverUtils;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverUtils utils;

	public BasePage(WebDriver driver) {

		this.driver = driver;
		utils = new WebDriverUtils(driver);
	}

}
