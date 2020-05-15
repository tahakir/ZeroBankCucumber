package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddNewPayeePage extends BasePage{


    @FindBy(id = "np_new_payee_name")
    private WebElement payeeNameBox;

    public void addPayeeName(String payeeName){
        payeeNameBox.sendKeys(payeeName);
        BrowserUtilities.wait(2);
    }

    @FindBy(id = "np_new_payee_address")
    private WebElement payeeAddressBox;

    public void addPayeeAddress(String payeeAddress){
        payeeAddressBox.sendKeys(payeeAddress);
        BrowserUtilities.wait(2);
    }

    @FindBy(id = "np_new_payee_account")
    private WebElement accountBox;

    public void addAccount(String account){
        accountBox.sendKeys(account);
        BrowserUtilities.wait(2);
    }

    @FindBy(id = "np_new_payee_details")
    private WebElement payeeDetailsBox;

    public void addPayeeDetails(String payeeDetails){
        payeeDetailsBox.sendKeys(payeeDetails);
        BrowserUtilities.wait(2);
    }

    @FindBy(id = "add_new_payee")
    private WebElement addButton;
    public void addButtonClick(){
        addButton.click();
        BrowserUtilities.wait(2);
    }

    @FindBy(id = "alert_content")
    private WebElement alertMessage;

    public String getAlertMessage(String message){
        BrowserUtilities.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(alertMessage));
        return alertMessage.getText().trim();
    }
}
