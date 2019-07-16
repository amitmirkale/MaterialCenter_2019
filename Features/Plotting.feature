Feature: To plot the bar chart graph of multiple materials

@BarChart
Scenario: Plot the bar chart graph of selected material
Given user clicks on Config WS
When user comes on Navigate WS
And user expands metals
And select nonferrous metals
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Bar chart
And select multiple Y values
And click on plot button
Then plot should be done successfully

@BarChartFord
Scenario: Plot the bar chart graph of selected material
Given user clicks on Config WS
When user comes on Navigate WS
And user expands material design data
And select metal option
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Bar chart
And select multiple Y values
And click on plot button
Then plot should be done successfully


@ScatterPlot
Scenario: Plot the scatter graph of density vs ultimate strength
Given user clicks on Config WS
When user comes on Navigate WS
And user expands metals
And select nonferrous metals
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Scatter plot
And select Density as X values
And select Ultimate Strength as Y values
And click on plot button
Then plot should be done successfully

@ScatterPlotFord
Scenario: Plot the scatter graph of density vs ultimate strength
Given user clicks on Config WS
When user comes on Navigate WS
And user expands material design data
And select metal option
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Scatter plot
And select Density as X values
And select Ultimate Strength as Y values
And click on plot button
Then plot should be done successfully

@PieChart
Scenario: Plot the pie chart graph of density
Given user clicks on Config WS
When user comes on Navigate WS
And user expands metals
And select nonferrous metals
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Pie chart
And select Density as Y values
And click on plot button
Then plot should be done successfully

@PieChartFord
Scenario: Plot the pie chart graph of density
Given user clicks on Config WS
When user comes on Navigate WS
And user expands material design data
And select metal option
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Pie chart
And select Density as Y values
And click on plot button
Then plot should be done successfully

@SpiderPlot
Scenario: Plot the spider graph with four params selected
Given user clicks on Config WS
When user comes on Navigate WS
And user expands metals
And select nonferrous metals
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Spider plot
And select four params as Y values
And click on plot button
Then plot should be done successfully

@SpiderPlotFord
Scenario: Plot the spider graph with four params selected
Given user clicks on Config WS
When user comes on Navigate WS
And user expands material design data
And select metal option
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Spider plot
And select four params as Y values
And click on plot button
Then plot should be done successfully