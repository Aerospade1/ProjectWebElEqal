Feature: Login

  Scenario Outline: Login Successfully
    Given User Navigate to login page
    When User fill in the details for <Username> and <Password>
    And User Clicks Login Button
    Then User is directed to home page
		When User MouseOver Admin
		Then User Clicks Add Job
    Examples: 
      | Username | Password |
      | admin    | admin123 |

  
