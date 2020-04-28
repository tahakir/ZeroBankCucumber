
Feature: Login
  @login_activity
  Scenario: Zero Bank Login
    Given User goes to landing page
    When User signs in with credentials
    Then User verifies the "Account Summary"
