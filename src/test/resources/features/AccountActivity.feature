Feature: Account Activity
  @account_activity
  Scenario: Show transactions
    Given User is on the landing page
    When User signs in with credentials
    And User navigates to "Account Activity" tab
    And User verifies "Show Transactions"
    And User clicks on checking account
    Then verifies the car payment amount "1548"

