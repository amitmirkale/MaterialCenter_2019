Feature: UI performance under Navigate WS

@MatToLib
Scenario: Switching from materials to libraries tree
Given user comes on Navigate WS
When user expands metals
And expands ferrous metals
And switch tree from materials to libraries
Then expands materials selector library

@MODSwitch
Scenario: Switching from one MOD to another MOD
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And switch to Polymers MOD
And user expands metals
Then select nonferrous metals

@RowsPerPage
Scenario: Changing the rows per page displayed
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select rows per page as fifty
And now select rows per page as hundred
And now select rows per page as two hundred fifty
Then select rows per page as five hundred

@RowsPerPageFord
Scenario: Changing the rows per page displayed
Given user comes on Navigate WS
And user expands material design data
And select metal option
And select rows per page as fifty
And now select rows per page as hundred
And now select rows per page as two hundred fifty
Then select rows per page as five hundred

@DensityColFilter
Scenario: User adds density column in MOD
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And click on arrow button
And open configure columns and click on more button
And select density filter and click on ok button
And click on density column and select filter
And move density slider for particular limit and click ok button
Then density filter is applied successfully

@DensityColFilterFord
Scenario: User adds density column in MOD
Given user comes on Navigate WS
And user expands material design data
And select metal option
And click on arrow button
And open configure columns and click on more button
And select density filter and click on ok button
And click on density column and select filter
And move density slider for particular limit and click ok button
Then density filter is applied successfully