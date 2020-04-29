@account_summary
Feature: Account Summary

  Scenario:Verification of subheads
    Given User is on the landing page
    When User signs in with credentials
    Then Verifies subheads
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |