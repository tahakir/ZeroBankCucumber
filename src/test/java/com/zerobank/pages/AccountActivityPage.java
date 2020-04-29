package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityPage extends BasePage {

    @FindBy(xpath = "//h2[@class='board-header']")
    private WebElement h2Text;
    @FindBy(id = "aa_accountId")
    private WebElement accountType;
    @FindBy(xpath = "//tbody//tr[3]/td[4]")
    private WebElement carPayment;

    public String getH2Text(){
       return h2Text.getText();
    }
    public void selectAccountType(){
        Select select=new Select(accountType);
        select.selectByVisibleText("Checking");
    }

    public String getCarPayment(){
        return carPayment.getText().toString();

    }



}
