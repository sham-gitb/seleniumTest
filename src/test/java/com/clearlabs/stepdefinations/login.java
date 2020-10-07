package com.clearlabs.stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

    @Given("^Initialize Browser and Navigate Home Page&")
    public void loginPage(){
        System.out.println("Initialize the Browser and navigate to home page");
    }

    @When("^user click the broweser&")
    public void onClick(){
        System.out.println("user click the browser");
    }

    @And("^hit the URL&")
    public void onHit_URL(){
        System.out.println("hit the URL");
    }

    @Then("the application navigate to home of the application")
    public void the_application_navigate_to_home_of_the_application() {
        System.out.println("the application navigate to home of the application");
    }

}
