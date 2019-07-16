package com.wiz.materialCenter.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class HomePage extends TestBase {
	
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 20);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Home Workspace']")
	WebElement dashboardPage;
	
	@FindBy(xpath = "//img[@class='GlobalBCEnable']")
	WebElement backButton;
	
	@FindBy(xpath = "(//img[@class='GlobalBCEnable'])[2]")
	WebElement forwardButton;
	
	/*Workspace tabs*/
	
	@FindBy(xpath = "//table[@title='My Workspace']")
	WebElement myWorkspace;
	
	@FindBy(xpath = "//table[@title='Navigate']")
	WebElement navigate;
	
	@FindBy(xpath = "//table[@title='Configuration']")
	WebElement config;
	
	@FindBy(xpath = "//table[@title='Administration']")
	WebElement administration;
	
	@FindBy(xpath = "//table[@title='Search']")
	WebElement search;
	
	
	/*Processes tabs*/
	
	@FindBy(xpath = "(//div[@class='SMObjectsLink']/a[text()='View All'])[5]")
	WebElement processViewAll;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']")
	WebElement setReleaseProcess;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']")
	WebElement demoteProcess;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']")
	WebElement caeProcess;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']/td/a[text()='CAE Model (Auto)']")
	WebElement caeProcessHome;
	
	@FindBy(xpath = "//tr[@smrow='0']/td/a[text()='Discard']")
	WebElement discardProcess;
	
	public void clickOnMyWorkspace() {
		action.moveToElement(myWorkspace).build().perform();
		myWorkspace.click();
	}
	
	public void clickOnNavigate() {
		action.moveToElement(navigate).build().perform();
		navigate.click();
	}
	
	public void clickOnSearch() {
		action.moveToElement(search).build().perform();
		search.click();
	}
	
	public void clickOnConfiguration() {
		action.moveToElement(config).build().perform();
		config.click();
	}
	
	public void clickOnAdministration() {
		action.moveToElement(administration).build().perform();
		administration.click();
	}
	
	public void clickOnDashboard() {
		action.moveToElement(dashboardPage).build().perform();
		dashboardPage.click();
	}
	
	public void clickOnCaeProcessHome() {
		action.click(caeProcessHome).build().perform();
	}
	
	public void clickOnCaeProcess() {
		action.doubleClick(caeProcess).build().perform();
	}
	
	public void clickOnProcessViewAll() {
		action.click(processViewAll).build().perform();
	}
	
	public void clickOnPromoteProcess() {
		action.doubleClick(setReleaseProcess).build().perform();
	}
	
	public void clickOnDemoteProcess() {
		action.doubleClick(demoteProcess).build().perform();
	}
	
	public void verifyDiscard() {
		if(discardProcess.isDisplayed()) {
			System.out.println("CAE discard process is done successfully");
		} else {
			System.out.println("CAE discard process is not done successfully");
		}
	}

}
