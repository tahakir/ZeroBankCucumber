package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
LoginPage loginPage=new LoginPage();

    @Given("User goes to landing page")
    public void user_goes_to_landing_page() {
        System.out.println("The user is on the homepage");
        BrowserUtilities.wait(2);
        loginPage.landingPage();
    }

    @When("User signs in with credentials")
    public void user_signs_in_with_credentials() {
        System.out.println("The user signs in");
        BrowserUtilities.wait(2);
        loginPage.setLoginBox();
        loginPage.setPasswordBox();
    }

    @Then("User verifies the {string}")
    public void user_verifies_the(String string) {
        System.out.println("Verification is processing");
        BrowserUtilities.wait(2);
        String expected="Account Summary";
        String actual=loginPage.accountSummaryText();
        Assert.assertEquals(actual,expected);
        System.out.println(string);
    }


}
