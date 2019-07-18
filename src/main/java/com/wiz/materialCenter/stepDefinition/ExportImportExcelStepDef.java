package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.ConfigurationWS;
import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.pages.SearchPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExportImportExcelStepDef extends TestBase {
	
	MaterialSOD matSod = new MaterialSOD();
	ProcessesPage process = new ProcessesPage();
	ConfigurationWS config = new ConfigurationWS();
	SearchPage search = new SearchPage();
	HomePage homePage = new HomePage();
	
	@When("click on export to excel")
	public void click_on_export_to_excel() {
	    matSod.clickOnExportExcel();
	}

	@When("click on submit button on export to excel popup")
	public void click_on_submit_button_on_export_to_excel_popup() {
	    matSod.exportExcelSubmit();
	}

	@Then("export to excel is done successfully")
	public void export_to_excel_is_done_successfully() {
	    process.exportExcelSuccess();
	}
	
	@When("user clicks on Import excel file link")
	public void user_clicks_on_Import_excel_file_link() {
	    config.clickOnImportExcel();
	}

	@When("select fixed excel format")
	public void select_fixed_excel_format() {
	    config.clickOnFixedFormat();
	}

	@When("enter all details and select excel file from system")
	public void enter_all_details_and_select_excel_file_from_system() {
	    config.selectDataProject();
	    config.selectExcelToUplaod();
	    config.selectMasterMetalSchema();
	    
	}

	@When("click on submit button to upload the excel")
	public void click_on_submit_button_to_upload_the_excel() {
	    config.clickOnSubmitExcel();
	}

	@Then("material through excel file should be uploaded successfully")
	public void material_through_excel_file_should_be_uploaded_successfully() {
	    matSod.verifyPropSetDisplay();
	}
	
	@Given("user gives test data material to search")
	public void user_gives_test_data_material_to_search() {
	    search.enterTestDataMat();
	}
	
	@When("click on mapping tab")
	public void click_on_mapping_tab() {
		matSod.clickOnMappingTab();
	}

	@When("select schema mapping from dropdown")
	public void select_schema_mapping_from_dropdown() {
	    matSod.selectSchemaMapping();
	}
	
	@When("click on test data tab and select all test data")
	public void click_on_test_data_tab_and_select_all_test_data() {
		matSod.selectTestData();
	}
	
	@When("click on export to excel test data")
	public void click_on_export_to_excel_test_data() {
	    matSod.selectExportTestDataExcel();
	}
	
	@When("navigate to homepage and select first process")
	public void navigate_to_homepage_and_select_first_process() {
		homePage.clickOnDashboard();
		homePage.clickOnProcessViewAll();
		homePage.clickOnDemoteProcess();	// selecting first process 
	}
	
	@When("check that process status is completed")
	public void check_that_process_status_is_completed() {
	    process.verifyProcessStatus();
	}
}
