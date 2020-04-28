package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class AccountActivityStepDefinitions {
    LoginPage loginPage=new LoginPage();
    AccountActivityPage accountActivityPage=new AccountActivityPage();

    @When("User navigates to {string} tab")
    public void user_navigates_to_tab(String string) {
        BrowserUtilities.waitForPageToLoad(10);
        loginPage.navigateTo(string);

    }

    @When("User verifies {string}")
    public void user_verifies(String string) {
        String expected=string.toString();
        String actual=accountActivityPage.getH2Text();
        BrowserUtilities.waitForPageToLoad(10);
        Assert.assertEquals(actual,expected);

    }

    @When("User clicks on checking account")
    public void user_clicks_on_checking_account() {
        System.out.println("User is selecting the account type:");
        BrowserUtilities.wait(2);
        BrowserUtilities.waitForPageToLoad(10);
        accountActivityPage.selectAccountType();

    }

    @Then("verifies the car payment amount {string}")
    public void verifiesTheCarPaymentAmount(String payment) {
        System.out.println("Car Payment verifications");
        BrowserUtilities.wait(4);
        Assert.assertEquals(payment,accountActivityPage.getCarPayment());

    }
}
