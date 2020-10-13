Feature: verify that the search stay
  Scenario: initialize the browser and navigate to expedia
    Given open the browser and navigate to expedia
    When user is navigate to expedia home page
    And hit enter
    Then browser navigate to expedia
  Scenario Outline: Search stay and verify the results
    When user enter <Location> as location
    And Hit the Sarch Button
    Then verify that the following appear in browser
      Examples: |Location|
                |Miami   |