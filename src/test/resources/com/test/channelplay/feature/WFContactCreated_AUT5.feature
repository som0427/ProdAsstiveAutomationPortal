@AUT5
Feature: workflow functionality for Contact entity and will trigger on Contact is Created

  Background:
    Given after login to CRM user will be on the Workflow screen under Admin Menu

  @Scenario1
  Scenario Outline:  user will add a new workflow with CRM Transaction Entity and Trigger will be CRM Transaction
    When user select Add New button under workflow screen
    And enter Workflow Name "<Workflow Name>" and  Description "<Description>" under add new workflow screen
    And select Entity as "<Entity>" under add new workflow screen
    And select Trigger as "<Trigger>" under add new workflow screen
    And select save button under add new workflow screen
    Then new workflow will be created

    And active the workflow
    And go to the workflow screen
    Then new workflow will show in the workflow list under workflow screen

    Examples:
      | Workflow Name           | Description                     | Entity  | Trigger            |
      | Contacts Created WF 101 | Testing for Contacts Created WF | Contact | Contact is Created |

#      | Workflow Name                | Description                                   | Entity                | Trigger            |
#      | Customer Created WF         | Testing for Customer Created WF           | Customer                  | Customer is Created    |
#      | Customer Updated WF         | Testing for Customer Updated WF           | Customer                  | Customer is Updated    |
#      | Contacts Created WF         | Testing for Contacts Created WF           | Contact                   | Contact is Created     |
#      | Contacts Updated WF         | Testing for Contacts Updated WF           | Contact                   | Contact is Updated     |
#      | Opportunity Created WF      | Testing for Opportunity Created WF        | Opportunity               | Opportunity is Created |
#      | Opportunity Updated WF      | Testing for Opportunity Updated WF        | Opportunity               | Opportunity is Updated |
#      | Offsite Activity Submitted  | Testing for Offsite Activity Submitted WF | Offsite Activity          | Activity is Submitted  |
#      | Offsite Activity Updated    | Testing for Offsite Activity Updated WF   | Offsite Activity          | Activity is Updated    |
#      | Onsite Activity Submitted   | Testing for Onsite Activity Submitted WF  | Onsite Activity           | Activity is Submitted  |
#      | Onsite Activity Updated     | Testing for Onsite Activity Updated WF    | Onsite Activity           | Activity is Updated    |
#      | Order Activity Submitted    | Testing for Order Activity Submitted WF   | Order                     | Activity is Submitted  |
#      | Order Activity Updated      | Testing for Order Activity Updated WF     | Order                     | Activity is Updated    |
#      | Estimate Activity Submitted | Testing for Custom Activity Submitted WF  | Estimate                  | Activity is Submitted  |
#      | Estimate Activity Updated   | Testing for Custom Activity Updated WF    | Estimate Activity         | Activity is Updated    |
#      | Custom Activity Submitted   | Testing for Custom Activity Submitted WF  | Custom Activity Submitted | Activity is Submitted  |
#      | Custom Activity Updated     | Testing for Custom Activity Updated WF    | Custom Activity Updated   | Activity is Updated    |

  @Scenario2  # For adding Email
  Scenario Outline: user will open workflow dashboard of a item from the Workflows list and will add Send Email Action
    When user will select Workflow action for any item "<Workflow Name>" from the workflow list
    And select Add an Action or Condition button "<ActionNodeConditionType>"
    And after select Send Email action user select Next button under Sent Email section
    And user select To Receiver "<To Receiver>" from To dropdown and enter "<Custom Email Id for To Receiver>" if needed
    And user select CC Receiver "<CC Receiver>" from CC dropdown and enter "<Custom Email Id for CC Receiver>" if needed
    And enter Subject "<Subject>" under Subject field
    And user enter email content
    And select save button under Sent Email section
    Then Sent Email node will show under workflow section

    Examples: For select email receiver for To
      | Workflow Name               | ActionNodeConditionType | To Receiver                                           | Custom Email Id for To Receiver                | CC Receiver     | Custom Email Id for CC Receiver | Subject                                |
      | Contacts Created WF 101 eof | NO                      | Owner,Reporting Manager,Selected User,Custom Email Id | taufiquealam1995@gmail.com,schat0427@gmail.com | Custom Email Id | taufik@getassistive.com         | Onsite Activity not approved |

#    Data Table:
#      |               Choose To Receiver Data                 |                Choose CC Receiver Data                |            Choose Subject Data            |  Choose ActionNodeConditionType |
#      | Owner,Reporting Manager,Selected User,Custom Email Id | Owner,Reporting Manager,Selected User,Custom Email Id | Testing for Customer Created WF           |  YES                            |
#      | Owner                                                 | Owner                                                 | Testing for Customer Updated WF           |  NO                             |
#      | Reporting Manager                                     | Reporting Manager                                     | Testing for Contacts Created WF           |
#      | Selected User                                         | Selected User                                         | Testing for Contacts Updated WF           |
#      | Custom Email Id                                       | Custom Email Id                                       | Testing for Opportunity Created WF        |
#                                                                                                                      | Testing for Opportunity Updated WF        |
#                                                                                                                      | Testing for Offsite Activity Submitted WF |
#                                                                                                                      | Testing for Offsite Activity Updated WF   |
#                                                                                                                      | Testing for Onsite Activity Submitted WF  |
#                                                                                                                      | Testing for Onsite Activity Updated WF    |
#                                                                                                                      | Testing for Order Activity Submitted WF   |
#                                                                                                                      | Testing for Order Activity Updated WF     |
#                                                                                                                      | Testing for Custom Activity Submitted WF  |
#                                                                                                                      | Testing for Custom Activity Updated WF    |
#                                                                                                                      | Testing for Custom Activity Submitted WF  |
#                                                                                                                      | Testing for Custom Activity Updated WF    |


  @Scenario3    # for adding Delay Timer
  Scenario Outline: user will open workflow section of a item from the Workflows list and will add Delay Timer Action
    When user will select Workflow action for any item "<Workflow Name>" from the workflow list
    And select Add an Action or Condition button "<ActionNodeConditionType>"
    And after select Delay Timer action user select Next button under Delay Timer section
    And enter Duration Value "<Duration Value>" and select Duration Measure "<Duration Measure>" from the Duration dropdown
    And select save button under Delay Timer section
    Then Delay Timer node will show under workflow section respect to Duration Value "<Duration Value>" and Duration Measure "<Duration Measure>"

    Examples:
      | Duration Value | Duration Measure | Workflow Name               | ActionNodeConditionType |
      | 1              | Minutes          | Contacts Created WF 101 eof |                         |

#  Data Table:
#  | Choose Duration Measure |  Choose ActionNodeConditionType |
#  | Minutes                 |  YES                            |
#  | Hours                   |  NO                             |
#  | Days                    |
#  | Weeks                   |
#  | Months                  |
#  | Years                   |


  @Scenario4   # for adding Send SMS
  Scenario Outline: user will open workflow section of a item from the Workflows list and will add Send SMS Action
    When user will select Workflow action for any item "<Workflow Name>" from the workflow list
    And select Add an Action or Condition button "<ActionNodeConditionType>"
    And after select Send SMS action user select Next button under Send SMS section
    And select To Receiver "<To Receiver>" from the To dropdown
    And enter Message "<Message>" under Message field
    And select save button under Send SMS section
    Then Send SMS node will show under workflow section

    Examples:
      | To Receiver                                               | Message                                                                     | Workflow Name               | ActionNodeConditionType |
      | Owner,Reporting Manager,Selected User,Custom Phone Number | Authentication code for resetting your 1Channel password is ConditionPassed | Contacts Created WF 101 eof |                         |

#  Data Table:
#  |               Choose To Receiver Data                     |  Choose ActionNodeConditionType |
#  | Owner,Reporting Manager,Selected User,Custom Phone Number |  YES                            |
#  | Owner                                                     |  NO                             |
#  | Reporting Manager                                         |
#  | Selected User                                             |
#  | Custom Phone Number                                       |

  @Scenario5  # For Adding Condition
  Scenario Outline: user will open workflow section of a item from the Workflows list and will add Condition
    When user will select Workflow action for any item "<Workflow Name>" from the workflow list
    And select Add an Action or Condition button "<ActionNodeConditionType>"
    And after select New Condition user select Next button
    And select Entity "<Entity>" from the Select Entity dropdown
    And select Entity Field "<Entity Field>" from the Select Entity Field dropdown
    And select Operator "<Operator>" from the Select Operator dropdown
    And enter Value "<Value>" in the Select Value field
    And select Add More "<Add More>" if required additional condition to be added with Condition Type "<Condition Type>"
    And select Entity "<Entity2>", Entity Field "<Entity Field2>", Operator "<Operator2>", Value "<Value2>" for Add More "<Add More>"
    And select Add Group "<Add Group>" if required additional condition to be added with Condition Type "<Condition Type2>"
    And select Entity "<Entity3>", Entity Field "<Entity Field3>", Operator "<Operator3>", Value "<Value3>" for Add Group "<Add Group>"
    And select save button under New Condition section
    Then New Condition will show under workflow dashboard

    Examples:
      | Workflow Name               | ActionNodeConditionType | Entity  | Entity Field | Operator  | Value     | Add More | Add Group | Condition Type | Entity2 | Entity Field2 | Operator2 | Value2           | Entity3 | Entity Field3 | Operator3 | Value3 | Condition Type2 |
      | Contacts Created WF 101 eof |                         | Contact | Name         | Equals to | Taufik101 | YES      | NO        | OR             | Contact | Contact Type  | Equals to | Business Partner | Contact | Name          | Contains  | Taufik | AND             |

#    Data Table:
#      | Choose Entity | Choose Entity Field for Customer | Choose Entity Field for Opportunity | Choose Entity Field for Contact | Choose Operator | Choose Condition Type | Choose Add More/Add Group | Choose ActionNodeConditionType |
#      | Customer      | Customer Name                    | Customer Name                       | Name                            | Contains        | AND                   | YES                       | YES                            |
#      | Opportunity   | Customer Type                    | Opportunity Name                    | Contact Type                    | Equals to       | OR                    | NO                        | NO                             |
#      | Contact       | Address                          | Win probability                     | Assign Customer                 |                 |                       |                           |
#      |               | Country/State/City               | Value                               | Designation                     |                 |                       |                           |
#      |               | Owner                            | Status                              | Mobile                          |                 |                       |                           |
#      |               | Status                           | Expected Closure Date               | Email                           |                 |                       |                           |
#      |               | Phone                            | Description                         | Address                         |                 |                       |                           |
#      |               | Time zone                        | Contacts                            | Country/State/City              |                 |                       |                           |
#      |               | Date                             | Address                             | Owner                           |                 |                       |                           |
#      |               | Customer Email                   | Country/State/City                  | Status                          |                 |                       |                           |
#      |               | Gender                           | About                               | Created Date                    |

  @Scenario6      # for adding Create Activity
  Scenario Outline: user will open workflow section of a item from the Workflows list and will add Create Activity Action
    When user will select Workflow action for any item "<Workflow Name>" from the workflow list
    And select Add an Action or Condition button "<ActionNodeConditionType>"
    And after select Create Activity action user select Next button under Create Activity section
    And select Activity Name "<Activity Name>" from the Activity Name dropdown
    And fill all the fields with proper data under Create Activity screen
    And select save button under Create Activity section
    Then Create Activity node will show under workflow section

    Examples:
      | Activity Name    | Workflow Name               | ActionNodeConditionType |
      | Onsite Activity | Contacts Created WF 101 eof | NO                        |

#    Data Table:
#      | Choose Activity Name | Choose ActionNodeConditionType |
#      | Offsite Activity     | YES                            |
#      | Onsite Activity      | NO                             |
#      | Estimate             |
#      | Order                |