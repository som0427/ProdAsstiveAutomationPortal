@AUT46
Feature: Add new Onsite activity from CRM Activities Submenu

  Background:
    Given after successfully logged in to crm user will be on the home page
    And user select CRM and Click on Activities menu

  Scenario: perform Onsite activity from Activities page
    When user click on Add Activities button
    And user select Onsite activity Option
    And user select customer name
    And user select Opportunity under onsite activity
    And user enter title under Onsite activity activity
    And user enter Update Opportunity Value under onsite activity
    And user select Update Opportunity Status under onsite activity
    And user select Update Exp Closure Date under onsite activity
    And user select Update Win Probability under onsite activity
    And user select Contact under onsite activity
    And User click save button under onsite activity
    Then new onsite activities will show in the list