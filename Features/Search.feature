Feature: To search different types of templates

@EasySearch
Scenario: Easy search action templates
Given user gives some text to search in materials
When text search result is displayed
And user gives some numerical values to search in materials
Then numerical search result is displayed

@SaveEasySearch
Scenario: Save the search templates
Given user gives some text to search in materials
When text search result is displayed
And user saves the searched template
Then relaunch the saved search template

@AddDensityAttribute
Scenario: User adds density & yield strength attribute conditions for material
Given user is on search page
When user adds density attribute condition
And user provides range using histogram
And search result for given condition
Then add yield strength attribute condition

@AddDensityAttributeFord
Scenario: User adds density & yield strength attribute conditions for material
Given user comes on search page
When user adds density attribute condition
And user provides range using histogram
And search result for given condition
Then add yield strength attribute condition

@SearchTestDataFord
Scenario: User search for test data
Given user comes on search page
When user selects test data type from search dropdown
And user gives search input in search field
Then text search result is displayed