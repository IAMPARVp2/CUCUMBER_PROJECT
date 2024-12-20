Feature: User could reset his/her password successfully

  Scenario: User reset password with new password
    Given user navigates to login page
    And user clicks on Forgot password? button
    When user enters valid email
    And user click on recover button
    Then user confirms that this message is displayed "Email with instructions has been sent to you."