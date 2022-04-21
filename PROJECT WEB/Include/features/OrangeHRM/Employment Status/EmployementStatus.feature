Feature: Employement Status.feature
  I want to use this template for my feature file

  Scenario Outline: Modify Employment Status
    Given User Navigate to login page
    When User fill in the details for <Username> and <Password>
    And User Clicks Login Button
    When User MoveOverES
    Then User Adds New Employment Status with <ES>
    Then User Adds Again with <ES>

    Examples: 
      | Username | Password | ES      |
      | admin    | admin123 | Protege |
