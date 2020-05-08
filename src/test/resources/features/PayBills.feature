@pay_bills
Feature: Pay Bills

  Background:
    Given User is on the landing page
    When User signs in with credentials
    And User navigates to "Pay Bills" tab


    @successful_payment
  Scenario:Successfully Pay Operation
    When User completes a successful pay operation
    Then verifies "The payment was successfully submitted."

  @failed_payment_1
    Scenario: Failed Pay Operation 1

    When User fills out the other blanks for OperationOne
    And User tries to make a payment without entering the amount
    Then  verifies payment alert

  @failed_payment_2
  Scenario: Failed Pay Operation 2

    When User fills out the other blanks for OperationTwo
    And   User tries to make a payment without entering the date
    Then  verifies date alert

  @failed_payment_3
  Scenario: Failed Pay Operation 3

    When User fills out the other blanks for OperationThree
    And User tries to enter alphabetical or special characters into Amount
    Then verifies should not receive a message

  @failed_payment_4
  Scenario: Failed Pay Operation 4

    When User fills out the other blanks for OperationFour
    And User tries to enter alphabetical characters on Date
    Then verifies should not receive a message

