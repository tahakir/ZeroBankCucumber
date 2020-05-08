package com.zerobank.step_definitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PayBillsStepDefinitions {
    PayBillsPage payBillsPage=new PayBillsPage();

    @When("User completes a successful pay operation")
    public void user_completes_a_successful_pay_operation() {
        System.out.println("The user is making the payment...");
        payBillsPage.payAmount();
        payBillsPage.enterDate();
        payBillsPage.enterDescription();
        payBillsPage.payButton();
        BrowserUtilities.wait(2);
    }

    @Then("verifies {string}")
    public void verifies(String string) {
        System.out.println("The alert message...");
        BrowserUtilities.wait(2);
        Assert.assertEquals(string,payBillsPage.alertSuccessful());
        System.out.println(string);
    }


    @When("User fills out the other blanks for OperationOne")
    public void userFillsOutTheOtherBlanksForOperationOne() {
        System.out.println("Operation 1 is happening...");
        payBillsPage.enterDate();
        payBillsPage.enterDescription();
    }

    @And("User tries to make a payment without entering the amount")
    public void userTriesToMakeAPaymentWithoutEnteringTheAmount() {
        payBillsPage.payButton();
    }

    @Then("verifies payment alert")
    public void verifiesPaymentAlert() {
        String expected="Please fill out this field.";
        String actual=payBillsPage.alertFailed_1();
        Assert.assertEquals(actual,expected);
        System.out.println(actual);
    }

    @When("User fills out the other blanks for OperationTwo")
    public void userFillsOutTheOtherBlanksForOperationTwo() {
        System.out.println("Operation 2 is happening...");
        payBillsPage.payAmount();
        payBillsPage.enterDescription();
    }

    @And("User tries to make a payment without entering the date")
    public void userTriesToMakeAPaymentWithoutEnteringTheDate() {
        payBillsPage.payButton();
    }

    @Then("verifies date alert")
    public void verifiesDateAlert() {
        System.out.println("Verification...");
        String expected="Please fill out this field.";
        String actual=payBillsPage.alertFailed_2();
        Assert.assertEquals(actual,expected);
        System.out.println(actual);
    }


    @And("User tries to enter alphabetical or special characters into Amount")
    public void userTriesToEnterAlphabeticalOrSpecialCharactersIntoAmount() {
        System.out.println("The user entering illegal characters...");
        payBillsPage.specialCharacterAmount();
    }


    @When("User fills out the other blanks for OperationThree")
    public void userFillsOutTheOtherBlanksForOperationThree() {
        System.out.println("Operation 3 is happening...");
        payBillsPage.enterDate();
        payBillsPage.enterDescription();
        payBillsPage.payButton();
        BrowserUtilities.wait(3);

    }


    @Then("verifies should not receive a message")
    public void verifiesShouldNotReceiveAMessage() {
        System.out.println("The user should not receive any message");
    }

    @When("User fills out the other blanks for OperationFour")
    public void userFillsOutTheOtherBlanksForOperationFour() {
        System.out.println("Operation 4 is happening...");
        payBillsPage.payAmount();
        payBillsPage.enterDescription();

    }

    @And("User tries to enter alphabetical characters on Date")
    public void userTriesToEnterAlphabeticalCharactersOnDate() {
        payBillsPage.enterSpecialCharactersOnTheDate();
        payBillsPage.payButton();
    }
}
