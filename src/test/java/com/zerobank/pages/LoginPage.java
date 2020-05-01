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
        BrowserUtilities.wait(2);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.clickWithJS(signInBtn);

    }

    @FindBy(css = "input[name='submit']")
    private WebElement justClickBtn;
    public void setJustClickBtn(){
        justClickBtn.click();
    }

    @FindBy(xpath = "//input[@id='user_login']")
    private WebElement loginBox;

    @FindBy(xpath = "//input[@id='user_password']")
    private WebElement passwordBox;

    public void login(String usernameValue,String passwordValue){
        loginBox.sendKeys(usernameValue);
        passwordBox.sendKeys(passwordValue,Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.wait(3);

    }
    public void login(){
        loginBox.sendKeys(ConfigurationReader.getProperty("username"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"),Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.wait(3);
    }

    @FindBy(xpath = "//li[@id='account_summary_tab']")
    private WebElement subHeaderAccountSummary;
    public String accountSummaryText(){
        BrowserUtilities.waitForPageToLoad(10);
        return subHeaderAccountSummary.getText();

    }

    @FindBy(css = "div[class='alert alert-error']")
    private WebElement warningText;
    public String getWarningText(){
        return warningText.getText().toString();
    }

}
