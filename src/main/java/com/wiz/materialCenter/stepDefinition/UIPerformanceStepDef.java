package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.NavigateWS;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UIPerformanceStepDef extends TestBase {
	NavigateWS navigate = new NavigateWS();
	MaterialMOD matMod = new MaterialMOD();
	
	@When("expands ferrous metals")
	public void expands_ferrous_metals() {
	    navigate.clickOnFerrousExpand();
	}

	@When("switch tree from materials to libraries")
	public void switch_tree_from_materials_to_libraries() {
	    navigate.clickOnTreeSelection();
	    navigate.selectLibrariesTree();
	}

	@Then("expands materials selector library")
	public void expands_materials_selector_library() {
	    navigate.clickOnMatSelExpand();
	}
	
	@When("user clicks on Metals to open MOD")
	public void user_clicks_on_Metals_to_open_MOD() {
	    navigate.clickOnMetals();
	}

	@When("switch to Polymers MOD")
	public void switch_to_Polymers_MOD() {
	    navigate.clickOnPolymers();
	}
	
	@When("select rows per page as fifty")
	public void select_rows_per_page_as_fifty() {
	   matMod.clickOnRowPerPage();
	   matMod.selectRowsPerPage50();
	}

	@When("now select rows per page as hundred")
	public void now_select_rows_per_page_as_hundred() {
		matMod.clickOnRowPerPage();
		matMod.selectRowsPerPage100();
	}

	@When("now select rows per page as two hundred fifty")
	public void now_select_rows_per_page_as_two_hundred_fifty() {
		matMod.clickOnRowPerPage();
		matMod.selectRowsPerPage250();
	}

	@Then("select rows per page as five hundred")
	public void select_rows_per_page_as_five_hundred() {
		matMod.clickOnRowPerPage();
		matMod.selectRowsPerPage500();
	}
	
	@When("open configure columns and click on more button")
	public void open_configure_columns_and_click_on_more_button() {
	    matMod.selectConfigCol();
	}

	@When("select density filter and click on ok button")
	public void select_density_filter_and_click_on_ok_button() {
	    matMod.selectDensityCol();
	    matMod.clickOnOkButton();
	}

	@And("click on density column and select filter")
	public void click_on_density_column_and_select_filter() {
	    matMod.verifyDensityCol();
	    matMod.selectDensityFilter();
	}
	
	@And("move density slider for particular limit and click ok button")
	public void move_density_slider_for_particular_limit_and_click_ok_button() {
	    matMod.setDensityRange();
	}
	
	@Then("density filter is applied successfully")
	public void density_filter_is_applied_successfully() {
	    matMod.verifyDensityCol();
	}

}
