package com.wiz.materialCenter.stepDefinition;

import java.io.IOException;

import com.wiz.materialCenter.pages.CAEProcessInput;
import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.LoginPage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.NavigateWS;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CAEModelStepDef extends TestBase {
	HomePage homePage = new HomePage();
	NavigateWS navigate = new NavigateWS();
	MaterialSOD matSod = new MaterialSOD();
	MaterialMOD matMod = new MaterialMOD();
	CAEProcessInput caeProccessInput = new CAEProcessInput();
	ProcessesPage processessPage = new ProcessesPage();
	
	@Given("user clicks on Config WS")
	public void user_clicks_on_Config_WS() {
		//homePage = new HomePage();
		homePage.clickOnConfiguration();
	}

	@When("user comes on Navigate WS")
	public void user_comes_on_Navigate_WS() {
		homePage.clickOnNavigate();
	}
	
	@When("user expands metals")
	public void user_expands_metals() {
	    //navigate = new NavigateWS();
	    navigate.clickOnMetalsExpand();
	}

	@When("select nonferrous metals")
	public void select_nonferrous_metals() {
	   navigate.clickOnNonFerrousMetals();
	}

	@When("double click on material from MOD")
	public void double_click_on_material_from_MOD() {
	   // matMod = new MaterialMOD();
		matMod.doubleClickMat();
	}

	@When("click on create SA")
	public void click_on_create_SA() {
		//matSod = new MaterialSOD();
		matSod.clickOnCreate();
	   
	}

	@When("click on CAE model AUTO action")
	public void click_on_CAE_model_AUTO_action() {
	    matSod.clickOnCAEAuto();
	}

	@When("click on Submit button")
	public void click_on_Submit_button() {
		//caeProccessInput = new CAEProcessInput();
		caeProccessInput.clickOnSubmit();
	}

	@When("navigate to homepage")
	public void navigate_to_homepage() {
		homePage.clickOnDashboard();
	}
	
	@When("select CAE model process")
	public void select_CAE_model_process() {
		homePage.clickOnCaeProcessHome();
	}

	@Then("CAE model should generate successfully")
	public void cae_model_should_generate_successfully() {
	    processessPage.verifyDoneStatus();
	}
	
	@Given("user clicks on view all processes and select CAE model process")
	public void user_clicks_on_view_all_processes_and_select_CAE_model_process() {
	    homePage.clickOnProcessViewAll();
	    homePage.clickOnCaeProcess();
	}

	@When("user clicks on discard option and clicks submit")
	public void user_clicks_on_discard_option_and_clicks_submit() {
	    processessPage.clickOnDiscard();
	    processessPage.clickOnDiscardSubmit();
	}

	@Then("discard of CAE model should be completed successfully")
	public void discard_of_CAE_model_should_be_completed_successfully() {
	    homePage.verifyDiscard();
	}
	
	@When("user expands material design data")
	public void user_expands_material_design_data() {
	    navigate.clickOnMatExpand_ford();
	}

	@When("select metal option")
	public void select_metal_option() {
	    navigate.clickOnMetals_Ford();
	}

	@When("double click on material from MOD of ford data")
	public void double_click_on_material_from_MOD_of_ford_data() {
	    matMod.doubleClickMat_Ford();
	}

}
