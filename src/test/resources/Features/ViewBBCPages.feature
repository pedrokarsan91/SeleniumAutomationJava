Feature: Visit BBC website
  As a user 
  I want to visit the BBC website
  So that I can view the site

  Scenario: Visit BBC home page
    Given I am on the BBC website
    Then I should be on the "Home" page

  @tag
  Scenario Outline: Example table test
    Given I am on the BBC website
    When I navigate to <Page Name>
    Then I should be on the <Page Name> page

    Examples: 
      | Page Name |
      | "Sport"   |
