Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct email and password
    Given I navigate to the login page of facebook
    And I enter the email as "lawhornejake@gmail.com" and password as "uattesting"
    And I click the login button
    Then I should see the user home page