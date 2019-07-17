package com.wiz.materialCenter.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class SearchPage extends TestBase {
	
	String saveName = UUID.randomUUID().toString();
	Actions action = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	/*Xpaths under Search WS tab*/
	
	@FindBy(xpath = "//a[text()='Material']")
	WebElement materialSearch;
	
	@FindBy(xpath = "//a[text()='Test']")
	WebElement testSearch;
	
	@FindBy(xpath = "//a[text()='Batch']")
	WebElement batchSearch;
	
	@FindBy(xpath = "//a[text()='Analysis Result']")
	WebElement analysisResultSearch;
	
	@FindBy(xpath = "//a[text()='CAE Model']")
	WebElement caeModelSearch;
	
	@FindBy(xpath = "//a[text()='String Property']")
	WebElement stringPropSearch;
	
	@FindBy(xpath = "//a[text()='Measure Property']")
	WebElement measurePropSearch;
	
	@FindBy(xpath = "//a[text()='Curve Property']")
	WebElement curvePropSearch;
	
	@FindBy(xpath = "//a[text()='Image Property']")
	WebElement imagePropSearch;
	
	@FindBy(xpath = "//a[text()='Matrix Property']")
	WebElement matrixPropSearch;
	
	@FindBy(xpath = "//a[text()='Document Property']")
	WebElement docPropSearch;
	
	@FindBy(xpath = "//a[text()='Library']")
	WebElement librarySearch;
	
	@FindBy(xpath = "//a[text()='Approval Request']")
	WebElement approvalReqSearch;
	
	@FindBy(xpath = "//a[text()='Work Request']")
	WebElement workReqSearch;
	
	@FindBy(xpath = "//a[text()='More...']")
	WebElement moreSearch;
	
	@FindBy(xpath = "//table[@id='searchMenuDiv']")
	WebElement searchDropDown;
	
	@FindBy(xpath = "//td[@class='voice']/a[text()='Test Data' and @img='MatTest']")
	WebElement testDataSearch;
	
	/*Xpaths on Search result page*/
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement easySearch;
	
	@FindBy(xpath = "//td/img[@id='search']")
	WebElement searchButton;
	
	@FindBy(xpath = "//td[@class='MODComp']/table[@class='ModBody']")
	WebElement searchResult;
	
	@FindBy(xpath = "//td/img[@title='Save Search']")
	WebElement saveSearch;
	
	@FindBy(xpath = "//input[@class='name']")
	WebElement saveByName;
	
	@FindBy(xpath = "//span[text()='Ok']")
	WebElement okButton;
	
	@FindBy(xpath = "//a[text()='My Searches']")
	WebElement mySearches;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']")
	WebElement latestSearch;
	
	@FindBy(xpath = "//div[text()=' Add Condition']")
	WebElement addCondition;
	
	@FindBy(xpath = "//input[@id='nameFilter']")
	WebElement filterText;
	
	@FindBy(xpath = "//td[text()='Density']//parent::tr//td[@class='SwsShrink']/input")
	WebElement densityCheckbox;					
	
	@FindBy(xpath = "//td[text()='Yield Strength']//parent::tr//td[@class='SwsShrink']/input")
	WebElement yieldStrengthCheckbox;			
	
	@FindBy(xpath = "//td[text()='Density']")
	WebElement densityAttrAdded;
	
	@FindBy(xpath = "//td[text()='Yield Strength']")
	WebElement yieldStrengthAdded;
	
	@FindBy(xpath = "//td[text()='Density']//parent::tr//td/img[@id='edit']")
	WebElement expandDensityAttr;
	
	@FindBy(xpath = "//td[text()='Density']//parent::tr//td/img[@id='close']")
	WebElement collapseDensityAttr;
	
	@FindBy(xpath = "//img[@title='Show historgram']")
	WebElement historgram;
	
	@FindBy(xpath = "//td[@id='units']")
	WebElement unitsDropDown;
	
	@FindBy(xpath = "//option[text()='lb/in³']")
	WebElement lbinchesUnit;
	
	@FindBy(xpath = "(//div[@class='SwsHistoBar'])[1]")
	WebElement histrogramGraph;
	
	@FindBy(xpath = "//img[@title='Show historgram']//following::img[@title='Apply the changes']")
	WebElement histoApplyChanges;
	
	@FindBy(xpath = "//td[text()='Density']//following::img[@id='clear']")
	WebElement densityConditionRemoveButton;
	
	public SearchPage textSearch(String text) {
		easySearch.click();
		easySearch.clear();
		easySearch.sendKeys(text);
		action.click(searchButton).build().perform();
		return new SearchPage();
	}
	
	public void enterTextSearch() {
		textSearch(prop.getProperty("textsearch"));
	}
	
	public void enterTextSearch1() {
		textSearch(prop.getProperty("textsearch1"));
	}
	
	public void enterTestDataMat() {
		textSearch(prop.getProperty("testDataMaterial"));
	}
	
	public void enterTestDataSearch() {
		textSearch(prop.getProperty("testdataSearch"));
	}
	
	public void searchResult() {
		if(searchResult.isDisplayed()) {
			System.out.println("Search result is displayed");
		} else {
			System.out.println("Search result didn't display");
		}
	}
	
	public SearchPage numericalSearch(String text) {
		easySearch.click();
		easySearch.clear();
		easySearch.sendKeys(text);
		action.click(searchButton).build().perform();
		return new SearchPage();
	}
	
	public void enterNumericalSearch() {
		textSearch(prop.getProperty("numericalsearch"));
	}
	
	public void clickOnSearchButton() {
		action.click(searchButton).build().perform();
	}
	
	public void clickOnSaveSearch() {
		action.click(saveSearch).build().perform();
		saveByName.click();
		saveByName.clear();
		saveByName.sendKeys(RandomStringUtils.randomAlphanumeric(5));
		//saveByName.sendKeys(saveName);
		action.click(okButton).build().perform();
	}
	
	public void relaunchSearch() {
		action.click(mySearches).build().perform();
		action.doubleClick(latestSearch).build().perform();
		if(searchResult.isDisplayed()) {
			System.out.println("Relaunch of saved search is done successfully");
		} else {
			System.out.println("Relaunch of saved search is not done successfully");
		}
	}
	
	public void clickOnMaterial() {
		action.click(materialSearch).build().perform();
	}
	
	public void addDensityAttr() {
		action.click(addCondition).build().perform();
		filterText.clear();
		filterText.click();
		filterText.sendKeys("Density");
		//js.executeScript("arguments[0].scrollIntoView(true);", densityCheckbox);
		action.click(densityCheckbox).build().perform();
		action.click(okButton).build().perform();
		if(densityAttrAdded.isDisplayed()) {
			System.out.println("Density attribute condition added successfully");
		} else {
			System.out.println("Density attribute addition failed");
		}
	}
	
	public void expandDensityAttr() {
		js.executeScript("arguments[0].scrollIntoView(true);", expandDensityAttr);
		action.click(expandDensityAttr).build().perform();
 	}
	
	public void applyHistrogramRange() {
		wait.until(ExpectedConditions.elementToBeClickable(unitsDropDown));
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		js.executeScript("arguments[0].scrollIntoView(true);", unitsDropDown);
		js.executeScript("arguments[0].click();", unitsDropDown);
		action.click(lbinchesUnit).build().perform();
		action.moveToElement(historgram).build().perform();
		action.sendKeys(historgram, Keys.ENTER).build().perform();
		js.executeScript("arguments[0].click();", histrogramGraph);
		
	}
	
	public void applyDensityChange() {
		action.click(histoApplyChanges).build().perform();
		if(densityConditionRemoveButton.isEnabled()) {
			System.out.println("Historgram range of density applied successfully");
		} else {
			System.out.println("Historgram range is not applied successfully");
		}
		action.click(collapseDensityAttr).build().perform();
	}
	
	public void addYieldStrength() {
		action.click(addCondition).build().perform();
		filterText.clear();
		filterText.click();
		filterText.sendKeys("Yield Strength");
		action.moveToElement(yieldStrengthCheckbox).build().perform();
		action.click(yieldStrengthCheckbox).build().perform();
		js.executeScript("arguments[0].click();", okButton);
		if(yieldStrengthAdded.isDisplayed()) {
			System.out.println("Yield strength attribute condition added successfully");
		} else {
			System.out.println("Yield strength attribute condition adition failed");
		}
	}
	
	public void clickOnSearchDropDown() {
		action.click(searchDropDown).build().perform();
	}
	
	public void selectTestDataSearch() {
		action.click(testDataSearch).build().perform();
	}

}
