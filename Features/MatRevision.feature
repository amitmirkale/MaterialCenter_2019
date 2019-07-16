Feature: Create CAE model (Auto) of selected material

@MatRevision
Scenario: Creating multiple revisions of material
Given user clicks on Config WS
When user comes on Navigate WS
And click on material design data
And sort the material in descending order of revisions
And select the material with max revisions
And click on Edit material option
And navigate to properties tab and edit properties
Then material revisions should be done successfully

@MatRevisionCurve
Scenario: Creating multiple revisions of material
Given user gives material to search
When material is displayed and open the material
And click on Edit material option
And navigate to properties tab and edit mechanical and curves properties
Then material revisions should be done successfully
