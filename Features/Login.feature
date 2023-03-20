Feature: all login scenarios

  Scenario: to test the functionality of login button for valid input
    Given I am on login page
    When I enter correct username and correct Password
    And I click on login button
    Then I should be on dashboard
