package com.ebay.pages;

import com.pntautomation.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends TestBase {


    @FindBy(xpath = "//a[@id='create-account-link']")
    private WebElement createAnAccountButton;

    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement firstNameTab;

    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement lastNameTab;

    @FindBy(xpath = "//input[@id='Email']")
    private WebElement emailTab;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordTab;

    @FindBy(xpath = "//button[@id='EMAIL_REG_FORM_SUBMIT']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//a[@id=' switch-account-anchor']")
    private WebElement switchAccountButton;

    @FindBy(xpath = "//input[@id='userid']")
    private WebElement emailTabForLogin;

    @FindBy(xpath = "//button[@id='signin-continue-btn']")
    private WebElement continueButton;

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement passwordTabForLogin;

    @FindBy(xpath = "//button[@id='sgnBt']")
    private WebElement signInButtonForLogin;



    public void clickOncCreateAnAccountButton(){
        createAnAccountButton.click();
    }

    public void typeOnFirstNameTab(){
        firstNameTab.sendKeys("Test123");
    }

    public void typeOnLastNameTab(){
        lastNameTab.sendKeys("selenium");
    }

    public void typeOnEmailTab(){
        emailTab.sendKeys("nakiki097@gmail.com");
    }

    public void typeOnPasswordTab(){
        passwordTab.sendKeys("123456L");
    }

    public void clickOnCreateAccountButton(){
        createAccountButton.click();
    }

    public void clickOnSwitchAccountButton(){
        switchAccountButton.click();
    }

    public void typeOnEmailTabForLogin(){
       emailTabForLogin.sendKeys("nakiki097@gmail.com");
    }

    public void clickOnContinueButton(){
        continueButton.click();
    }

    public void typeOnPasswordTabForLogin(){
      passwordTabForLogin.sendKeys("123456L");
    }

    public void  clickOnSignInButtonForLogin(){
        signInButtonForLogin.click();
    }


}
