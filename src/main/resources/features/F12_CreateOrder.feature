@regression

Feature: User could create successful Order

  Scenario: User create successful Order
    When user navigate to shopping cart page
    And user accept the terms of service
    And user click on checkout button
    And user fill the billing address data
    And user continue with default values
    And user confirm the order
    Then user create a successful order