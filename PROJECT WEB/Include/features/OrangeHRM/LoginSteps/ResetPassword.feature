Feature: Reset Password

  Scenario Outline: Login Failed
    Given User Navigate to login page
    When User fill in the details for <Username> and <Password>
    And User Clicks Login Button
    Then Alert User Invalid Account

    Examples: 
      | Username | Password     |
      | Aravind  | TheGreatEqal |

  Scenario Outline: Reset Password
    Given User Navigate to login page
    When User Clicks Forgot Password Text
    And User Enters <FUsername>
    Then User Clicks on Reset Password Button

    Examples: 
      | FUsername |  
      | Aravind   |
