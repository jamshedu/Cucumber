Feature: Add new Employee

  Background: 
    Given user is logged with valid admin 
    And user navigate to AddEmployeePage

  Scenario: Add Employee with first and lastname
    When user enters employees first name and last name
    And user clicks save button
    Then employee is added successfully

  Scenario: Add Employee without employee id
    When user enters employees first name and last name
    And user clicks save button
    Then employee is added successfully
    

  Scenario: Add Employee and creat Login Credentials
    When user enters employees first name and last name
    And user click on create login checkbox
    And user enters login creadentials
    And user clicks save button
    Then employee is added successfully
