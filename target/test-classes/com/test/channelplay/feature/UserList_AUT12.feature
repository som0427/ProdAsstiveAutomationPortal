@AUT12
Feature: Assistive Admin -> Users

  Background:
    Given user loggedIn to Assistive project

  Scenario: Add Users
    When  user clicks on menu Admin and submenu Users
    Given user is on Users page

    Then clicks on Add button opens Add new user page
#    And  fill data into FirstName and LastName
#    And  enter email id in email field
    And  enter mobile number from user list
#    And  select User Role from dropdown
    And  select reports to from dropdown
#    And  click on checkbox of set password
#    And  enter password in password checkbox
#    And  clicks on Save button

#    And  type created user name over search field at Users page
#    Then newly created user name should show

#  Scenario: edit crm users
#    When user is on Users page and click on edit icon
#    And  alter required field
#    Then click on save button


