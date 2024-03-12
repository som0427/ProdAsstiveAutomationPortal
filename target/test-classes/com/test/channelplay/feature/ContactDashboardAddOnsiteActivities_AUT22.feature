@AUT22
Feature: Add new Onsite activity from Contact dashboard

  Background:
    Given after successfully logged in to crm user will be on the home page
    And user select CRM and Click on Contact menu

  Scenario: perform Onsite activity for Contact
    When user click on customer dashboard
    And User click on plus button and Select Onsite Activities option
    And user select customer name
    And user select Opportunity under offsite activity
    And user enter title under Onsite activity
    And user enter Update Opportunity Value under offsite activity
    And user select Update Opportunity Status under offsite activity
    And user select Update Exp Closure Date under offsite activity
    And user select Update Win Probability under offsite activity
#    And user select Contact under offsite activity
    And hit save button under offsite activity
    Then new Onsite activity will show in the list