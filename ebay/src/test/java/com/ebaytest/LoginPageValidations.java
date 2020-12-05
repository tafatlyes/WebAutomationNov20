package com.ebaytest;

import com.ebay.pages.HomePage;
import com.ebay.pages.LoginPage;
import com.pntautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageValidations extends TestBase {



    @Test(enabled = false)
    public void validateUserBeingAbleToCreateAnAccount(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.clickOnSignInButton();
        loginPage.clickOncCreateAnAccountButton();
        loginPage.typeOnFirstNameTab();
        loginPage.typeOnLastNameTab();
        loginPage.typeOnEmailTab();
        loginPage.typeOnPasswordTab();

    }

    @Test
    public void validateUserBeingAbleToLogInWithValidCredentials() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.clickOnSignInButton();
        loginPage.clickOnSwitchAccountButton();
        loginPage.typeOnEmailTabForLogin();
        loginPage.clickOnContinueButton();
        loginPage.typeOnPasswordTabForLogin();
        loginPage.clickOnSignInButtonForLogin();
    }



}
