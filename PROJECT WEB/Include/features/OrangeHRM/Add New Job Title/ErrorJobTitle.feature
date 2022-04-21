Feature: Error Job Title
  
  Scenario Outline: entered false Info
    Given User Navigate to login page
    When User fill in the details for <Username> and <Password>
    And User Clicks Login Button
    When User MouseOver Admin
    Then User Clicks Add Job
    Then User Clicks Save Job Title
    Then User Entered Job Details for <JobTitle>, <JobDesc> and <Note>
		Then User Clicks Save Job Title
		Then User Revise Job Details
		Then User add PicMoreThan1MB
		Then User Clicks Save Job Title
		
		
    Examples: 
      | Username | Password | JobTitle                | JobDesc         | Note    |
      | admin    | admin123 | Chief Executive Officer | maintains Order | No note |
