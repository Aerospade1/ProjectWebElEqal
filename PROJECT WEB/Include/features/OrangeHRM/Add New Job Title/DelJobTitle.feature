Feature: Delete Job Title
  I want to use this template for my feature file

  Scenario Outline: Delete Job Title
    Given User Navigate to login page
    When User fill in the details for <Username> and <Password>
    And User Clicks Login Button
    When User MouseOver JobTitle
    When User Picks Jobs to delete

    Examples: 
      | Username | Password |
      | admin    | admin123 |
