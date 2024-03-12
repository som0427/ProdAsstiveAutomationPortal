@AUT20
Feature: Add a new contact with Save and Add New contact functionality
 and also check Update the contact.

  Background:
    Given after login to crm home page user will be on the Contact page under CRM
    And user select CRM and Click on Contact


   @Scenario1
  Scenario: Add Contact with all fields
   When User Click on Add contact button
    And user Enter contact Name
    And user select ContactType dropdown and click first option
    And user select assign customer
    And user enter designation
    And user enter mobile number
    And user enter contact email
    And user enter contact address
    And user select contact Country
    And user select contact State
    And user select contact City
    And user select data list group
    And user select company test from dropdown list
    And user enter company phone number
    And user select date
    And user upload certificate
    And user upload video
    And user select Data List Module from dropdown
    And user enter Company Registered Email Test
    And user click contact save button
    Then check contact will added successfully with active status

 @Scenario2
 Scenario: Contact add with Save and Add new button
  When User Click on Add contact button
  And user Enter contact Name
  And user select ContactType dropdown and click first option
  And user select assign customer
  And user enter designation
  And user enter mobile number
  And user enter contact email
  And user enter contact address
  And user select contact Country
  And user select contact State
  And user select contact City
  And user select data list group
  And user select company test from dropdown list
  And user enter company phone number
  And user select date
  And user upload certificate
  And user upload video
  And user select Data List Module from dropdown
  And user enter Company Registered Email Test
  And user click save and Add New button
  And then user click on cancel form button
  Then check contact will added successfully with active status

 @Scenario3
 Scenario: Edit Contact with all fields
  When User Clicks on Edit button
  And user Enter contact Name
  And user select ContactType dropdown and click first option to second option
  And user select assign customer first option to second
  And user enter designation
  And user enter mobile number
  And user enter contact email
  And user enter contact address
  And user select Country india to UAE
  And user select State Dubai
  And user select City Dubai
  And user select data list group from dropdown list first to second
  And user select company test from dropdown list first option to second
  And user enter company phone number
  And user select date and click on current date
  And user upload certificate
  And user upload video
  And user select Data List Module from dropdown from first option to second option
  And user enter Company Registered Email Test
  And user click contact save button
  Then check contact will added successfully with active status














