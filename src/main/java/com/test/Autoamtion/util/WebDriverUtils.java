package com.test.Autoamtion.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {

	private WebDriver driver;
	private WebDriverWait wait;
	private int dynamicWaitTime = 15;

	public WebDriverUtils(WebDriver driver) {

		this.driver = driver;
		this.wait = new WebDriverWait(driver, dynamicWaitTime);
	}

	public WebElement waitElement(String css) {

		return wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(css)));
	}

	public boolean tillElementVisible(String css) {

		try {

			wait.until(ExpectedConditions.elementToBeSelected(By.cssSelector(css)));
			return true;
		} catch (Exception e) {

			// Reporter.log(".....Error - unable to find the WebElement by => " + css + "
			// <=");
		}

		return false;
	}

	public List<WebElement> waitElements(String css) {

		if (tillElementVisible(css)) {

			return driver.findElements(By.cssSelector(css));
		} else {

			// Reporter.log(".....Error - unable to find the WebElement List by => " + css +
			// " <=");
		}

		return null;
	}

	public void click(String css) {

		waitElement(css).click();
	}

	public boolean waitElementGone(String css) {

		return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(css)));
	}

}
