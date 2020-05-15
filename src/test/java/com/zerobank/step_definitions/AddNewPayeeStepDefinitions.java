package com.zerobank.step_definitions;

import com.zerobank.pages.AddNewPayeePage;
import com.zerobank.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class AddNewPayeeStepDefinitions {

    AddNewPayeePage addNewPayeePage = new AddNewPayeePage();

    @Given("User navigates to {string} submodule")
    public void user_navigates_to_submodule(String string) {
        addNewPayeePage.navigateToSubModule(string);
        BrowserUtilities.wait(2);
    }

    @And("creates new payee using following information:")
    public void createsNewPayeeUsingFollowingInformation(Map<String,String> dataTable) {
        System.out.println(dataTable);

            addNewPayeePage.addPayeeName(dataTable.get("Payee Name"));
            addNewPayeePage.addPayeeAddress(dataTable.get("Payee Address"));
            addNewPayeePage.addAccount(dataTable.get("Account"));
            addNewPayeePage.addPayeeDetails(dataTable.get("Payee details"));
            addNewPayeePage.addButtonClick();
    }


    @Then("message {string} should be displayed\"")
    public void message_should_be_displayed(String string) {
        addNewPayeePage.getAlertMessage(string);

    }



}