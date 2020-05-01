package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;


public class AccountActivityStepDefinitions {
    LoginPage loginPage=new LoginPage();
    AccountActivityPage accountActivityPage=new AccountActivityPage();



    @And("User navigates to {string} tab")
    public void userNavigatesTo(String module) {
        accountActivityPage.navigateTo(module);
    }


    @Then("User verifies {string} as default select")
    public void userVerifiesAsDefaultSelect(String defaultText) {
        System.out.println("Verifying the "+defaultText);
        Assert.assertEquals(accountActivityPage.defaultOption(),defaultText);
        BrowserUtilities.wait(2);
    }


    @And("Account dropdown should have these following options")
    public void accountDropdownShouldHaveTheseFollowingOptions(List<String> dropdownOptions) {
        System.out.println("Verifying: "+dropdownOptions);
        BrowserUtilities.wait(2);
        Assert.assertEquals(dropdownOptions,accountActivityPage.dropDownOptions());

    }

    @Then("verifies table should have column names")
    public void verifiesTableShouldHaveColumnNames(List<String> columnNames) {
        System.out.println("Column names are: "+columnNames);
        BrowserUtilities.wait(2);
        Assert.assertEquals(columnNames,accountActivityPage.columnNames());

    }
}
