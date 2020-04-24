package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{

    @FindBy(xpath = "//button[@id='signin_button']")
    private WebElement signInBtn;
    public void landingPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.clickWithJS(signInBtn);
    }

    @FindBy(xpath = "//input[@id='user_login']")
    private WebElement loginBox;
    public void setLoginBox(){
        loginBox.sendKeys(ConfigurationReader.getProperty("username"));
        BrowserUtilities.waitForPageToLoad(10);
    }

    @FindBy(xpath = "//input[@id='user_password']")
    private WebElement passwordBox;
    public void setPasswordBox(){
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
    }

    @FindBy(xpath = "//li[@id='account_summary_tab']")
    private WebElement subHeaderAccountSummary;
    public String accountSummaryText(){
        BrowserUtilities.waitForPageToLoad(10);
        return subHeaderAccountSummary.getText();

    }

}
