package com.zerobank.step_definitions;



import com.zerobank.pages.FindTransactionsPage;
import com.zerobank.utilities.BrowserUtilities;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FindTransactionsStepDefinitions {
    FindTransactionsPage findTransactionsPage=new FindTransactionsPage();

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        findTransactionsPage.navigateTo("Account Activity");
        findTransactionsPage.navigateTo("Find Transactions");
    }

    @When("the user enters date range from “{int}-{int}-{int}” to “{int}-{int}-{int}”")
    public void the_user_enters_date_range_from_to(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {
        findTransactionsPage.enterDateFrom(int1,int2,int3);
        findTransactionsPage.enterToDate(int4,int5,int6);
    }

    @When("clicks search")
    public void clicks_search() {
        findTransactionsPage.clickFindButton();
    }

    @Then("results table should only show transactions dates between “{int}-{int}-{int}” to “{int}-{int}-{int}”")
    public void results_table_should_only_show_transactions_dates_between_to(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {
        System.out.println("Showing only these transactions...");
        BrowserUtilities.wait(2);
        System.out.println(findTransactionsPage.getFirstDate());
        BrowserUtilities.wait(2);
        System.out.println(findTransactionsPage.getSecondDate());
        BrowserUtilities.wait(2);
        System.out.println(findTransactionsPage.getThirdDate());

    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        System.out.println("Transactions are being sorted...");

    }

    @Then("the results table should only not contain transactions dated “{int}-{int}-{int}”")
    public void the_results_table_should_only_not_contain_transactions_dated(Integer int1, Integer int2, Integer int3) {
        System.out.println("The results table should only not contain transactions dated...");
        BrowserUtilities.wait(2);
        System.out.println(findTransactionsPage.getFirstDate());
        BrowserUtilities.wait(2);
        System.out.println(findTransactionsPage.getSecondDate());
    }

    @When("the user changes the date range from “{int}-{int}-{int}” to “{int}-{int}-{int}”")
    public void theUserChangesTheDateRangeFromTo(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {
        findTransactionsPage.cleanDateFrom();
        BrowserUtilities.wait(1);
        findTransactionsPage.enterDateFrom(int1,int2,int3);
        findTransactionsPage.cleanDateTo();
        BrowserUtilities.wait(1);
        findTransactionsPage.enterToDate(int4,int5,int6);
    }



    @Then("results table should only show transactions changed dates between “{int}-{int}-{int}” to “{int}-{int}-{int}”")
    public void resultsTableShouldOnlyShowTransactionsChangedDatesBetweenTo(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {
        System.out.println("Showing only these transactions...");
        BrowserUtilities.wait(2);
        System.out.println(findTransactionsPage.getFirstDate());
        BrowserUtilities.wait(2);
        System.out.println(findTransactionsPage.getSecondDate());

    }


    @When("the user enters description {string}")
    public void theUserEntersDescription(String arg0) {
        findTransactionsPage.setDescription(arg0);
    }

    @Then("results table should only show descriptions containing {string}")
    public void resultsTableShouldOnlyShowDescriptionsContaining(String arg0) {
        BrowserUtilities.wait(2);
        String x=findTransactionsPage.getTableOnline();
        Assert.assertTrue(x.contains(arg0));
        BrowserUtilities.wait(2);

    }

    @Then("results table should only show descriptions containing the {string}")
    public void resultsTableShouldOnlyShowDescriptionsContainingThe(String arg0) {
        BrowserUtilities.wait(2);
        String x=findTransactionsPage.getTableOnline();
        Assert.assertTrue(x.contains(arg0));
        BrowserUtilities.wait(2);

    }

    @When("the user enters description the {string}")
    public void theUserEntersDescriptionThe(String arg0) {
        findTransactionsPage.cleanTable();
        findTransactionsPage.setDescription(arg0);
    }


    @Then("results table should show at least one result under the {string}")
    public void resultsTableShouldShowAtLeastOneResultUnderThe(String arg0) {
        System.out.println("The table is showing the result "+arg0);
       findTransactionsPage.getDepositSide();
    }

    @Then("results table should show at least one result under {string}")
    public void resultsTableShouldShowAtLeastOneResultUnder(String arg0) {
        System.out.println("The table is showing the result "+arg0);
        findTransactionsPage.getWithdrawalSide();
    }

    @When("user selects type {string}")
    public void userSelectsType(String arg0) {
        System.out.println("Selecting...."+arg0);
        findTransactionsPage.setType(arg0);

    }

    @But("results table should show no result under {string}")
    public void resultsTableShouldShowNoResultUnder(String arg0) {


    }

    @But("results table should show no result under the {string}")
    public void resultsTableShouldShowNoResultUnderThe(String arg0) {

    }
}
