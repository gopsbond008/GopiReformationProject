$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login function",
  "description": "",
  "id": "login-function",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate login function with valid credentials",
  "description": "",
  "id": "login-function;validate-login-function-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter username as \"me@thereformation.com\" and password as \"Password1\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should see the successful login page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_am_on_home_page()"
});
formatter.result({
  "duration": 18422878480,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_navigate_to_login_page()"
});
formatter.result({
  "duration": 123923,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "me@thereformation.com",
      "offset": 21
    },
    {
      "val": "Password1",
      "offset": 61
    }
  ],
  "location": "LoginStepDef.i_enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 6594891,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_should_see_the_successful_login_page()"
});
formatter.result({
  "duration": 35353,
  "status": "passed"
});
formatter.uri("registernewcustomer.feature");
formatter.feature({
  "line": 1,
  "name": "New Customer Registration",
  "description": "",
  "id": "new-customer-registration",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": ": Register New customer",
  "description": "",
  "id": "new-customer-registration;:-register-new-customer",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to registration page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I register new customer with \"\u003cemail\u003e\", \"\u003cpassword\u003e\", \"\u003cconfirmPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see successful registration page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "update profile with \"firstName\" and \"lastName\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "complete profile with date of birth",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "new-customer-registration;:-register-new-customer;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "confirmPassword"
      ],
      "line": 12,
      "id": "new-customer-registration;:-register-new-customer;;1"
    },
    {
      "cells": [
        "web3@reformation.com",
        "Password1",
        "Password1"
      ],
      "line": 13,
      "id": "new-customer-registration;:-register-new-customer;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": ": Register New customer",
  "description": "",
  "id": "new-customer-registration;:-register-new-customer;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to registration page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I register new customer with \"web3@reformation.com\", \"Password1\", \"Password1\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see successful registration page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "update profile with \"firstName\" and \"lastName\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "complete profile with date of birth",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDef.i_am_on_home_page()"
});
formatter.result({
  "duration": 14037961009,
  "status": "passed"
});
formatter.match({
  "location": "RegisterNewCustomerStepDef.i_navigate_to_registration_page()"
});
formatter.result({
  "duration": 1365146866,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "web3@reformation.com",
      "offset": 30
    },
    {
      "val": "Password1",
      "offset": 54
    },
    {
      "val": "Password1",
      "offset": 67
    }
  ],
  "location": "RegisterNewCustomerStepDef.i_register_new_customer_with(String,String,String)"
});
formatter.result({
  "duration": 2659018054,
  "status": "passed"
});
formatter.match({
  "location": "RegisterNewCustomerStepDef.i_should_see_successful_registration_page()"
});
formatter.result({
  "duration": 4630724153,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstName",
      "offset": 21
    },
    {
      "val": "lastName",
      "offset": 37
    }
  ],
  "location": "RegisterNewCustomerStepDef.update_profile_with_something_something(String,String)"
});
formatter.result({
  "duration": 1481170407,
  "status": "passed"
});
formatter.match({
  "location": "RegisterNewCustomerStepDef.complete_profile_with_date_of_birth_something_something_something()"
});
formatter.result({
  "duration": 2395418587,
  "status": "passed"
});
});