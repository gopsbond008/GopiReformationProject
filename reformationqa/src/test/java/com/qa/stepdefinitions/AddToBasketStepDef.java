package com.qa.stepdefinitions;

import com.qa.pageobjectrepo.PageObjectRepo;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToBasketStepDef extends PageObjectRepo {

    @Given("^I am on homepage$")
    public void i_am_on_homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I add multiple products to basket via search$")
    public void i_add_multiple_products_to_basket_via_search(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)


    }

    @Then("^I should see products in basket$")
    public void i_should_see_products_in_basket() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
}
