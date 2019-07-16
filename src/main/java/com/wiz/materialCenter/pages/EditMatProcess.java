package com.wiz.materialCenter.pages;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiz.materialCenter.util.TestBase;

public class EditMatProcess extends TestBase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	MaterialSOD matsod = new MaterialSOD();
	
	public EditMatProcess() {
		PageFactory.initElements(driver, this);
	}
	
	/*Tabs xpath under edit material option*/
	
	@FindBy(xpath = "//span[text()='Init']")
	WebElement initTab;
	
	@FindBy(xpath = "//span[text()='Classification']")
	WebElement classificationTab;
	
	@FindBy(xpath = "//span[text()='Sources']")
	WebElement sourcesTab;
	
	@FindBy(xpath = "//span[text()='Parameters']")
	WebElement parametersTab;
	
	@FindBy(xpath = "//span[text()='Footnotes']")
	WebElement footnotesTab;
	
	@FindBy(xpath = "//span[text()='Properties']")
	WebElement propertiesTab;
	
	@FindBy(xpath = "//span[text()='Preview']")
	WebElement previewTab;
	
	/*xpaths under properties tab*/
	
	@FindBy(xpath = "//td[contains(@class,'MatLabel')]/select")
	WebElement propertySetDropDown;
	
	@FindBy(xpath = "//select[contains(@id,'CreateEditMaterial')]/option[text()='Mechanical']")
	WebElement mechPropertySet;
	
	@FindBy(xpath = "//select[contains(@id,'CreateEditMaterial')]/option[text()='Mechanical - Curves']")
	WebElement mechCurvesPropSet;
	
	@FindBy(xpath = "(//td[@class='MatEditorTableOddRow']/input[contains(@name,'Footnotes')])[1]")
	WebElement selectFootnotesButton;
	
	@FindBy(xpath = "(//input[@value='Edit'])[1]")
	WebElement curveEditButton;
	
	@FindBy(xpath = "(//select[@class='available']/option)[1]")
	WebElement footnoteValue;
	
	@FindBy(xpath = "//input[contains(@id,'FootnoteButtonsOK')]")
	WebElement okButton;
	
	@FindBy(xpath = "//input[contains(@id,'CreateCurveButtonsOK')]")
	WebElement curveOkButton;
	
	@FindBy(xpath = "//input[contains(@id,'CreateEditMaterial:submitBtn')]")
	WebElement submitButton;
	
	@FindBy(xpath = "(//table[contains(@id,'CreateEditMaterial')]/tbody/tr/td/input[@type='text'])[3]")
	WebElement editThirdPropText;
	
	@FindBy(xpath = "(//table[contains(@id,'CreateEditMaterial')]/tbody/tr/td/input[@type='text'])[5]")
	WebElement editFifthPropText;
	
	@FindBy(xpath = "//textarea[contains(@id,'CreateCurveDialog')]")
	WebElement curveEditText;
	
	@FindBy(xpath = "//a[text()='Edit Material']")
	WebElement editMaterialButton;
	
	/*xpaths under footnotes tab*/
	
	@FindBy(xpath = "//textarea[contains(@id,'fnNameText')]")
	WebElement addFootnoteText;
	
	@FindBy(xpath ="//input[@value='Add/Edit Footnote']")
	WebElement addEditButton;
	
	public void clickOnInitTab() {
		action.click(initTab).build().perform();
	}
	
	public void clickOnClassificationTab() {
		action.click(classificationTab).build().perform();
	}
	
	public void clickOnSourcesTab() {
		action.click(sourcesTab).build().perform();
	}
	
	public void clickOnParametersTab() {
		action.click(parametersTab).build().perform();
	}
	
	public void clickOnPropertiesTab() {
		action.click(propertiesTab).build().perform();
	}
	
	public void clickOnFootnotesTab() {
		action.click(footnotesTab).build().perform();
	}
	
	public void clickOnPreviewTab() {
		action.click(previewTab).build().perform();
	}
	
	public void addFootnote() {
		addFootnoteText.click();
		addFootnoteText.clear();
		addFootnoteText.sendKeys(RandomStringUtils.randomAlphanumeric(6));
		action.click(addEditButton).build().perform();
	}
	
	public void editPropDetails() {
		for(int i= 0; i<=2; i++)
		{ 
		action.click(propertiesTab).build().perform();
		editThirdPropText.click();
		editThirdPropText.clear();
		editThirdPropText.sendKeys(RandomStringUtils.randomNumeric(4));
		editFifthPropText.click();
		editFifthPropText.clear();
		editFifthPropText.sendKeys(RandomStringUtils.randomNumeric(2));
		action.click(submitButton).build().perform();
		matsod.clickOnEditMat();
		//action.click(editMaterialButton).build().perform();
		}
	}
	
	public void editMultiplePropDetails() {
		for(int i= 0; i<=2; i++)
		{ 
		action.click(propertiesTab).build().perform();
		editThirdPropText.click();
		editThirdPropText.clear();
		editThirdPropText.sendKeys(RandomStringUtils.randomNumeric(4));
		editFifthPropText.click();
		editFifthPropText.clear();
		editFifthPropText.sendKeys(RandomStringUtils.randomNumeric(2));
		action.click(propertySetDropDown).build().perform();
		action.click(mechCurvesPropSet).build().perform();
		js.executeScript("arguments[0].click();", curveEditButton);
		curveEditText.click();
		curveEditText.clear();
		for(int j= 0; j<=5; j++) 
		{
		curveEditText.sendKeys(RandomStringUtils.randomNumeric(5));
		curveEditText.sendKeys(Keys.SPACE);
		curveEditText.sendKeys(RandomStringUtils.randomNumeric(2));
		curveEditText.sendKeys(Keys.ENTER);
		}
		action.click(curveOkButton).build().perform();
		action.click(submitButton).build().perform();
		matsod.clickOnEditMat();
		//action.click(editMaterialButton).build().perform();
		}
	}
	
	public void selectMechProp() {
		action.click(propertySetDropDown).build().perform();
		action.click(mechPropertySet).build().perform();
	}
	
	public void clickOnFootnotes() {
		action.click(selectFootnotesButton).build().perform();
	}
	
	public void linkFootnote() {
		action.doubleClick(footnoteValue).build().perform();
		action.click(okButton).build().perform();
		action.click(submitButton).build().perform();
	}
}
