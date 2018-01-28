package com.qa.pages;

import com.qa.pageobjectrepo.PageObjectRepo;
import org.junit.Assert;
import org.openqa.selenium.By;

public class RegisterNewCustomer extends PageObjectRepo {
        private static By REGISTER_BUTTON = By.cssSelector("#at-signup-link");
        private static By verifyRegistrationPage = By.cssSelector(".register.account-panel h2.headline");
        private static By EMAIL_TEXTBOX = By.cssSelector("input[name='spree_user[email]']");
        private static By PASSWORD_TEXTBOX = By.cssSelector("input[name='spree_user[password]']");
        private static By CONFIRM_PASSWORD_TEXTBOX = By.cssSelector("input[name='spree_user[password_confirmation]']");
        private static By CONFIRM_REGISTRATION_BUTTON = By.cssSelector("#join-button");
        private static By verifyRegistrationConfirmation = By.cssSelector(".app-description");
        private static By FIRSTNAME_TEXTBOX = By.cssSelector("#at-firstname-field");
        private static By LASTNAME_TEXTBOX = By.cssSelector("#at-lastname-field");
        private static By BIRTH_DATE = By.cssSelector("#at-select-day");
        private static By BIRTH_MONTH = By.cssSelector("#at-select-month");
        private static By BIRTH_YEAR = By.cssSelector("#at-select-year");
        private static By SELECT_DOB = By.cssSelector(".active");
        private static By SELECT_DATE = By.cssSelector("#at-option-1");
        private static By SELECT_MONTH = By.cssSelector("#at-option-jan");
        private static By SELECT_YEAR = By.cssSelector("#at-option-2017");
        private static By PROFILE_UPDATE_BUTTON = By.cssSelector("input[type='submit']");
        private static By verifyProfilrUpdate = By.cssSelector("#flash-message");

    public void goToRegistrationPageAndVerify(){
        loginPage.goToLoginPageAndVerify();
        action.clickElement(REGISTER_BUTTON);
        utils.waitForSeconds();
        Assert.assertEquals("Join the Reformation", action.getElementText(verifyRegistrationPage));
    }
    public void registerWithValidDetails(String email, String password, String confirmPassword){
        action.sendKeysToElement(EMAIL_TEXTBOX, email);
        action.sendKeysToElement(PASSWORD_TEXTBOX, password);
        action.sendKeysToElement(CONFIRM_PASSWORD_TEXTBOX, confirmPassword);
        action.clickElement(CONFIRM_REGISTRATION_BUTTON);
    }
    public void verifyNewCustomerRegistration(){
        Assert.assertEquals("Stay current! Manage your personal information and edit your email settings.", action.getElementText(verifyRegistrationConfirmation));

    }
    public void updateFirstNameAndLastaNameInProfile(String firstname, String lastname){
        action.sendKeysToElement(FIRSTNAME_TEXTBOX, firstname);
        action.sendKeysToElement(LASTNAME_TEXTBOX, lastname);

    }
    public void updateDateOfBirth(){  //int date, int month, int year
        action.clickElement(BIRTH_MONTH);
        action.clickElement(SELECT_MONTH);
        action.clickElement(BIRTH_DATE);
        action.clickElement(SELECT_DATE);
        action.clickElement(BIRTH_YEAR);
        action.clickElement(SELECT_YEAR);
        action.clickElement(PROFILE_UPDATE_BUTTON);
    }
    public void verifyProfileUpdateMessage(){
        Assert.assertEquals("Account updated", action.getElementText(verifyProfilrUpdate));
    }
}
