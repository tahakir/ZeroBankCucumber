@find_transactions
Feature: Find Transactions in Account Activity

  Background:
    Given User is on the landing page
    When User signs in with credentials
    Given the user accesses the Find Transactions tab

@search_date_range
  Scenario: Search date range

    When the user enters date range from “2012-9-1” to “2012-9-6”
    And clicks search
    Then results table should only show transactions dates between “2012-9-1” to “2012-9-6”
    And the results should be sorted by most recent date
    When the user changes the date range from “2012-9-2” to “2012-9-6”
    And clicks search
    Then results table should only show transactions changed dates between “2012-9-2” to “2012-9-6”
    And the results table should only not contain transactions dated “2012-9-1”

  @search_description
  Scenario: Search description

    When the user enters description "ONLINE"
    And clicks search
    Then results table should only show descriptions containing "ONLINE"
    When the user enters description the "OFFICE"
    And clicks search
    Then results table should only show descriptions containing the "OFFICE"

    @search_description_case
  Scenario: Search description case insensitive

    When the user enters description "ONLINE"
    And clicks search
    Then results table should only show descriptions containing "ONLINE"
    When the user enters description "online"
    And clicks search
    Then results table should only show descriptions containing "ONLINE"

      @search_type
  Scenario: Type

    And clicks search
    Then results table should show at least one result under Deposit
    Then results table should show at least one result under Withdrawal
    When user selects type “Deposit”
    Then results table should show at least one result under Deposit
    But results table should show no result under Withdrawal
    When user selects type “Withdrawal”
    Then results table should show at least one result under Withdrawal
    But results table should show no result under Deposit