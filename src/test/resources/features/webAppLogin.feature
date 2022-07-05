Feature: User should be able to login with correct credentials

  Background:
    Given User is on web table login page

  @webAppLogin
  Scenario:
    When User enters username "Test"
    And User enters password "Tester"
    And User click login button
    Then User should see url contains orders

  @webAppLogin1
  Scenario: positive login scenario
    When User enters username "Test" and password "Tester" and login
    Then User should see url contains orders

  @webAppLogin2
  Scenario:
    When User enters below credentials
      | username | Test   |
      | password | Tester |