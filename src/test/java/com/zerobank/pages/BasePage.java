package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage {
    protected WebDriver driver=Driver.getDriver();
    protected WebDriverWait wait=new WebDriverWait(driver,30);

    public BasePage(){
        PageFactory.initElements(driver,this);
    }


    public void navigateTo(String module){

        String way="//a[text()='"+module+"']";
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(way))).click();
    }



}
