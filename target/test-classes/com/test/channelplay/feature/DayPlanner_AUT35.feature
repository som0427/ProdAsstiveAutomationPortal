@AUT35
Feature: Adding Day Planner to CRM portal

  Background:
    Given After login the user will be on the Day Planner page under CRM menu


    Scenario: User will create a Day Planner for single user
      When user select a date for a single user
      And user will click on the Save Button
      And User will goto Activities Menu under CRM Menu
      Then User will see the newly created Day Planner Activity in the list
