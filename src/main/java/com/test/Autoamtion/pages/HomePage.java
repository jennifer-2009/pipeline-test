package com.test.Autoamtion.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

	protected WebDriver driver;

	private static String region_css = "#region-radio-buttons [name='region']";
	private static String set_region_css = "#language-region-set";
	private static String email_no_thank_css = "button#closeEmailPopup";

	public HomePage(WebDriver driver) {

		super(driver);
	}

	public HomePage selectRegion(String region) {

		List<WebElement> list = utils.waitElements(region_css);

		for (WebElement ele : list) {

			if (ele.getAttribute("value").equals(region)) {

				ele.click();
				break;
			}
		}

		utils.click(set_region_css);

		utils.waitElementGone(set_region_css);

		return this;
	}

	public HomePage closeEmailOffer() {

		utils.click(email_no_thank_css);

		return this;
	}

	public boolean isEmailOfferGone() {

		return utils.waitElementGone(email_no_thank_css);
	}

	public boolean isSetRegionGone() {

		return utils.waitElementGone(set_region_css);
	}

}
