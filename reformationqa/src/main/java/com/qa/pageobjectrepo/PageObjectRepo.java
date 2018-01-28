package com.qa.pageobjectrepo;

import com.qa.actions.ActionsClass;
import com.qa.pages.*;
import com.qa.testdata.TestBase;
import com.qa.utils.TestUtils;
import org.openqa.selenium.WebDriver;



public class PageObjectRepo {

    public static WebDriver driver;
    public static TestBase testBase = new TestBase();
    public static ActionsClass action = new ActionsClass();
    public static HomePage homePage=new HomePage();
    public static SearchPage searchPage=new SearchPage();
    public static ChangePasswordPage changePasswordPage = new ChangePasswordPage();
    public static TestUtils utils = new TestUtils();
    public static ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    public static BasketPage basketPage = new BasketPage();
    public static LoginPage loginPage = new LoginPage();
    public static MyAccountPage myAccountPage = new MyAccountPage();
    public static RegisterNewCustomer registerNewCustomer = new RegisterNewCustomer();

}
