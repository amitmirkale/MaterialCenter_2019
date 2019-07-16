Feature: Create CAE model (Auto) of selected material

@GenerateCAE
Scenario: Generate CAE model of material
Given user clicks on Config WS
When user comes on Navigate WS
And user expands metals
And select nonferrous metals
And double click on material from MOD
And click on create SA
And click on CAE model AUTO action
And click on Submit button
And navigate to homepage
And select CAE model process
Then CAE model should generate successfully

@DiscardCAEModel
Scenario: User discards the CAE model process
Given user clicks on view all processes and select CAE model process
When user clicks on discard option and clicks submit
Then discard of CAE model should be completed successfully

@GenerateCAEFord
Scenario: Generate CAE model of material
Given user clicks on Config WS
When user comes on Navigate WS
And user expands material design data
And select metal option
And double click on material from MOD of ford data
And click on create SA
And click on CAE model AUTO action
And click on Submit button
And navigate to homepage
And select CAE model process
Then CAE model should generate successfully