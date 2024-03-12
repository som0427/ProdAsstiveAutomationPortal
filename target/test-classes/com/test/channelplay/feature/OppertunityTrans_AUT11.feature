@AUT11
Feature: Add a new Opportunity

  Background:
    Given after successfully login to crm user will be on the Opportunity page under CRM
    And user select CRM and Click on Opportunity

@Scenario1
  Scenario: Add a new opportunity with all fields
    When User click on Add opportunity button
    And user select customer name from dropdown
    And user enter opportunity name
    And user enter description
    And user select contact from dropdown list
    And user enter value
    And user select expected closure date
    And user select status from dropdown
    And user select win probability from dropdown
    And user enter home address
    And user select contact Country from dropdown
    And user select contact State from dropdown
    And user select contact City from dropdown
#    And user enter about
#    And user enter store phone number
#    And user select religion from dropdown
#    And user select company-test from dropdown list
#    And user enter store email
#    And user upload opportunity plan document
#    And user upload testimonial video
    And user click opportunity save button
    Then check opportunity will added successfully with Customer name or not


  Scenario: Add a new opportunity with Save and Add New
    When User click on Add opportunity button
    And user select customer name from dropdown
    And user enter opportunity name
    And user enter description
    And user select contact from dropdown list
    And user enter value
    And user select expected closure date
    And user select status from dropdown
    And user select win probability from dropdown
    And user enter home address
    And user select contact Country from dropdown
    And user select contact State from dropdown
    And user select contact City from dropdown
    And user enter about
    And user enter store phone number
    And user select religion from dropdown
    And user select company-test from dropdown list
    And user enter store email
    And user upload opportunity plan document
    And user upload testimonial video
    And user click save and Add New button
    And then user click on Opportunity cancel button
    Then check opportunity will added successfully with Customer name or not


  Scenario: Edits and update the value of opportunity transaction
    When User Click on Edit button for opportunity
    And user enter opportunity name
    And user enter description
    And user select contact from dropdown list first option to second
    And user enter value
    And user select expected closure date with current date
    And user select status from dropdown first option to second option
    And user change the win probability from dropdown
    And user enter home address
    And user select Country india to UAE
    And user select State Dubai
    And user select City Dubai
    And user enter about
    And user enter store phone number
    And user select religion from dropdown first option to second
    And user select company-test from dropdown list first option to second
    And user enter store email
    And user upload opportunity plan document
    And user upload testimonial video
    And user click opportunity save button
    Then check opportunity will added successfully with Customer name or not