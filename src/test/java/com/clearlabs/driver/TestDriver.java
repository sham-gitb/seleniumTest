package com.clearlabs.driver;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

@Slf4j
public class TestDriver {

    private static ThreadLocal<WebDriver> webDriverThread = new ThreadLocal<>();

    private TestDriver(){ }

    public static WebDriver getDriver(){
        return webDriverThread.get();
    }




    

}
