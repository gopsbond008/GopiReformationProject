package com.qa.pages;


import com.qa.pageobjectrepo.PageObjectRepo;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage extends PageObjectRepo {

    private static By LOGIN_LINK = By.cssSelector("a[href*='profile']");
    private static By verifyLoginPage = By.cssSelector(".headline");
    private static By EMAIL_TEXTBOX = By.cssSelector("#at-spree_user_email-field");
    private static By PASSWORD_TEXTBOX = By.cssSelector("#at-spree_user_password-field");
    private static By LOGIN_BUTTON = By.cssSelector("#at-signin-button");
    private static By verifyLoginSuccessfulPage = By.cssSelector(".app-title");

    public void goToLoginPageAndVerify(){
        action.clickElement(LOGIN_LINK);
        Assert.assertEquals("Sign in", action.getElementText(verifyLoginPage));
    }
    public void loginWithValidDetails(String username, String password){
        action.sendKeysToElement(EMAIL_TEXTBOX, username);
        action.sendKeysToElement(PASSWORD_TEXTBOX, password);
        action.clickElement(LOGIN_BUTTON);
    }

    public void verifyLoginSuccessfulPage(){
        Assert.assertEquals("About you", action.getElementText(verifyLoginSuccessfulPage));

    }

}
