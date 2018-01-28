package com.qa.stepdefinitions;

import com.qa.pageobjectrepo.PageObjectRepo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends PageObjectRepo {


    @When("^I navigate to login page$")
    public void i_navigate_to_login_page() throws Throwable {
      //  loginPage.goToLoginPageAndVerify();


    }

    @And("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_enter_username_as_and_password_as(String username, String password) throws Throwable {
      //  loginPage.loginWithValidDetails(username, password);


    }

    @Then("^I should see the successful login page$")
    public void i_should_see_the_successful_login_page() throws Throwable {
      //  loginPage.verifyLoginSuccessfulPage();


    }

}
