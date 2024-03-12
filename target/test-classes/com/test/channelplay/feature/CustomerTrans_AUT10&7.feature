@AUT10
Feature: Add a new Customer with Save and Add New Customer functionality
  and also check Update the Customer.

  Background:
    Given after login to crm user will be on the Customer page under CRM
    And user select CRM and Click on Customer

    @Scenario1
    Scenario: Add customer with all fields
      When User Click on Add button
      And user Enter Customer Name
      And user select CustomerType dropdown and click first option
      And user enter address
      And user select Country
      And user select State
      And user select City
      And user upload photo
      And user enter phone number
      And user select timezone dropdown and click on first option
      And user click calender button and click select current date
      And user enter email
      And user upload document docs,pdf,ppt.xlsx
      And user upload video mpfour,mpg
      And user select select gender and click first option
      And user click save button
      Then customer will added successfully with active status

  @Scenario2
  Scenario: Customer add with Save and Add new button
    When User Click on Add button
    And user Enter Customer Name
    And user select CustomerType dropdown and click first option
    And user enter address
    And user select Country
    And user select State
    And user select City
    And user upload photo
    And user enter phone number
    And user select timezone dropdown and click on first option
    And user click calender button and click select current date
    And user enter email
    And user upload document docs,pdf,ppt.xlsx
    And user upload video mpfour,mpg
    And user select select gender and click first option
    And user click save and Add New button
    And then user click on cancel button
    Then customer will added successfully with active status

  @Scenario3
  Scenario: Edit Customer with all fields
    When User Click on Edit button
    And user Enter Customer Name
    And user select CustomerType dropdown and click first option to Second option
    And user enter address
    And user select Country india to UAE
    And user select State Dubai
    And user select City Dubai
    And user upload photo
    And user enter phone number
    And user select timezone dropdown and click on first option to second option
    And user click calender button and click current date
    And user enter email
    And user upload document docs,pdf,ppt.xlsx
    And user upload video mpfour,mpg
    And user select select gender and click first option to second option
    And user click save button
    Then customer will added successfully with active status








