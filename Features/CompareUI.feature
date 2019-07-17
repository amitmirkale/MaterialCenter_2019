Feature: Comparing multiple materials 

@MultipleMatCompare
Scenario: User selects 4 materials and compare them
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select four materials
And right click to select compare option
Then compare results displayed

@MultipleMatCompareFord
Scenario: User selects 4 materials and compare them
Given user comes on Navigate WS
And user expands material design data
And select metal option
And select four materials
And right click to select compare option
Then compare results displayed

@ApplyFilter
Scenario: Apply property set filter on material SOD
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And double click on material
And click on property set and uncheck select all checkbox
And no property set selected msg is displayed
And click on property set and check select all checkbox
Then all property set of material is displayed

@ApplyFilterFord
Scenario: Apply property set filter on material SOD
Given user comes on Navigate WS
And user expands material design data
And select metal option
And double click on material from MOD of ford data
And click on property set and uncheck select all checkbox
And no property set selected msg is displayed
And click on property set and check select all checkbox
Then all property set of material is displayed

@ConfigNav
Scenario: After login user navigates to config tab
Given user is on dashboard page
Then user clicks on configuration tab