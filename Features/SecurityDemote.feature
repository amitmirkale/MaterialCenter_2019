Feature: Demoting material from Production level to In-Review or In Work level

@Demote
Scenario: User is able to demote the material to In-Review or In Work level
Given user clicks on Config WS
When user comes on Navigate WS
And user expands metals
And select nonferrous metals
And select material with production release level
And click on demote action under security tab
And click on next button
And click on the submit button on dependent objects list
And navigate to homepage and select Demote process
And open the demoted material under inputs and outputs tab
Then material should be demoted successfully

@DemoteFord
Scenario: User is able to demote the material to In-Review or In Work level
Given user clicks on Config WS
When user comes on Navigate WS
And user expands material design data
And select metal option
And double click on material from MOD of ford data
And click on demote action under security tab
And click on next button
And click on the submit button on dependent objects list
And navigate to homepage and select Demote process
And open the demoted material under inputs and outputs tab
Then material should be demoted successfully