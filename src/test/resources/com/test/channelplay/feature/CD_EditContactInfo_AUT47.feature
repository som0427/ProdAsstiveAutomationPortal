@AUT47
Feature: Edit Contact info from Customer Dashboard

  Background:
      Given after user successfully logged in then user will redirect on home page
      And then user will click on customer under crm menu

    Scenario: Edit the contact info
      When user click on customer dashboard
      And then click on contact info edit button
      And change the customer type from Customer to Partner
      And update the phone number
      And change the time zone
      Then save the info date
#      Then verify the data that you have changed or not as expected
