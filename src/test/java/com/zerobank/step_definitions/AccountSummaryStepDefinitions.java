package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefinitions {
    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
    @Then("Verifies subheads")
    public void verifies_subheads(List<String> dataTable) {

        System.out.println("Verification is progressing...");
        accountSummaryPage.getGetAllsubheads();

    }
}
