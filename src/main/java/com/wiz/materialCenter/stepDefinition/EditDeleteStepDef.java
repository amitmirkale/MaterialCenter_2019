package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.EditMatProcess;
import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditDeleteStepDef extends TestBase	{
	
	MaterialSOD matSod = new MaterialSOD();
	EditMatProcess editMat = new EditMatProcess();
	MaterialMOD matMod = new MaterialMOD();
	HomePage homePage = new HomePage();
	ProcessesPage process = new ProcessesPage();
	
	@When("click on Edit material option")
	public void click_on_Edit_material_option() {
	    matSod.clickOnEditMat();
	}

	@When("navigate to footnotes tab and add footnotes")
	public void navigate_to_footnotes_tab_and_add_footnotes() {
	    editMat.clickOnFootnotesTab();
	    editMat.addFootnote();
	}

	@When("go to properties tab and select mechanical property set as eleastic modulus")
	public void go_to_properties_tab_and_select_mechanical_property_set_as_eleastic_modulus() {
	    editMat.clickOnPropertiesTab();
	    editMat.selectMechProp();
	    
	}

	@When("add newly added footnotes to property and submit")
	public void add_newly_added_footnotes_to_property_and_submit() {
		editMat.clickOnFootnotes();
	    editMat.linkFootnote();
	}

	@Then("verify that newly added footnotes is updated with property successfully")
	public void verify_that_newly_added_footnotes_is_updated_with_property_successfully() {
	    matSod.verifyPropSetDisplay();
	}
	
	@When("select four materials to delete")
	public void select_four_materials_to_delete() {
	    matMod.selectLastEles();
	}

	@When("right click to select edit and then delete option")
	public void right_click_to_select_edit_and_then_delete_option() {
	    matMod.selectDelete();
	}

	@When("click on submit button to delete materials successfully")
	public void click_on_submit_button_to_delete_materials_successfully() {
	    matMod.deleteSubmit();
	}

	@When("navigate to homepage and select Delete process")
	public void navigate_to_homepage_and_select_Delete_process() {
		homePage.clickOnDashboard();
		homePage.clickOnProcessViewAll();
		homePage.clickOnDemoteProcess();   // this method is selecting the first process in list always
	}

	@Then("check that process is completed")
	public void check_that_process_is_completed() {
	    process.verifyDoneStatus();
	}
	
}
