Feature: Register to BBC
  As a user 
  I want to register to BBC	
  So that I can keep up to date

  Scenario: Register a new user
    Given I am on the BBC website
    And I navigate to register
    When I register with the following details
      | Username            | Password |
      | pkarsan@qaworks.com | Pa55w0rd |
    Then my account should be created

  Scenario: Register a new user with invalid username
    Given I am on the BBC website
    And I navigate to register
    When I register with the following details
      | Username | Password |
      | invalid  | Pa55w0rd |
    Then I should see the error message "This email address is not valid"
