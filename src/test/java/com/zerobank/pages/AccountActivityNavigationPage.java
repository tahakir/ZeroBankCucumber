package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityNavigationPage extends BasePage{



    public void navigateToAccountSummary(String module){
        String way="//a[text()='"+module+"']";
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(way))).click();
    }

    public void getTabName(String tabName){
        String way="//a[text()='"+tabName+"']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(way))).getText();
    }

    @FindBy(css = "#aa_accountId")
    private WebElement accountType;

    public String defaultOption() {
        Select select = new Select(accountType);
        return select.getFirstSelectedOption().getText().toString();
    }
}
