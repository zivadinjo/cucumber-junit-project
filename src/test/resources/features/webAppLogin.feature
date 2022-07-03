
Feature: User should be able to login with correct credentials

  @wip
  Scenario:
    Given User is on web table login page
    When User enters username "Test"
    And User enters password "Tester"
    Then User should see url contains orders