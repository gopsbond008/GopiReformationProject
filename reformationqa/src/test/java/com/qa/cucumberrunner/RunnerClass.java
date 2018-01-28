package com.qa.cucumberrunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"./src/main/resources/cucumberfeaturefiles"},
        glue = {"com.qa.stepdefinitions"},
        plugin = {"html:target/cucumber-html-report","json:target/cucumber.json"}
)
public class RunnerClass {
}
