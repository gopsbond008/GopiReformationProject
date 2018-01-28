package com.qa.stepdefinitions;

import com.qa.pageobjectrepo.PageObjectRepo;
import cucumber.api.java.en.Given;

public class HomePageStepDef extends PageObjectRepo {


    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {
        homePage.navigateToHomepageAndVerify();


    }

}
