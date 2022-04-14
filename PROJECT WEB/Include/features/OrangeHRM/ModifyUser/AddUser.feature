Feature: Add User

  Scenario Outline: Add new User
    Given User Navigate to login page
    When User fill in the details for <Username> and <Password>
    And User Clicks Login Button
    Then User is directed to home page
    Then User is directed to Users page
    Then User Clicks Add Button
    When User enters new user details <STAFF>, <USRNAME>, <PSW> and <PSW2>
    Then User Clicks Save
    Then Close Browser

    Examples: 
      | Username | Password | STAFF         | USRNAME | PSW        | PSW2       |
      | Admin    | admin123 | DOMINIC CHASE | EQALJ   | '!@$%^-_-' | '!@$%^-_-' |

  Scenario Outline: Fail to add new User
    Given User Navigate to login page
    When User fill in the details for <Username> and <Password>
    And User Clicks Login Button
    When User is directed to home page
    Then User is directed to Users page
    Then User Clicks Add Button
    Then User Tries to Skip the details
    Then User Clicks Save
    Then User tried again <STAFF>, <USRNAME>, <PASS> AND <PASS2>
    Then User Clicks Save
    Then User tried to use Used <USR2>
    Then User Clicks Save
    Then Close Browser
    Examples: 
      | Username | Password | STAFF | USRNAME | PASS   | PASS2 | USR2    |
      | Admin    | admin123 | EQAL  | EQAL    | '1234' |  5678 | Aravind |


