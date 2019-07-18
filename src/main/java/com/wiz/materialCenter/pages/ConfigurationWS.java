package com.wiz.materialCenter.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.wiz.materialCenter.util.TestBase;

public class ConfigurationWS extends TestBase {
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	
	public ConfigurationWS() {
		PageFactory.initElements(driver, this);
	}
	
	/*Xpaths under Materials Administration tab*/
	
	@FindBy(xpath = "//input[contains(@name,'expandcollapseAdminButton')]")
	WebElement toggleMatAdmin;
	
	@FindBy(xpath = "//a[text()='Property Categories']")
	WebElement propertyCategories;
	
	@FindBy(xpath = "//a[text()='Material Property Definitions']")
	WebElement matPropDef;
	
	@FindBy(xpath = "//a[text()='Material Schemas']")
	WebElement matSchemas;
	
	@FindBy(xpath = "//a[text()='Databank Mappings']")
	WebElement databankMappings;
	
	@FindBy(xpath = "//a[text()='Excel Mappings']")
	WebElement excelMappings;
	
	@FindBy(xpath = "//a[text()='Xml Mappings']")
	WebElement xmlMappings;
	
	@FindBy(xpath = "//a[text()='CAE Mappings']")
	WebElement caeMappings;
	
	@FindBy(xpath = "//a[text()='Curve Equations']")
	WebElement curveEqu;
	
	@FindBy(xpath = "//a[text()='Curve Equation Mappings']")
	WebElement curveEquMappings;
	
	@FindBy(xpath = "//a[text()='Specimen Definitions']")
	WebElement speciDef;
	
	@FindBy(xpath = "//a[text()='Test Definitions']")
	WebElement testDef;
	
	@FindBy(xpath = "//a[text()='Test Templates']")
	WebElement testTemplates;
	
	@FindBy(xpath = "//a[text()='Approver Lists']")
	WebElement approverLists;
	
	@FindBy(xpath = "//a[text()='EMV Connections']")
	WebElement emvConnections;
	
	@FindBy(xpath = "//a[text()='Update Base Mapping']")
	WebElement updateBaseMapping;
	
	@FindBy(xpath = "//a[text()='Configure Material Attributes']")
	WebElement configMatAttributes;
	
	@FindBy(xpath = "//a[text()='Work Request Templates']")
	WebElement workReqTemp;
	
	@FindBy(xpath = "//a[text()='Material Displays']")
	WebElement matDisplays;
	
	/*Xpaths under Materials Data Owner tab*/
	
	@FindBy(xpath = "//input[contains(@name,'expandcollapseDataOwnerButton')]")
	WebElement toggleMatDataOwner;
	
	@FindBy(xpath = "//a[text()='Create Material']")
	WebElement createMat;
	
	@FindBy(xpath = "//a[text()='Import Excel File']")
	WebElement importExcel;
	
	@FindBy(xpath = "//a[text()='Import Text File']")
	WebElement importText;
	
	@FindBy(xpath = "//a[text()='Import Xml File']")
	WebElement importXml;
	
	@FindBy(xpath = "//a[text()='Data Sources']")
	WebElement dataSources;
	
	@FindBy(xpath = "//a[text()='Export Processes']")
	WebElement exportProcesses;
	
	@FindBy(xpath = "//a[text()='Submitted Approval Requests']")
	WebElement approvalRequest;
	
	@FindBy(xpath = "//a[text()='Disclaimers']")
	WebElement disclaimers;
	
	@FindBy(xpath = "//a[text()='Security Labels']")
	WebElement securityLabels;
	
	@FindBy(xpath = "//a[text()='Compliance Status Plot']")
	WebElement compliancePlot;
	
	/*Xpaths under All Materials Users tab*/
	
	@FindBy(xpath = "//input[contains(@name,'expandcollapseAllUsersButton')]")
	WebElement toggleMatUsers;
	
	@FindBy(xpath = "//a[text()='Libraries']")
	WebElement libraries;
	
	@FindBy(xpath = "//a[text()='Pending Approval Requests']")
	WebElement pendingApprovalReq;
	
	@FindBy(xpath = "//a[text()='Configure Find Similar']")
	WebElement configFindSimilar;
	
	/*Xpaths for import excel file*/
	
	@FindBy(xpath = "//label[text()=' Fixed'] | //input[@value='excelFixed']")
	WebElement fixedFormat;
	
	@FindBy(xpath = "(//img[contains(@id,'ImportFromExcel')])[1]")
	WebElement projectDropDown;
	
	@FindBy(xpath = "(//img[contains(@id,'ImportFromExcel')])[2]")
	WebElement schemaDropDown;
	
	@FindBy(xpath = "//div[@id='RecentObjSel']/table/tbody/tr/td/span[text()='/Data'] | //div[@id='RecentObjSel']/table/tbody/tr/td/span[text()='/Data/Active/TASE']")
	WebElement dataProject;
	
	@FindBy(xpath = "//table[@class='RecentObjSelTbl']/tbody/tr/td/span[text()='MasterMetals']")
	WebElement masterMetalsSchema;
	
	@FindBy(xpath = "//input[@id='httpFile']")
	WebElement uploadExcel;
	
	@FindBy(xpath = "//img[@class='BfsButton']")
	WebElement removeExcelButton;
	
	@FindBy(xpath = "//input[@value='Submit' and @title='Submit']")
	WebElement submitExcelButton;
	
	public void clickOnImportExcel() {
		action.click(importExcel).build().perform();
	}
	
	public void clickOnFixedFormat() {
		action.click(fixedFormat).build().perform();
	}
	
	public void selectDataProject() {
		action.click(projectDropDown).build().perform();
		js.executeScript("arguments[0].click();", dataProject);
	}
	
	public void selectMasterMetalSchema() {
		action.click(schemaDropDown).build().perform();
		js.executeScript("arguments[0].click();", masterMetalsSchema);
	}
	
	public ConfigurationWS uploadExcel(String excelSheet) {
		//action.click(uploadExcel).build().perform();
		uploadExcel.sendKeys(excelSheet);
		return new ConfigurationWS();
	}
	
	public void selectExcelToUplaod() {
		uploadExcel(prop.getProperty("excelPath"));
		if(removeExcelButton.isDisplayed()) {
			System.out.println("Excel file to upload is selected");
		} else { 
			System.out.println("Excel file to upload is not yet selected");
		}
	}
	
	public void selectTestDataToUplaod() {
		uploadExcel(prop.getProperty("testDataPath"));
		if(removeExcelButton.isDisplayed()) {
			System.out.println("File to upload is selected");
		} else { 
			System.out.println("File to upload is not yet selected");
		}
	}
	
	public void clickOnSubmitExcel() {
		js.executeScript("arguments[0].click();", submitExcelButton);
	}
	
}
