@regression

Feature: Logged user could could filter with color

  Scenario: Logged user filter with color
    When user hover on a main category
    And user select a sub category
    And user selects color
    Then user get the result data with the chosen color