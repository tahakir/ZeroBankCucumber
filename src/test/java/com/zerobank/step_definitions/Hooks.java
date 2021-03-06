package com.zerobank.step_definitions;


import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setup(Scenario scenario){
        System.out.println("+++Starting test automation+++");
        System.out.println("Browser type: "+ ConfigurationReader.getProperty("browser"));
        System.out.println("Environment: "+ ConfigurationReader.getProperty("url"));
        System.out.println("Test scenario: "+scenario.getName());
        Driver.getDriver().manage().window().maximize();


    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            //attach screenshot to the report
            scenario.embed(image, "image/png", scenario.getName());
        }
        System.out.println("Test clean up");
        Driver.closeDriver();
    }

}
