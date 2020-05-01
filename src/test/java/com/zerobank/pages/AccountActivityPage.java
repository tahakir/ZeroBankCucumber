package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage {

    @FindBy(css = "#aa_accountId")
    private WebElement accountType;


    public List<String> dropDownOptions(){
        return BrowserUtilities.getTextFromWebElements(new Select(driver.findElement(By.id("aa_accountId"))).getOptions());

    }

    public String defaultOption() {
        Select select = new Select(accountType);
        return select.getFirstSelectedOption().getText();
    }

    @FindBy(xpath = "//table//th")
    private List<WebElement> tableDescriptions;

    public List<String> columnNames(){
        return BrowserUtilities.getTextFromWebElements(tableDescriptions);

    }







}
