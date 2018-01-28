Feature: Add products to basket

  Scenario: Add Multiple products to basket
    Given I am on homepage
    When I add multiple products to basket via search
      |Products Code |132344454   |
      |Products Type |boots       |
      |Products Brand|TU          |


    Then I should see products in basket