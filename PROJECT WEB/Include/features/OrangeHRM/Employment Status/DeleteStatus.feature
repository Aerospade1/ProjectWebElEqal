
Feature: Delete Status


  Scenario Outline: Delete Status
  
    Given User Navigate to login page
    When User fill in the details for <Username> and <Password>
    And User Clicks Login Button
    When User MoveOverES
    Then User DeleteES
    Then Close Browser

    Examples: 
      | Username | Password |
      | admin    | admin123 | 