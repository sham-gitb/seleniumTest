package com.clearlabs.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"./src/test/java/com/clearlabs/features"},
        glue = {"classpath:com/clearlabs/stepdefinations"},
        monochrome = true
        )
public class TestRunner {

}
