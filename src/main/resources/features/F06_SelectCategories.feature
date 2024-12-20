@regression

Feature: Logged user could select different Categories

  Scenario: Logged user select different Categories
    When user hover on a main category
    And user select a sub category
    Then user navigate to category page