package com.clearlabs.pageObject;

import com.clearlabs.driver.TestDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    @FindBy(xpath = "//*[@id='location-field-destination-menu']/div[1]/button[1]")
    public WebElement txtSearchBox;

    @FindBy(xpath = "//*[@id=\\\"wizard-hotel-pwa-v2-1\\\"]/div[2]/div[2]/button")
    public WebElement btnSearch;

    public HomePage(){
        PageFactory.initElements(TestDriver.getDriver(),HomePage.class);
    }

    public void initBrowser(){

    }

}
