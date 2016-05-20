Feature: Search for an article
  As a user 
  I want to search for an article
  So that I can see a filtered result

  Scenario: Search using a keyword
    Given I am on the BBC website
    When I search for "Paris"
    Then I should see a list of articles related to "Paris"

  Scenario: Opening a searched article should open the correct article
    Given I am on the BBC website
    And I search for "Paris"
    When I open an article
    Then I should be on the correct article
