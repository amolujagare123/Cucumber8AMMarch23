Feature: All registration related scenarios

  @enquiry
  Scenario: To test the functionality of
  submit button for enquiry page

    Given I am on user enquiry page
    When I enter below data
      | Aditi | aditi@gmail.com | 9900099000 | Pune | Tell me more |
    And I click on submit
    Then enquiry should be submitted



    @userRegistration
  Scenario Outline: To test the functionality of
  submit button for user registration page

    Given I am on user registration page
    When I Enter <name> , <email> , <phone>
    And I click on register
    Then user should be submitted
      Examples:
        | name    | email             | phone |
        | Pradeep | Pradeep@gmail.com | 33333 |
        | Rama    | Raman@gmail.com   | 44444 |
        | Ramya   | Ramya@gmail.com   | 55555 |
        | Rutuja  | Rutuja@gmail.com  | 66666 |