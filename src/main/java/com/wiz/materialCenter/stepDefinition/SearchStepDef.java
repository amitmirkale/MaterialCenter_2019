package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.SearchPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStepDef extends TestBase {
	SearchPage search = new SearchPage();
	HomePage homePage = new HomePage();
	
	@Given("user gives some text to search in materials")
	public void user_gives_some_text_to_search_in_materials() {
	    search.enterTextSearch();
	}

	@When("text search result is displayed")
	public void text_search_result_is_displayed() {
		search.searchResult();
	}

	@When("user gives some numerical values to search in materials")
	public void user_gives_some_numerical_values_to_search_in_materials() {
	    search.enterNumericalSearch();
	}

	@Then("numerical search result is displayed")
	public void numerical_search_result_is_displayed() {
	    search.searchResult();
	}
	
	@When("user saves the searched template")
	public void user_saves_the_searched_template() {
	    search.clickOnSaveSearch();
	}

	@Then("relaunch the saved search template")
	public void relaunch_the_saved_search_template() {
	    search.relaunchSearch();
	}
	
	@Given("user is on search page")
	public void user_is_on_search_page() {
	    homePage.clickOnSearch();
	    search.clickOnMaterial();
	}
	
	@Given("user comes on search page")
	public void user_comes_on_search_page() {
	    search.clickOnSearchButton();
	}

	@When("user adds density attribute condition")
	public void user_adds_density_attribute_condition() {
	    search.addDensityAttr();
	}

	@When("user provides range using histogram")
	public void user_provides_range_using_histogram() {
	    search.expandDensityAttr();
	    search.applyHistrogramRange();
	}

	@When("search result for given condition")
	public void search_result_for_given_condition() {
	    search.applyDensityChange();
	}

	@Then("add yield strength attribute condition")
	public void add_yield_strength_attribute_condition() {
	    search.addYieldStrength();
	}
	
	@When("user selects test data type from search dropdown")
	public void user_selects_test_data_type_from_search_dropdown() {
	    search.clickOnSearchDropDown();
	    search.selectTestDataSearch();
	}

	@When("user gives search input in search field")
	public void user_gives_search_input_in_search_field() {
	    search.enterTestDataSearch();
	}

}
