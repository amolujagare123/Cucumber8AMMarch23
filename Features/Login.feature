Feature: all login scenarios

  @login @valid
  Scenario: to test the functionality of login button for valid input
    Given I am on login page
   # When I enter correct username and correct Password
    When I enter username as "amolujagare@gmail.com" and password "admin123"
    And I click on login button
    Then I should be on dashboard
  #  And Page title should contain dashboard text

  @login @invalid @notBlank
  Scenario: to test the functionality of login button for invalid input
    Given I am on login page
  #  When I enter incorrect username and incorrect Password
    When I enter username as "xyz@gmail.com" and password "abcd"
    And I click on login button
    Then I should get An error

  @login @invalid @blank
  Scenario: to test the functionality of login button for blank input
    Given I am on login page
   # When I enter blank username and blank Password
    When I enter username as "" and password ""
    And I click on login button
    Then I should get Another error