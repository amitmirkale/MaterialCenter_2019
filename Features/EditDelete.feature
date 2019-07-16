Feature: To delete and edit the existing material in MaterialCenter

@EditMat
Scenario: User edit the footnotes and update the material
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And double click on material
And click on Edit material option
And navigate to footnotes tab and add footnotes
And go to properties tab and select mechanical property set as eleastic modulus
And add newly added footnotes to property and submit
Then verify that newly added footnotes is updated with property successfully

@DeleteMat
Scenario: User delete the selected materials
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select four materials to delete
And right click to select edit and then delete option
And click on next button 
And click on submit button to delete materials successfully
And navigate to homepage and select Delete process
Then check that process is completed

@EditMatFord
Scenario: User edit the footnotes and update the material
Given user comes on Navigate WS
And user expands material design data
And select metal option
And double click on material from MOD of ford data
And click on Edit material option
And navigate to footnotes tab and add footnotes
And go to properties tab and select mechanical property set as eleastic modulus
And add newly added footnotes to property and submit
Then verify that newly added footnotes is updated with property successfully

@DeleteMatFord
Scenario: User delete the selected materials
Given user comes on Navigate WS
When user expands material design data
And select metal option
And select four materials to delete
And right click to select edit and then delete option
And click on next button 
And click on submit button to delete materials successfully
And navigate to homepage and select Delete process
Then check that process is completed