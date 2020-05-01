
Feature: Login

  Background:
    Given User is on the landing page


  @login_activity_valid
  Scenario: Zero Bank Valid Login
    When User signs in with credentials
    Then User verifies the "Account Summary"


  @login_activity_invalid
  Scenario: Zero Bank Invalid Login
    When User signs in with invalid
    Then User verifies the warning text "Login and/or password are wrong."