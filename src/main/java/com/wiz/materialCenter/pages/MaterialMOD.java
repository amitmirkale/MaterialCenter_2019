package com.wiz.materialCenter.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiz.materialCenter.util.TestBase;

public class MaterialMOD extends TestBase{
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	
	public MaterialMOD() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@class='ModButton']")
	WebElement arrowButton;
	
	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/a[text()='Select Page']")
	WebElement selectPage;
	
	@FindBy(xpath = "//td[@class='voice']/a[text()='Configure Columns']")
	WebElement configCol;
	
	@FindBy(xpath = "//span[text()='More']")
	WebElement moreButton;
	
	@FindBy(xpath = "//td[text()='Density']//parent::tr//td[@class='SwsShrink']/input")
	WebElement densityCheckbox;
	
	@FindBy(xpath = "//td[text()='Density']")
	WebElement densityCol;
	
	@FindBy(xpath = "//span[text()='Ok']")
	WebElement okButton1;
	
	@FindBy(xpath = "//span[text()='OK']")
	WebElement okButton2;
	
	@FindBy(xpath = "//th[@title='Density']")
	WebElement densityColAdded;
	
	@FindBy(xpath = "//td[@class='voice']/a[text()='Filter']")
	WebElement densityFilter;
	
	@FindBy(xpath = "//input[@id='range']")
	WebElement densityRangeFilter;
	
	@FindBy(xpath = "//div[@id='slider']")
	WebElement densitySlider;
	
	@FindBy(xpath = "//img[@title='Plot']")
	WebElement plotAction;
	
	@FindBy(xpath = "(//td[text()='Rows/Page :']//following::td/select)[1]")
	WebElement rowsPerPage;
	
	@FindBy(xpath = "(//td[text()='Rows/Page :']//following::td/select/option[text()='50'])[1]")
	WebElement rowPerPage50;
	
	@FindBy(xpath = "(//td[text()='Rows/Page :']//following::td/select/option[text()='100'])[1]")
	WebElement rowPerPage100;
	
	@FindBy(xpath = "(//td[text()='Rows/Page :']//following::td/select/option[text()='250'])[1]")
	WebElement rowPerPage250;
	
	@FindBy(xpath = "(//td[text()='Rows/Page :']//following::td/select/option[text()='500'])[1]")
	WebElement rowPerPage500;
	
	@FindBy(xpath = "//table[@class='ModBody']")
	WebElement modArea;
	
	@FindBy(xpath = "//span[text()='Classification']")
	WebElement sodNavConfirm;
	
	@FindBy(xpath = "//th[@title='Revision']")
	WebElement revisionTab;
	
	@FindBy(xpath = "(//a[text()='Sort descending'])[7]")
	WebElement sortDescending;
	
	/*Materials xpath in MOD*/
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']")
	WebElement firstEle;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='1']")
	WebElement secondEle;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='2']")
	WebElement thirdEle;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='3']")
	WebElement fourthEle;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='21']")
	WebElement fourthLastEle;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='22']")
	WebElement thirdLastEle;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='23']")
	WebElement secondLastEle;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='24']")
	WebElement lastEle;
	
	/*Right click actions xpaths*/
	
	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/a[text()='Compare']")
	WebElement compareOption;
	
	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/div/a[text()='Actions']")
	WebElement actionsOption;
	
	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/div/a[text()='Create']")
	WebElement createOption;
	
	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/div/a[text()='Edit']")
	WebElement editOption;
	
	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/div/a[text()='Export']")
	WebElement exportOption;
	
	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/div/a[text()='Security']")
	WebElement securityOption;
	
	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/div/a[text()='Tools']")
	WebElement toolsOption;
	
	/*xpaths of edit sub options after right click on material*/
	
	@FindBy(xpath = "//table[contains(@id,'sub_Edit')]/tbody/tr/td/a[text()='Remove Materials From Library']")
	WebElement editRemoveLib;
	
	@FindBy(xpath = "//table[contains(@id,'sub_Edit')]/tbody/tr/td/a[text()='Assign Analysis Result To Material']")
	WebElement editAnalysisResult;
	
	@FindBy(xpath = "//table[contains(@id,'sub_Edit')]/tbody/tr/td/a[text()='Delete']")
	WebElement editdelete;
	
	@FindBy(xpath = "//table[contains(@id,'sub_Edit')]/tbody/tr/td/a[text()='Change Project']")
	WebElement editProject;
	
	@FindBy(xpath = "//table[contains(@id,'sub_Edit')]/tbody/tr/td/a[text()='Change Owner']")
	WebElement editOwner;
	
	@FindBy(xpath = "//input[@value='Submit' and contains(@id,'nav')]")
	WebElement deleteSubmitButton;
	
	/*Materials in release level In-work*/
	
	@FindBy(xpath = "(//table[@class='ModBody']/tbody/tr/td[text()='0-In-Work'])[1]")
	WebElement matInWork;
	
	@FindBy(xpath = "//table[@class='MOD']/tbody/tr[4]/td/table/tbody/tr/td/span[text()='AA 208.0'] | //table[@class='MOD']/tbody/tr[4]/td/table/tbody/tr/td/span[text()='AMS 4086']")
	WebElement matInProd;
	
	@FindBy(xpath = "//table[@class='MOD']/tbody/tr[4]/td/table/tbody/tr/td/span[text()='AA 518.0'] | //table[@class='MOD']/tbody/tr[4]/td/table/tbody/tr/td/span[text()='AMS 4152']")
	WebElement selectedMat;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']")
	WebElement caeMatFord;
	
	
	public void clickOnArrow() {
		js.executeScript("arguments[0].click();", arrowButton);
	}
	
	public void clickOnSelectPage() {
		js.executeScript("arguments[0].click();", selectPage);
	}
	
	public void clickOnPlotAction() {
		js.executeScript("arguments[0].click();", plotAction);
	}
	
	public void clickOnMatToPromote() {
		action.doubleClick(matInWork).build().perform();
	}
	
	public void clickOnMatToDemote() {
		action.doubleClick(matInProd).build().perform();
	}
	
	public void doubleClickMat() {
		action.doubleClick(selectedMat).build().perform();
	}
	
	public void doubleClickMat_Ford() {
		action.doubleClick(caeMatFord).build().perform();
	}
	
	public void clickOnRowPerPage() {
		action.click(rowsPerPage).build().perform();
	}
	
	public void clickOnRevisionTab() {
		action.click(revisionTab).build().perform();
	}
	
	public void clickOnSorting() {
		action.click(sortDescending).build().perform();
	}
	
	public void selectRowsPerPage50() {
		action.click(rowPerPage50).build().perform();
		if(modArea.isDisplayed()) {
			System.out.println("50 results displayed");
		} else {
			System.out.println("50 results didn't display");
		}
	}
	
	public void selectRowsPerPage100() {
		action.click(rowPerPage100).build().perform();
		if(modArea.isDisplayed()) {
			System.out.println("100 results displayed");
		} else {
			System.out.println("50 results didn't display");
		}
	}
	
	public void selectRowsPerPage250() {
		action.click(rowPerPage250).build().perform();
		if(modArea.isDisplayed()) {
			System.out.println("250 results displayed");
		} else {
			System.out.println("50 results didn't display");
		}
	}
	
	public void selectRowsPerPage500() {
		action.click(rowPerPage500).build().perform();
		if(modArea.isDisplayed()) {
			System.out.println("500 results displayed");
		} else {
			System.out.println("50 results didn't display");
		}
	}
	
	public void selectMultiMat() {
		action.keyDown(Keys.SHIFT).click(firstEle).click(secondEle).click(thirdEle).click(fourthEle).keyUp(Keys.SHIFT).perform();
	}
	
	public void selectLastEles() {
		js.executeScript("arguments[0].scrollIntoView(true);", lastEle);
		action.keyDown(Keys.SHIFT).click(fourthLastEle).click(thirdLastEle).click(secondLastEle).click(lastEle).keyUp(Keys.SHIFT).perform();
	}
	
	public void selectDelete() {
		action.contextClick(lastEle).build().perform();
		action.moveToElement(editOption).build().perform();
		action.click(editdelete).build().perform();
	}
	
	public void deleteSubmit() {
		js.executeScript("arguments[0].scrollIntoView(true);", deleteSubmitButton);
		action.click(deleteSubmitButton).build().perform();
	}
	
	public void rightClickOnMats() {
		action.contextClick(firstEle).build().perform();
		System.out.println("Right click action performed");
	}
	
	public void clickOnCompare() {
		action.click(compareOption).build().perform();
		System.out.println("Compare option clicked");
	}
	
	public void doubleClickOnFirstMat() {
		action.doubleClick(firstEle).build().perform();
		if(sodNavConfirm.isDisplayed()) {
			System.out.println("SOD of selected material is displayed");
		} else {
			System.out.println("SOD of selected material didn't display");
		}
	}
	
	public void selectConfigCol() {
		js.executeScript("arguments[0].click();", configCol);
		action.click(moreButton).build().perform();
	}
	
	public void selectDensityCol() {
		js.executeScript("arguments[0].scrollIntoView(true);", densityCol);
		if(densityCol.isDisplayed()) {
			action.click(densityCheckbox).build().perform();
			System.out.println("Density checkbox selected successfully");
		} else {
			System.out.println("Density option not displayed");
		}
	}
	
	public void clickOnOkButton() {
		action.click(okButton1).build().perform();
		action.click(okButton2).build().perform();
	}
	
	public void verifyDensityCol() {
		if(densityColAdded.isDisplayed()) {
			System.out.println("Density column added in MOD successfully");
		} else {
			System.out.println("Density column is not added on MOD");
		}
	}
	
	public void selectDensityFilter() {
		js.executeScript("arguments[0].scrollIntoView(true);", densityColAdded);
		js.executeScript("arguments[0].click();", densityColAdded);
		action.click(densityFilter).build().perform();
	}
	
	public void setDensityRange() {
		action.click(densityRangeFilter).build().perform();
		js.executeScript("arguments[0].setAttribute('style', 'left: 30%');", densitySlider);
		action.click(okButton2).build().perform();
		//action.dragAndDropBy(densitySlider, 0, -40).build().perform();
	}
}
