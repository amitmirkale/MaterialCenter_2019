Feature: User does export and import to excel action for selected material

@ExportMat
Scenario: User export the material into excel
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And double click on material
And click on export to excel
And click on submit button on export to excel popup
Then export to excel is done successfully

@ImportExcel
Scenario: User uploads material using import excel file link
Given user clicks on Config WS
When user clicks on Import excel file link
And select fixed excel format
And enter all details and select excel file from system
And click on submit button to upload the excel
Then material through excel file should be uploaded successfully

@ExportMatFord
Scenario: User export the material into excel
Given user comes on Navigate WS
And user expands material design data
And select metal option
And double click on material from MOD of ford data
And click on export to excel
And click on submit button on export to excel popup
Then export to excel is done successfully

@ExportTestDataMatFord
Scenario: User export the material into excel
Given user gives test data material to search
When sort the material in descending order of revisions
And select the material with max revisions
And click on test data tab and select all test data
And click on export to excel test data
And click on mapping tab
And select schema mapping from dropdown
And click on submit button on export to excel popup
Then check that process status is completed

@ImportExcelFord
Scenario: User uploads material using import excel file link
Given user clicks on Config WS
When user clicks on Import excel file link
And select fixed excel format
And enter all details and select excel file from system
And click on submit button to upload the excel
Then material through excel file should be uploaded successfully