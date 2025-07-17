

Feature: signup feature
  we need validate the singup feature of testcases

  @signup1
  Scenario: To validate the signup details
    Given user should be on signup page
    When user should enter all the required fields of firstName "firstName"
    And user should enter lastName "lastName"
    And user should select dateOfBirth "24"
    And user should select monthOfBirth "man"
    And user should select yearOfBirth "1998"
    And user should select gender "male"
    And user should select customGender "custom"
    And user should select SelectCustomGenderAndNameOptional 1 and "gay"
    And user should enter the emailOrMobileNumber "R@gmail.com"
    And user should enter the password "R@gmail.com"
    And clicks on submit
    #And close the browser

  @signup2
  Scenario Outline: To validate the signup details
    Given user should be on signup page
    When user should enter all the required fields of firstName1 "<firstName>"
    And user should enter lastName1 "<lastName>"
    And user should select dateOfBirth1 "<date>"
    And user should select monthOfBirth1 "<month>"
    And user should select yearOfBirth1 "<year>"
    And user should select gender1 "<gender>"
    And user should enter the emailOrMobileNumber1 "<emailormobile>"
    And user should enter the password1 "<password>"
    And clicks on submit
    #And close the browser
    
    Examples:
      | firstName | lastName | date | month | year | gender | emailormobile | password |
      | ramu | eshwar | 24 | Jan |1998 | male | R@gmail.com | R@gmail |
      | krishna | astami | 1 | Mar |1998 | male | K@gmail.com | K@gmail |
      | raki | panduga  | 2 | aug |1998 | male | R@gmail.com | R@gmail |
      
