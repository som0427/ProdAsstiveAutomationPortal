@AUT51
Feature: Add new offsite activity from CRM Activities Submenu

  Background:
    Given after successfully logged in to crm user will be on the home page
    And user select CRM and Click on Activities menu

  Scenario: perform offsite activity from Activities page
    When user click on Add Activities button
    And user select offsite activity Option
    And user select customer name
    And user select Opportunity under offsite activity
    And user enter title under offsite activity
    And user enter Update Opportunity Value under offsite activity
    And user select Update Opportunity Status under offsite activity
    And user select Update Exp Closure Date under offsite activity
    And user select Update Win Probability under offsite activity
    And user select Contact under offsite activity
    And user enter testActivity under offsite activity
#    And user select  offsite activity country
#    And user select offsite activity State
#    And user select offsite activity City
    And User click save button under offsite activity
    Then new offsite activities will show in the list