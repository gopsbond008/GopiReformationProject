Feature: Login function

  Scenario: Validate login function with valid credentials
    Given I am on home page
    When I navigate to login page
    And I enter username as "me@thereformation.com" and password as "Password1"
    Then I should see the successful login page