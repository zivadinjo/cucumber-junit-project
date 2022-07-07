
Feature: Data Driven testing using Scenario Outline

  @google_scenario_outline
  Scenario Outline:
    Given User is on Google search page
    When User searches for "<country>" capital
    Then User should see "<capital>" result
    Examples:
    |country      |capital           |
    | Azerbaijan  | Baku             |
    | Tajikistan  | Dushanbe         |
    | Bulgaria    | Sofia            |
    | Ukraine     | Kyiv             |
    | Afghanistan | Kabul            |
    | USA         | Washington, D.C |
    | Turkey      | Ankara           |