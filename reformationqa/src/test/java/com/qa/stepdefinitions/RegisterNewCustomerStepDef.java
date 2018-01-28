package com.qa.stepdefinitions;

import com.qa.pageobjectrepo.PageObjectRepo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterNewCustomerStepDef extends PageObjectRepo{

    @When("^I navigate to registration page$")
    public void i_navigate_to_registration_page() throws Throwable {
        registerNewCustomer.goToRegistrationPageAndVerify();

    }

    @And("^I register new customer with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void i_register_new_customer_with(String email, String password, String confirmPassword) throws Throwable {
        registerNewCustomer.registerWithValidDetails(email, password, confirmPassword);

    }

    @Then("^I should see successful registration page$")
    public void i_should_see_successful_registration_page() throws Throwable {
        registerNewCustomer.verifyNewCustomerRegistration();
    }


    @And("^update profile with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void update_profile_with_something_something(String firstname, String lastname) throws Throwable {
        registerNewCustomer.updateFirstNameAndLastaNameInProfile(firstname, lastname);
    }
    @And("^complete profile with date of birth$") //"([^"]*)", "([^"]*)", "([^"]*)\  int date, int month, int year  date, month, year
    public void complete_profile_with_date_of_birth_something_something_something() throws Throwable {
        registerNewCustomer.updateDateOfBirth();

    }
}
