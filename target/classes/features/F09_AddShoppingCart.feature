@regression

Feature: Logged user could add different products to Shopping cart

  Scenario: Logged user add different products to Shopping cart
    When user add a product to shopping cart
    And user add another product to shopping cart
    And user navigate to shopping cart page
    Then user get the added products on the shopping cart