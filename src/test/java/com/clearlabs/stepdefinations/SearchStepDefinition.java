package com.clearlabs.stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.swing.interop.SwingInterOpUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;

import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

public class SearchStepDefinition {

    private WebDriver webDriver;

    @Given("open the browser and navigate to expedia")
    public void openTheBrowserAndNavigateToExpedia() throws InterruptedException {
        System.out.println("==================== Search Setps - Open the Browser ====================");
        System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\Clear-Labs\\assesment\\Selenium-Test\\seleniumTest\\src\\test\\resources\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Workspace\\Clear-Labs\\assesment\\Selenium-Test\\seleniumTest\\src\\test\\resources\\drivers\\geckodriver.exe");
//        webDriver = new ChromeDriver();
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        webDriver.navigate().to("https://www.expedia.com/");
        Thread.sleep(2000);
    }

    @And("hit enter")
    public void hitEnter() {
        System.out.println("============================= Search Setps - Click the Browsers ========================");

    }
    @Then("browser navigate to expedia")
    public void browserNavigateToExpedia() {
    }

    @When("user is navigate to expedia home page")
    public void userIsNavigateToExpediaHomePage() {
    }
}
