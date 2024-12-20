@regression

Feature: Logged user could select different tags

  Scenario: Logged user select different tags
    When user hover on a main category
    And user select a sub category
    And user selects tag
    Then user get the result data with the chosen tag