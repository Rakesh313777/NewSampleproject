#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: login feature
we need validate the login feature of test cases
  
  @login1
  Scenario: validate the login details by using username and password
    Given user should be on login page
    When user enters valid username "testing@gmail.com"
    And user enters password "P123"
    And clicks on submitbutton
    And close the browser
    
    
  

  @login2
  Scenario Outline: validate the login details by using username and password
    Given user should be on login page
    When user enters valid username1 "<username>"
    And user enters password1 "<password>"
    And clicks on submitbutton
    And close the browser
    
    Examples: 
      | username | password | 
      | R@gmail.com | R123 | 
      | N@gmail.com | N123 |
      
      
