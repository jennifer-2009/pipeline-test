package com.test.Autoamtion;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.Autoamtion.pages.HomePage;

public class ClosePopupTest extends BaseTest {

	@Test
	public void closeRegionPopup() {

		HomePage home = new HomePage(driver);

		home.selectRegion("ON");
		home.closeEmailOffer();

		boolean emailOfferVisible = home.isEmailOfferGone();

		Assert.assertTrue(emailOfferVisible);

	}

}
