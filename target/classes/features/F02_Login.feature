@regression

Feature: User could log in with valid data

  Scenario: User login with valid data
    Given user navigates to login page
    When user enters email "m_emad@gmail.com" and password "123456"
    And user click on login button
    Then user log in successfully
    And user go to home page