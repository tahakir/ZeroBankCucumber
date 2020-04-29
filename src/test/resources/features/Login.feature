
Feature: Login
  @login_activity
  Scenario: Zero Bank Login
    Given User is on the landing page
    When User signs in with credentials
    Then User verifies the "Account Summary"
