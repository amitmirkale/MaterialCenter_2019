package com.wiz.materialCenter.stepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.LoginPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	
	@FindBy(xpath = "//input[@value='Ok']")
	WebElement okButton;
	
	
	@Before
	public void before() {
		TestBase.initialization();
		loginPage = new LoginPage();
		homePage =  loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		try {
			okButton.click();
		} catch (Exception e) {
			System.out.println("Disclaimer popup didn't come");
		}
	}
	
	@After
	public void after(Scenario scenario) {
		if(scenario.isFailed()) {
			scenario.write("Please look below for failed step screenshot:");
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
		} 
		driver.quit();
	}

}
