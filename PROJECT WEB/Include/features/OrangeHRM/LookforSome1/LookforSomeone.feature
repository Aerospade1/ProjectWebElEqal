Feature: Lookforuser

  Scenario Outline: Search Successfully
    Given User Navigate to login page
    When User fill in the details for <Username> and <Password>
    And User Clicks Login Button
    When User MouseOver Admin
    Then User Input Details with <UsrNm> and <EmployeeName>
    Then User Clicks Search Button
    Then Close Browser
    

    Examples: 
      | Username | Password | UsrNm   | EmployeeName  |
      | Admin    | admin123 | Aravind | Dominic Chase |
      
      
  Scenario Outline: Search Failed
    Given User Navigate to login page
    When User fill in the details for <Username> and <Password>
    And User Clicks Login Button
    When User MouseOver Admin
    Then User Input False Details with <EUsrNm> and <EEmployeeName>
    Then User Clicks Search Button
    Then Close Browser
    

    Examples: 
      | Username | Password | EUsrNm           | EEmployeeName    |
      | Admin    | admin123 | Jacqueline white | Jacqueline Black |
