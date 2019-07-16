package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.PlotProcessInput;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PlottingStepDef extends TestBase {
	
	MaterialMOD materialMod = new MaterialMOD();
	PlotProcessInput plotProcessInput = new PlotProcessInput();
	
	@When("click on arrow button")
	public void click_on_arrow_button() {
		materialMod.clickOnArrow();
	}

	@When("click on select page option")
	public void click_on_select_page_option() {
	    materialMod.clickOnSelectPage();
	}

	@When("click on plot action")
	public void click_on_plot_action() {
	    materialMod.clickOnPlotAction();
	}
	
	@When("select plot type as Bar chart")
	public void select_plot_type_as_Bar_chart() {
		plotProcessInput.clickOnPlotType();
	    plotProcessInput.clickOnBarChartType();
	}

	@When("select multiple Y values")
	public void select_multiple_Y_values() {
	   plotProcessInput.selectMultipleValues();
	}

	@When("click on plot button")
	public void click_on_plot_button() {
	   plotProcessInput.clickOnPlotButton();
	}

	@Then("plot should be done successfully")
	public void plot_should_be_done_successfully() {
	   plotProcessInput.plottingResult();
	}
	
	@When("select plot type as Scatter plot")
	public void select_plot_type_as_Scatter_plot() {
	    plotProcessInput.clickOnScatterPlot();
	}

	@When("select Density as X values")
	public void select_Density_as_X_values() {
	    plotProcessInput.clickOnDensity();
	}

	@When("select Ultimate Strength as Y values")
	public void select_Ultimate_Strength_as_Y_values() {
	    plotProcessInput.clickOnUltimateStrength();
	}
	
	@When("select plot type as Pie chart")
	public void select_plot_type_as_Pie_chart() {
	    plotProcessInput.selectPieChart();
	}

	@When("select Density as Y values")
	public void select_Density_as_Y_values() {
	    plotProcessInput.selectYvalueDensity();
	}
	
	@When("select plot type as Spider plot")
	public void select_plot_type_as_Spider_plot() {
	    plotProcessInput.clickOnSpiderPlot();
	}

	@When("select four params as Y values")
	public void select_four_params_as_Y_values() {
	    plotProcessInput.spiderPlotYValues();
	}

}
