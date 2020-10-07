Feature: verify application home is visible
  Scenario: Initialize browser to open application home page
    Given Initalize the browser and display the home page
    When user click the broweser
    And hit the URL
    Then the application navigate to home of the application