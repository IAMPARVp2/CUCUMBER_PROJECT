@regression

Feature: Logged User could search for any product

  Scenario: Logged User search for a product
    When user search for a product "Apple MacBook Pro 13-inch"
    Then user got relative result of product searched for "Apple MacBook Pro 13-inch"