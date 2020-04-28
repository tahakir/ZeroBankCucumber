package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AccountSummaryStepDefinitions {
    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
    @Then("Verifies subheads")
    public void verifies_subheads() {
        System.out.println("Verification is progressing...");
        Assert.assertEquals(accountSummaryPage.getCashAccounts(),"Cash Accounts");
        Assert.assertEquals(accountSummaryPage.getCreditAccounts(),"Credit Accounts");
        Assert.assertEquals(accountSummaryPage.getInvestmentAccounts(),"Investment Accounts");
        Assert.assertEquals(accountSummaryPage.getLoanAccounts(),"Loan Accounts");


    }
}
