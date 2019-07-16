package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.pages.SecurityProcess;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SecurityPromoteStepDef extends TestBase {
	HomePage homePage;
	MaterialMOD matMod;
	MaterialSOD matSod;
	SecurityProcess promote;
	ProcessesPage process;
	
	@When("select material with In work release level")
	public void select_material_with_In_work_release_level() {
	    matMod = new MaterialMOD();
	    matMod.clickOnMatToPromote();
	}

	@When("click on promote action under security tab")
	public void click_on_promote_action_under_security_tab() {
	    matSod = new MaterialSOD();
	    matSod.clickOnSecurity();
	    matSod.clickOnPromoteAction();
	}

	@When("select target level as production and click on next button")
	public void select_target_level_as_production_and_click_on_next_button() {
	   promote = new SecurityProcess();
	   promote.clickOnTargetLevel();
	   promote.selectProdLevel();
	   promote.clickOnNext();
	}

	@When("click on submit button on dependent objects list")
	public void click_on_submit_button_on_dependent_objects_list() {
	    promote.clickOnSubmit();
	}
	
	@When("navigate to homepage and select Set release process")
	public void navigate_to_homepage_and_select_Set_release_process() {
		homePage = new HomePage();
		homePage.clickOnDashboard();
		homePage.clickOnProcessViewAll();
		homePage.clickOnPromoteProcess();
	}
	
	@When("open the promoted material under inputs and outputs tab")
	public void open_the_promoted_material_under_inputs_and_outputs_tab() {
		process = new ProcessesPage();
		process.clickOnIOTab();
		process.clickOnPromotedObj();
	}

	@Then("material should be promoted successfully")
	public void material_should_be_promoted_successfully() {
	    promote.promoteResult();
	}

}
