Feature: New Job Title
  I want to use this template for my feature file

  Scenario Outline: Add Job Title
    Given User Navigate to login page
    When User fill in the details for <Username> and <Password>
    And User Clicks Login Button
    When User MouseOver JobTitle
    Then User Clicks Add Job
    Then User Entered Job Details for <JobTitle>, <JobDesc> and <Note>
    When User Upload File
    Then User Clicks Save Job Title

    Examples: 
      | Username | Password | JobTitle         | JobDesc         | Note    |
      | admin    | admin123 | Head of Security | maintains Order | No note |
