package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FindTransactionsPage extends BasePage {

    @FindBy(id = "aa_fromDate")
    private WebElement dateFrom;
    public void enterDateFrom(Integer int1, Integer int2, Integer int3){
       wait.until(ExpectedConditions.visibilityOf(dateFrom)).sendKeys(int1+"-"+int2+"-"+int3);
    }
    public void cleanDateFrom(){
        dateFrom.clear();
    }



    @FindBy(id = "aa_toDate")
    private WebElement dateTo;
    public void enterToDate(Integer int4, Integer int5, Integer int6){
        wait.until(ExpectedConditions.visibilityOf(dateTo)).sendKeys(int4+"-"+int5+"-"+int6);
    }
    public void cleanDateTo(){
        dateTo.clear();
    }

    @FindBy(xpath = "//*[@id=\"find_transactions_form\"]/div[2]/button")
    private WebElement findButton;
    public void clickFindButton(){
        BrowserUtilities.wait(2);
        BrowserUtilities.clickWithJS(findButton);
    }
    @FindBy(xpath = "//*[@id=\"filtered_transactions_for_account\"]/table/tbody/tr[1]/td[1]")
    private WebElement firstDate;
    public String getFirstDate(){
        return firstDate.getText().toString();
    }
    @FindBy(xpath = "//*[@id=\"filtered_transactions_for_account\"]/table/tbody/tr[2]/td[1]")
    private WebElement secondDate;
    public String getSecondDate(){
        return secondDate.getText().toString();
    }
    @FindBy(xpath = "//*[@id=\"filtered_transactions_for_account\"]/table/tbody/tr[3]/td[1]")
    private WebElement thirdDate;
    public String getThirdDate(){
        return thirdDate.getText().toString();
    }


    @FindBy(id = "aa_description")
    private WebElement description;

    public void setDescription(String description1){

        wait.until(ExpectedConditions.visibilityOf(description)).sendKeys(description1);
    }

    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']/table/tbody/tr[1]/td[2]")
    private WebElement tableOnline;
    public String getTableOnline(){
        return tableOnline.getText();
    }
    public void cleanTable(){
        description.clear();
    }

}
