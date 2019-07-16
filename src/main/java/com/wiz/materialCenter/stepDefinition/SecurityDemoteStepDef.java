package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.pages.SecurityProcess;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SecurityDemoteStepDef {
	HomePage homePage;
	MaterialMOD matMod;
	MaterialSOD matSod;
	SecurityProcess demote;
	ProcessesPage process;
	
	@When("select material with production release level")
	public void select_material_with_production_release_level() {
	    matMod = new MaterialMOD();
	    matMod.clickOnMatToDemote();
	}

	@When("click on demote action under security tab")
	public void click_on_demote_action_under_security_tab() {
	    matSod = new MaterialSOD();
	    matSod.clickOnSecurity();
	    matSod.clickOnDemoteAction();
	}

	@When("click on next button")
	public void click_on_next_button() {
	    demote = new SecurityProcess();
	    demote.clickOnNext();
	}
	
	@When("click on the submit button on dependent objects list")
	public void click_on_the_submit_button_on_dependent_objects_list() {
	    demote.clickOnSubmit();
	}
	
	@When("navigate to homepage and select Demote process")
	public void navigate_to_homepage_and_select_Demote_process() {
		homePage = new HomePage();
		homePage.clickOnDashboard();
		homePage.clickOnProcessViewAll();
		homePage.clickOnDemoteProcess();
	}
	
	@When("open the demoted material under inputs and outputs tab")
	public void open_the_demoted_material_under_inputs_and_outputs_tab() {
		process = new ProcessesPage();
		process.clickOnIOTab();
		process.clickOnDemotedObj();
	}

	@Then("material should be demoted successfully")
	public void material_should_be_demoted_successfully() {
	    demote.demoteResult();
	}

}
