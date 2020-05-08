package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage{

    @FindBy(id = "sp_amount")
    private WebElement amount;

    public void payAmount(){
        amount.sendKeys("100");
    }

    public void specialCharacterAmount(){
        amount.sendKeys("?/jhskjdhf,amndnlwnscdcm$*&(");
    }


    @FindBy(id = "sp_date")
    private WebElement date;
    public void enterDate(){
        date.sendKeys("2020-07-12");
    }

    public void enterSpecialCharactersOnTheDate(){
        date.sendKeys("hgjhjdsgjsdbc^^$$S");
    }

    @FindBy(id = "sp_description")
    private WebElement description;

    public void enterDescription(){
        description.sendKeys("Phone Bill");
    }

    @FindBy(id = "pay_saved_payees")
    private WebElement pay;

    public void payButton(){
        pay.click();
    }

    @FindBy(id = "alert_content")
    private WebElement alert;
    public String alertSuccessful(){
        return alert.getText().toString();
    }

    public String alertFailed_1(){

        return (String)((JavascriptExecutor) driver).executeScript("return arguments[0].validationMessage;",amount );
    }

    public String alertFailed_2(){

        return (String)((JavascriptExecutor) driver).executeScript("return arguments[0].validationMessage;",date );
    }


}
