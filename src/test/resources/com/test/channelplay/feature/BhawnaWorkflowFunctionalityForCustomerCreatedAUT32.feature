@AUT32
Feature: workflow functionality for customer entity and will trigger Customer is Created

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
      | Workflow Name               | Description                               | Entity                    | Trigger                |
      | Customer Created WF         | Testing for Customer Created WF           | Customer                  | Customer is Created    |
     # | Customer Updated WF         | Testing for Customer Updated WF           | Customer                  | Customer is Updated    |
     # | Contacts Created WF         | Testing for Contacts Created WF           | Contact                   | Contact is Created     |
     # | Contacts Updated WF         | Testing for Contacts Updated WF           | Contact                   | Contact is Updated     |
     # | Opportunity Created WF      | Testing for Opportunity Created WF        | Opportunity               | Opportunity is Created |





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
      | Workflow Name               | ActionNodeConditionType | To Receiver     | Custom Email Id for To Receiver               | CC Receiver | Custom Email Id for CC Receiver | Subject                        |
      | Customer Created WF fcd  |                         | Custom Email Id | pritamatta12345@gmail.com,schat0427@gmail.com | Owner       |                                 | Testing for Contact Created WF |

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



  @Scenario3   # for adding Send SMS
  Scenario Outline: user will open workflow section of a item from the Workflows list and will add Send SMS Action
    When user will select Workflow action for any item "<Workflow Name>" from the workflow list
    And select Add an Action or Condition button "<ActionNodeConditionType>"
    And after select Send SMS action user select Next button under Send SMS section
    And select To Receiver "<To Receiver>" from the To dropdown
    And enter Message "<Message>" under Message field
    And select save button under Send SMS section
    Then Send SMS node will show under workflow section

    Examples:
      | To Receiver       | Message                                                                     | Workflow Name | ActionNodeConditionType |
      | Reporting Manager | Authentication code for resetting your 1Channel password is ConditionPassed |               |                         |

#  Data Table:
#  |               Choose To Receiver Data                     |  Choose ActionNodeConditionType |
#  | Owner,Reporting Manager,Selected User,Custom Phone Number |  YES                            |
#  | Owner                                                     |  NO                             |
#  | Reporting Manager                                         |
#  | Selected User                                             |
#  | Custom Phone Number                                       |



