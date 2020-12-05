package com.ebaytest;

import com.ebay.pages.HomePage;
import com.pntautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {



    @Test(enabled = false)
    public void validateUserBeingAbleToTypeOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearchButton();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnSignInButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnRegisterButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnregisterButton();
    }


    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnDailyDealsButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnDailyDealsButton();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnBrandOutletButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnBrandOutletButton();
    }


    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnHelpAndContactButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnHelpAndContactButton();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnSellButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSellButton();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnWatchlistButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnWatchlistButton();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnmyEbayButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnmyEbayButton();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnNotificationButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnNotificationButton();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnCartButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnCartButton();
    }

}
