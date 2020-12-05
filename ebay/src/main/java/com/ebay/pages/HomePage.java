package com.ebay.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(id = "gh-ac")
    private WebElement searchBar;

    @FindBy(id = "gh-btn")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id='gh-ug']/a")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@id='gh-ug-flex']/a")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@id='gh-p-1']/a")
    private WebElement dailyDealsButton;

    @FindBy(xpath = "//a[@data-sp='m570.l47233']")
    private WebElement brandOutletButton;

    @FindBy(xpath = "//*[@id='gh-p-3']/a")
    private WebElement helpAndContactButton;

    @FindBy(xpath = "//*[@id='gh-p-2']/a")
    private WebElement sellButton;

    @FindBy(xpath = "//*[@id='gh-wl-click']/div/a[1]")
    private WebElement watchlistButton;

    @FindBy(xpath = "//*[@id='gh-eb-My']/div/a[1]")
    private WebElement myEbayButton;

    @FindBy(id = "gh-Alerts-i")
    private WebElement notificationButton;

    @FindBy(css = "#gh-minicart-hover > div > a.gh-eb-li-a > svg")
    private WebElement cartButton;


    public void typeOnSearchBar() {
        searchBar.sendKeys("Java books");
    }


    public void clickOnSearchButton() {
        searchButton.click();
    }


    public void clickOnSignInButton() {
        signInButton.click();
    }


    public void clickOnregisterButton() {
        registerButton.click();
    }

    public void clickOnDailyDealsButton() {
        dailyDealsButton.click();
    }

    public void clickOnBrandOutletButton() {
        brandOutletButton.click();
    }

    public void clickOnHelpAndContactButton() {
        helpAndContactButton.click();
    }

    public void clickOnSellButton() {
        sellButton.click();
    }

    public void clickOnWatchlistButton() {
        watchlistButton.click();
    }

    public void clickOnmyEbayButton() {
        myEbayButton.click();
    }

    public void clickOnNotificationButton() {
        notificationButton.click();
    }

    public void clickOnCartButton() {
        cartButton.click();
    }


}
