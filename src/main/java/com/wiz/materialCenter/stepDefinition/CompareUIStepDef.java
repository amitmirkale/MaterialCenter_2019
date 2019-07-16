package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.CompareProcessPage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CompareUIStepDef extends TestBase {
	MaterialMOD matMod = new MaterialMOD();
	CompareProcessPage compare = new CompareProcessPage();
	MaterialSOD matSod = new MaterialSOD();
	
	@When("select four materials")
	public void select_four_materials() {
	    matMod.selectMultiMat();
	}

	@When("right click to select compare option")
	public void right_click_to_select_compare_option() {
		matMod.rightClickOnMats();
		matMod.clickOnCompare();
	}

	@Then("compare results displayed")
	public void compare_results_displayed() {
	    compare.compareResult();
	}
	
	@When("double click on material")
	public void double_click_on_material() {
	    matMod.doubleClickOnFirstMat();
	}

	@When("click on property set and uncheck select all checkbox")
	public void click_on_property_set_and_uncheck_select_all_checkbox() {
	    matSod.propSetSelect();
	}

	@Then("no property set selected msg is displayed")
	public void no_property_set_selected_msg_is_displayed() {
	    matSod.verifyNoPropMsg();
	}
	
	@When("click on property set and check select all checkbox")
	public void click_on_property_set_and_check_select_all_checkbox() {
		matSod.propSetSelect();
	}

	@Then("all property set of material is displayed")
	public void all_property_set_of_material_is_displayed() {
		matSod.verifyPropSetDisplay();
	}

}
