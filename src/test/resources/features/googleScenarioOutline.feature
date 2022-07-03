
Feature: Data Driven testing using Scenario Outline

  Scenario Outline:
    Given User is on Google search page
    When User searches for "<country>" capital
    Then User should see "<capital>" result
    Examples:
    |country|capital|