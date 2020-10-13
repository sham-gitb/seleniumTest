package com.clearlabs.stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    @Given("Initialize the browser and display the home page")
    public void initializeTheBrowserAndDisplayTheHomePage() {
        System.out.println("Initialize the Browser");
    }
    @When("user click the browser")
    public void userClickTheBrowser() {
        System.out.println("User Click");
    }
    @And("hit the URL")
    public void hitTheURL() {
        System.out.println("Hit the URL");
    }

    @Then("the application navigate to home of the application")
    public void application_navigate_to_home_of_the_application(){
        System.out.println("the application navigate to home of the application");
    }
}
