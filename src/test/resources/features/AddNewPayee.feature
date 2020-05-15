Feature: Add new payee under pay bills

  Background:
    Given User is on the landing page
    When User signs in with credentials
    And  User navigates to "Pay Bills" tab

  @add_new_payee
  Scenario:  Add a new payee

    Given User navigates to "Add New Payee" submodule
    And creates new payee using following information:

      | Payee Name    | The Law Offices of Hyde, Price & Scharks |
      | Payee Address | 100 Same st, Anytown, USA, 10001         |
      | Account       | Checking                                 |
      | Payee details | XYZ account                              |
    Then message "The new payee The Law Offices of Hyde, Price & Scharks was successfully created." should be displayed"