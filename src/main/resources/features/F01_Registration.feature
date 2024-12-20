@regression

Feature: User could register with valid data

  Scenario: User register with valid data
    Given user navigates to registration page
    When user enters valid data
    And user click on register button
    Then user registered successfully