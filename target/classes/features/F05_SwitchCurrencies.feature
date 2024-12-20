@regression

Feature: Logged User could switch between currencies US-Euro

  Scenario: Logged User switch between currencies US-Euro
    When user choose a currency from the dropdown on the top left
    Then user change currency and the price of products converts to the new currency symbol
