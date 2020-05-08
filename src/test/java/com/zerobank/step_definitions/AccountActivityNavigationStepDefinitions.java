package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityNavigationPage;
import com.zerobank.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountActivityNavigationStepDefinitions {
    AccountActivityNavigationPage accountActivityNavigationPage=new AccountActivityNavigationPage();


    @When("the user clicks on {string} link on the {string} page")
    public void the_user_clicks_on_link_on_the_page(String string, String string2) {
        System.out.printf("The user is clicking on %s and %s ",string,string2);
        accountActivityNavigationPage.navigateTo(string);


    }

    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String string) {
        BrowserUtilities.wait(2);
        accountActivityNavigationPage.getTabName(string);





    }

    @And("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {
        System.out.println("Verifying the "+string);
        BrowserUtilities.wait(2);
        System.out.println(accountActivityNavigationPage.defaultOption());


    }

}
