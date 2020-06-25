Feature: Login 

#previusly writinn test

Scenario: valid admin login
When user enter valild admin username and password 
And user enter login on button 
Then admin user is successfully logged in 

Scenario: valid jamshed99 login
When user enter valid jamshed99 username and password
And user click on login button
Then jamshed99 user is successfully logged in


#enhencing test with Scenario Outline

Scenario Outline:

When user enter valid "<Username>" and "<Password>"
And user click on login button 
Then "<FirstName>" is successfully logged in

Examples:
      | Username | Password    | FirstName |
      | Mahady   | Mahady123!! | John      |
      | abd77    | Syntax123!  | Abdullah  |
      
      
       
  Scenario: Login with valid username and invalid password
    When User enter valid username and invalid password
    And user click on login button
    Then User see Invalid Credentials text on login page

 
  Scenario: Login with invalid credentials
    When I enter invalid username and password and see error message
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid Credentials |
      | Hello    | Syntax123! | Invalid Credentials |



#@smok
#Scenario: Login with valid username and invalid password
#When user loged in with valid username
#And user enters invalid password 
#And click on login button
#Then user see "Invalid credentials" error message
#@smok
#Scenario: Login with valid username and empty password
#When user enters valid username 
#And user enters empty password
#And click on login button
#Then user see "Password can not be empty"
#@regression
#Scenario: Login without username and valid password
#When user enters empety username
#And user enters valid password
#And click on ligin button
#Then user see "Username cannot be empty" error message

 #previously written test
  #@smoke
  #Scenario: valid admin login
    #When user enter valid admin username and password
    #And user click on login button
    #Then admin user is successfully logged in
#
  #@smoke
  #Scenario: valid ess login
    #When user enter valid ess username and password
    #And user click on login button
    #Then ess user is successfully logged in
#
  #enhancing test with Scenario Outline
  #@smoke
  #Scenario Outline: 
    #When user enter valid "<Username>" and "<Password>"
    #And user click on login button
    #Then "<FirstName>" is successfully logged in
#
    #Examples: 
      #| Username | Password    | FirstName |
      #| Mahady   | Mahady123!! | John      |
      #| abd77    | Syntax123!  | Abdullah  |
#
  #@smoke
  #Scenario: Login with valid username and invalid password
    #When User enter valid username and invalid password
    #And user click on login button
    #Then User see Invalid Credentials text on login page
#
#@temp
  #Scenario: Login with invalid credentials
    #When I enter invalid username and password and see error message
      #| UserName | Password   | ErrorMessage        |
      #| Admin    | Admin123   | Invalid Credentials |
      #| Hello    | Syntax123! | Invalid Credentials |
      #
#
#



