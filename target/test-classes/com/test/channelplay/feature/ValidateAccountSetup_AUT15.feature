@AUT15
Feature: Validate Account Setup

  Background:
    Given user will be on the Account Setup page under System under Settings

  @Scenario1
  Scenario: validate Customer Settings for Portal site only
    When user select Customer Settings tab
    And change value in the field Rename Customer
    And change value in the field What would be the plural Customer
    And hit save button on Account Setup screen
    And Sign Out the account and log in again

    And select CRM sub menu under Settings menu
    Then in the CRM dropdown renamed field will show

    And select CRM menu
    Then changed field for plural will show in the sub menu

    And rename that fields with original name for Customer
    Then fields name will be changed successfully

  @Scenario2
  Scenario: validate Contact Settings for Portal site only
    When user select Contact Settings tab
    And change value in the field Rename Contact
    And change value in the field What would be the plural Contact
    And hit save button on Account Setup screen
    And Sign Out the account and log in again

    And select CRM sub menu under Settings menu
    Then in the CRM dropdown renamed field will show

    And select CRM menu
    Then changed field for plural will show in the sub menu

    And rename that fields with original name for Contact
    Then fields name will be changed successfully

  @Scenario3
  Scenario: validate Opportunity Settings for Portal site only with changed field name
    When user select Opportunity Settings tab
    And change value in the field Rename Opportunity
    And change value in the field What would be the plural Opportunity
    And hit save button on Account Setup screen
    And Sign Out the account and log in again

    And select CRM sub menu under Settings menu
    Then in the CRM dropdown renamed field will show

    And select CRM menu
    Then changed field for plural will show in the sub menu

    And rename that fields with original name for Opportunity
    Then fields name will be changed successfully

  @Scenario4
  Scenario: validate Opportunity Settings for Portal site only by enable/disable opportunity feature
    When user select Opportunity Settings tab
    And disable the Opportunity Feature
    And hit save button on Account Setup screen
    And Sign Out the account and log in again

    And select CRM sub menu under Settings menu
    Then Opportunity sub menu will not appear

    And select CRM menu
    Then Opportunity Plural sub menu will not appear

    And again start the opportunity feature

