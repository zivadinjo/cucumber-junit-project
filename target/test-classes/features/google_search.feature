Feature: Google Search Functionality Title Verification
  User story: As a user, when I'm on the Google search page
  I should be able to search whatever I want,an see relevant information

  @smoke
  Scenario: Search functionality result title verification
    Given User is on Google search page
    When User types apple in the google search box and click enter
    Then User sees apple - Google Search is in the google title

  @smoke
  Scenario: Search functionality result title verification
    Given User is on Google search page
    When User types "apple" in the google search box and click enter
    Then User sees "apple - Google Search" is in the google title