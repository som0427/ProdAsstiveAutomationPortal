@AUT45
Feature: Create a new Report for the Customer

  Background:
    Given user successfully logged in then user will redirect on home page
    And then user will click on Report builder under Analytics menu

  Scenario Outline: Report builder for customer
    When user select the report type "<Report Type>" of Report builder
    And user close the Report type Up-Arrow button
    And user click on entity dropdown
    And user select entity option "<Entity Option>"
    And user search entity field "<Entity Field1>" from entity field dropdown and drag & drop into the Field section
    And user search entity field "<Entity Field2>" from entity field dropdown and drag & drop into the Measure section
    And user search entity field "<Entity Field3>" from entity field dropdown and drag & drop into the Filters section
    And user select Condition "<Condition>" and Value "<Value>" under Filter screen
    And user click on Show Preview button and select save button on the preview section
    And user enter Name "<Name>" and Description "<Description>" on the Add New screen
    And user select Dashboard "<Dashboard>" and Select Existing Dashboard "<Select Existing Dashboard>" and select Dashboard Name "<Dashboard Name>"  OR Enter New Dashboard Name "<Enter New Dashboard Name>" with DashboardName as "<DashboardName>"
    And user select Reports Menu "<Reports Menu>" from location
    And user click on Add New screen Save button

    Then select Report Catalogs submenu under Analytics and the new Created Report will be shown as "<Name>"
    Then if Report is created under Dashboard "<Dashboard>" and user select Dashboard submenu under Analytics and the new Created Report will be shown as "<Name>"
    Then if Report is created under Reports submenu "<Reports Menu>" and user select Reports submenu under Analytics and the new Created Report will be shown as "<Name>"


    Examples:
      | Report Type | Entity Option | Entity Field1        | Entity Field2          | Entity Field3  | Condition | Value | Name               | Description                              | Dashboard | Select Existing Dashboard | Dashboard Name    | Enter New Dashboard Name | DashboardName  | Reports Menu |
      | Pie Chart   | Contact       | Created On (Contact) | Contact Type (Contact) | Name (Contact) | Contains  | Test  | PieChart_Taufik112 | PieChart Sample Test Report with contact | YES       | NO                        | Taufik Report 201 | YES                      | New Report 502 | YES          |


#    Examples:
#      |USE BELOW DATA FOR CREATING THE ENTITY FIELDS FOR CONTACTS]|
#      | Report Type    | Entity Option    | Contact Fields                                  | Condition              | Dashboard      | Select Existing Dashboard | Enter New Dashboard Name | Reports Menu       |
#      | Vertical Bar   | Contact          | Add Header Details Test (Contact)               | Contains               | YES            | YES                       | YES                      | YES                |
#      | Horizontal Bar | Opportunity      | Address (Contact)                               | Equals to              | NO             | NO                        | NO                       | NO                 |
#      | Pie Chart      | Customer         | Assign Customer (Contact)                       |                        |                |                           |                          |                    |
#      | Line Chart     | Product          | Company Architecture Details Test (Contact)     |                        |                |                           |                          |                    |
#      | Table          | Activity Details | Company Location Video Test (Contact)           |                        |                |                           |                          |                    |
#      | Matrix         | Offsite Activity | Company Phone Number Test (Contact)             |                        |                |                           |                          |                    |
#      |                | Onsite Activity  | Company Registered Email Test (Contact)         |                        |                |                           |                          |                    |
#      |                | Estimate         | Company Registration Certificate Test (Contact) |                        |                |                           |                          |                    |
#      |                | Order            | Company Test (Contact)                          |                        |                |                           |                          |                    |
#      |                | hello            | Contact Type (Contact)                          |                        |                |                           |                          |                    |
#      |                |                  | Country/State/City (Contact)                    |                        |                |                           |                          |                    |
#      |                |                  | Created By (Contact)                            |                        |                |                           |                          |                    |
#      |                |                  | Created On (Contact)                            |                        |                |                           |                          |                    |
#      |                |                  | Customer Normal Text Test (Contact)             |                        |                |                           |                          |                    |
#      |                |                  | Customer Page Separator Test (Contact)          |                        |                |                           |                          |                    |
#      |                |                  | Data List Groups (Contact)                      |                        |                |                           |                          |                    |
#      |                |                  | Data List Module (Contact)                      |                        |                |                           |                          |                    |
#      |                |                  | Designation (Contact)                           |                        |                |                           |                          |                    |
#      |                |                  | Email (Contact)                                 |                        |                |                           |                          |                    |

