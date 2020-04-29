package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefinitions {
LoginPage loginPage=new LoginPage();

    @Given("User is on the landing page")
    public void userIsOnTheLandingPage() {
        loginPage.landingPage();
        BrowserUtilities.wait(2);
    }

    @When("User signs in with credentials")
    public void user_signs_in_with_credentials() {
        System.out.println("The user signs in");

        loginPage.login("username","password");

    }

    @When("If User logs in with wrong credentials, should receive a warning message saying {string}")
    public void if_User_logs_in_with_wrong_credentials_should_receive_a_warning_message_saying(String message) {
        loginPage.getWarningText();
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


    @Then("Verifies Get warning message")
    public void verifiesGetWarningMessage() {
        System.out.println("Warning message verification");
        String expected="Login and/or password are wrong.";
        Assert.assertEquals(loginPage.getWarningText(),expected);
    }


}
