package com.wiz.materialCenter.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiz.materialCenter.util.TestBase;

public class MaterialSOD extends TestBase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	
	public MaterialSOD() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//table[contains(@id,'MenuBar')]/tbody/tr/td/div/span[text()='Actions']")
	WebElement actions;
	
	@FindBy(xpath = "//table[contains(@id,'MenuBar')]/tbody/tr/td/div/span[text()='Create']")
	WebElement create;
	
	@FindBy(xpath = "//table[contains(@id,'MenuBar')]/tbody/tr/td/div/span[text()='Edit']")
	WebElement edit;
	
	@FindBy(xpath = "//table[contains(@id,'MenuBar')]/tbody/tr/td/div/span[text()='Export']")
	WebElement export;
	
	@FindBy(xpath = "//table[contains(@id,'MenuBar')]/tbody/tr/td/div/span[text()='Security']")
	WebElement security;
	
	@FindBy(xpath = "//span[text()='Tools']")
	WebElement toolstab;
	
	@FindBy(xpath = "//a[text()='Export To Excel']")
	WebElement exportExcelOption;
	
	@FindBy(xpath = "(//a[text()='Export To Excel'])[2]")
	WebElement exportTestDataExcel;
	
	@FindBy(xpath = "//input[contains(@id,'ExportToCustomExcel') and @title='Submit']")
	WebElement exportExcelSubmit;
	
	@FindBy(xpath = "//input[contains(@id,'Import') and @title='Submit']")
	WebElement importExcelSubmit;
	
	@FindBy(xpath = "//a[text()='Edit Material']")
	WebElement editMatOption;
	
	@FindBy(xpath = "//span[text()='Property Set']")
	WebElement propertySetFilter;
	
	@FindBy(xpath = "//td[contains(@class,'sod-dialog')]/input[@value='Show All']")
	WebElement selectAllCheckbox;
	
	@FindBy(xpath = "//span[text()='OK']")
	WebElement filterOkButton;
	
	@FindBy(xpath = "//span[@class='noPropSet']")
	WebElement noPropSet;
	
	@FindBy(xpath = "//span[text()='Classification']")
	WebElement classificationTag;
	
	@FindBy(xpath = "//span[text()='Test Data']")
	WebElement testDataTab;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']")
	WebElement firstTestData;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='6']")
	WebElement lastTestData;
	
	@FindBy(xpath = "//span[text()='Mapping']")
	WebElement mappingTab;
	
	@FindBy(xpath = "//div[contains(@id,'schemaMapping')]/img")
	WebElement schemaMappingDropDown;
	
	@FindBy(xpath = "//span[text()='FMD Migration Test Data']")
	WebElement fmdschemaMapping;
	
	/*Actions to be performed under Create section*/
	
	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Material']")
	WebElement createMat;
	
	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Revise MatData For Testing Scenarios']")
	WebElement reviseMat;
	
	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Material (Excel)']")
	WebElement matExcel;
	
	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='CAE Model (Auto)']")
	WebElement caeAutoModel;
	
	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='CAE Model (Manual)']")
	WebElement caeManualModel;
	
	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='CAE Models (Bulk)']")
	WebElement caeBulkModel;
	
	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Test Data']")
	WebElement testData;
	
	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Approval Request']")
	WebElement approvalReq;
	
	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Curve from Equations']")
	WebElement curveEqu;
	
	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Comment']")
	WebElement comment;
	
	/*Actions to be performed under Security section*/
	
	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Promote']")
	WebElement promoteAction;
	
	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Demote']")
	WebElement demoteAction;
	
	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Assign Security Labels']")
	WebElement assignSecurityLabels;
	
	/*Actions to be performed under tools section*/
	
	@FindBy(xpath = "//td[text()='Fix Invalid File Based Attributes Properties SimProcess']")
	WebElement fixAttributes;
	
	@FindBy(xpath = "//td[text()='Import Design Data']")
	WebElement importDesignData;
	
	@FindBy(xpath = "//td[text()='Import Test Data']")
	WebElement importTestData;
	
	@FindBy(xpath = "//td[text()='Pedigree Viewer']")
	WebElement pedigreeViewer;
	
	@FindBy(xpath = "//td[text()='Send Email']")
	WebElement sendEmail;
	
	/*CAE AUTO model result xpaths */
	
	@FindBy(xpath = "//table[contains(@id,'PropertyDocumentSOD')]/tbody/tr/td/div")
	WebElement caeDocFile;
	
	
	
	public void clickOnActions() {
		js.executeScript("arguments[0].click();", actions);
	}
	
	public void clickOnCreate() {
		js.executeScript("arguments[0].click();", create);
	}
	
	public void clickOnEdit() {
		js.executeScript("arguments[0].click();", edit);
	}
	
	public void clickOnExport() {
		js.executeScript("arguments[0].click();", export);
	}
	
	public void clickOnSecurity() {
		js.executeScript("arguments[0].click();", security);
	}
	
	public void clickOnCreateMat() {
		js.executeScript("arguments[0].click();", createMat);
	}
	
	public void clickOnReviseMat() {
		js.executeScript("arguments[0].click();", reviseMat);
	}
	
	public void clickOnMatExcel() {
		js.executeScript("arguments[0].click();", matExcel);
	}
	
	public void clickOnCAEAuto() {
		js.executeScript("arguments[0].click();", caeAutoModel);
	}
	
	public void clickOnCAEManual() {
		js.executeScript("arguments[0].click();", caeManualModel);
	}
	
	public void clickOnCAEBulk() {
		js.executeScript("arguments[0].click();", caeBulkModel);
	}
	
	public void clickOnTestData() {
		js.executeScript("arguments[0].click();", testData);
	}
	
	public void clickOnApprovalReq() {
		js.executeScript("arguments[0].click();", approvalReq);
	}
	
	public void clickOnCurveEqu() {
		js.executeScript("arguments[0].click();", curveEqu);
	}
	
	public void clickOnComment() {
		js.executeScript("arguments[0].click();", comment);
	}
	
	public void clickOnPromoteAction() {
		js.executeScript("arguments[0].click();", promoteAction);
	}
	
	public void clickOnDemoteAction() {
		js.executeScript("arguments[0].click();", demoteAction);
	}
	
	public void clickOnEditMat() {
		js.executeScript("arguments[0].click();", editMatOption);
	}
	
	public void clickOnMappingTab() {
		action.click(mappingTab).build().perform();
	}
	
	public void clickOnExportExcel() {
		js.executeScript("arguments[0].click();", exportExcelOption);
	}
	
	public void exportExcelSubmit() {
		js.executeScript("arguments[0].click();", exportExcelSubmit);
	}
	
	public void importTestDataSubmit() {
		action.click(importExcelSubmit).build().perform();
	}
	
	public void selectImportTestData() {
		action.click(toolstab).build().perform();
		action.click(importTestData).build().perform();
	}
	
	public void propSetSelect() {
		js.executeScript("arguments[0].click();", propertySetFilter);
		action.click(selectAllCheckbox).build().perform();
		action.click(filterOkButton).build().perform();
	}
	
	public void selectTestData() {
		action.click(testDataTab).build().perform();
		action.keyDown(Keys.SHIFT).click(firstTestData).click(lastTestData).keyUp(Keys.SHIFT).build().perform();
	}
	
	public void selectExportTestDataExcel() {
		action.click(exportTestDataExcel).build().perform();
	}
	
	public void selectSchemaMapping() {
		action.click(schemaMappingDropDown).build().perform();
		action.click(fmdschemaMapping).build().perform();
	}
	
	public void verifyNoPropMsg() {
		if(noPropSet.isDisplayed()) {
			System.out.println("No property set selected msg displayed");
		} else {
			System.out.println("Msg doesn't display");
		}
	}
	
	public void verifyPropSetDisplay() {
		if(classificationTag.isDisplayed()) {
			System.out.println("Property set filter applied successfully");
		} else {
			System.out.println("Property set filter not applied successfully");
		}
	}

}
