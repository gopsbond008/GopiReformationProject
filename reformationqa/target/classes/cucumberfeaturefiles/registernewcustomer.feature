Feature: New Customer Registration


  Scenario Outline: : Register New customer
    Given I am on home page
    When I navigate to registration page
    And I register new customer with "<email>", "<password>", "<confirmPassword>"
    Then I should see successful registration page
    And update profile with "firstName" and "lastName"
    And complete profile with date of birth
    Examples:
      | email               | password  | confirmPassword |
      | web3@reformation.com | Password1 | Password1      |