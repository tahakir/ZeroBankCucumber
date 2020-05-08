@account_activity_navigation
Feature: Navigating to specific accounts in Accounts Activity

  Background:
    Given User is on the landing page
    When User signs in with credentials

  @saving_account_redirect
  Scenario: Savings account redirect

    When the user clicks on "Savings" link on the "Account Summary" page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Savings" selected

  @brokerage_account_redirect
  Scenario: Brokerage account redirect

    When the user clicks on "Brokerage" link on the "Account Summary" page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Brokerage" selected

  @checking_account_redirect
  Scenario: Checking account redirect

    When the user clicks on "Checking" link on the "Account Summary" page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Checking" selected

  @credit_account_redirect
  Scenario: Credit Card account redirect

    When the user clicks on "Credit Card" link on the "Account Summary" page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Credit Card" selected

  @loan_account_redirect
  Scenario: Loan account redirect

    When the user clicks on "Loan" link on the "Account Summary" page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Loan" selected