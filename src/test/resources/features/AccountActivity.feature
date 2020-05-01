@account_activity
Feature: Account Activity

  Background:
    Given User is on the landing page
    When User signs in with credentials
    And User navigates to "Account Activity" tab


  @show_transactions
  Scenario: Show transactions
    Then User verifies "Savings" as default select
    And Account dropdown should have these following options
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |

  @column_names
  Scenario: Transactions table
    Then verifies table should have column names
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |


