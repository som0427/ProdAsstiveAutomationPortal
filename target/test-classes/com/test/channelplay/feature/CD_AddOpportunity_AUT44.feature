@AUT44
Feature: Add a new Opportunity from Customer Dashboard

  Background:
    Given after user successfully logged in to crm user will be on the home page
    And user select CRM and Click on Customer menu

  Scenario: Add a new opportunity with all fields
    When User click on Add dashboard button
    And user click on plussign opportunity button
    And user_enter opportunity name
    And user_enter description
    And user_select contact from dropdown list
    And user_enter value
    And user_select expected closure date
    And user_select status from dropdown
    And user_select win probability from dropdown
    And user_enter home address
    And user_select contact Country from dropdown
    And user_select contact State from dropdown
    And user_select contact City from dropdown
    And user_enter about
    And user_enter store phone number
    And user_select religion from dropdown
    And user_select company-test from dropdown list
    And user_enter store email
    And user_upload opportunity plan document
    And user_upload testimonial video
    And user_click opportunity save button
    Then check_opportunity will added successfully with Customer name or not
