Feature: Login 

@smok
Scenario: Login with valid username and invalid password
When user loged in with valid username
And user enters invalid password 
And click on login button
Then user see "Invalid credentials" error message
@smok
Scenario: Login with valid username and empty password
When user enters valid username 
And user enters empty password
And click on login button
Then user see "Password can not be empty"
@regression
Scenario: Login without username and valid password
When user enters empety username
And user enters valid password
And click on ligin button
Then user see "Username cannot be empty" error message



