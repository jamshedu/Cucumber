#Author: jamshed188@yahoo.com
Feature: Dashboard

Scenario: Dashboaed menu view for admin

When user logged with valid admin credentials
Then user see dashboard menu is displayed
   |Admin | PIM | Leave | Time | Recruitment | Performance | Dashboard | Directory |
