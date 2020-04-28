package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountSummaryPage extends BasePage {

    @FindBy(xpath = "//h2[@class='board-header'][1]")
    private WebElement cashAccounts;

    public String getCashAccounts(){
        return cashAccounts.getText().toString().trim();
    }

    @FindBy(xpath = "//h2[@class='board-header'][2]")
    private WebElement investmentAccounts;

    public String getInvestmentAccounts(){
        return investmentAccounts.getText().toString().trim();
    }

    @FindBy(xpath = "//h2[@class='board-header'][3]")
    private WebElement creditAccounts;

    public String getCreditAccounts(){
        return creditAccounts.getText().toString().trim();
    }

    @FindBy(xpath = "//h2[@class='board-header'][4]")
    private WebElement loanAccounts;

    public String getLoanAccounts(){
        return loanAccounts.getText().toString().trim();
    }
}
