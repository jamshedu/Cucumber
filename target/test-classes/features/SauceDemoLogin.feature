#Author: James Born
Feature: Sauce Demo login

Description: US-3421 The purpose of this feature file is 
             to automate sacue demo app login feature with valid and 
             invalid credential
             
             Acceptance Criteria: I want to automate sauce demo login functionlity

Scenario: invalid login

#Given user is on login page
#When user enter username
#And user enter invalid password
#And click on login button
#Then user should see the error message


Given user is on login page
When user enter invalid username "admir"
And user enter invalid invalid password "jamshed88"
And click on login button
Then user should see the error message



