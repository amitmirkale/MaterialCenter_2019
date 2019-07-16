package com.wiz.materialCenter.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiz.materialCenter.util.TestBase;

public class ProcessesPage extends TestBase{
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public ProcessesPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Inputs / Outputs']")
	WebElement inputOutputTab;
	
	@FindBy(xpath = "//div[@class='SMObjectsLink']/a[text()='promotedObjects']")
	WebElement promotedObj;
	
	@FindBy(xpath = "//div[@class='SMObjectsLink']/a[text()='demotedObjects']")
	WebElement demotedObj;
	
	@FindBy(xpath = "//a[text()='Download Excel Document']")
	WebElement exportExcelLink;
	
	@FindBy(xpath = "//input[@title='Discard']")
	WebElement discardButton;
	
	@FindBy(xpath = "(//input[@value='Submit'])[1]")
	WebElement discardSubmit;
	
	@FindBy(xpath = "(//span[text()='Done'])[1]")
	WebElement doneStatus;
	
	public void clickOnDiscard() {
		js.executeScript("arguments[0].click();", discardButton);
	}
	
	public void clickOnDiscardSubmit() {
		js.executeScript("arguments[0].click();", discardSubmit);
	}
	
	public void clickOnIOTab() {
		js.executeScript("arguments[0].click();", inputOutputTab);
	}
	
	public void clickOnPromotedObj() {
		js.executeScript("arguments[0].click();", promotedObj);
	}
	
	public void clickOnDemotedObj() {
		js.executeScript("arguments[0].click();", demotedObj);
	}
	
	public void exportExcelSuccess() {
		if(exportExcelLink.isDisplayed()) {
			System.out.println("Download Excel document link is available");
		} else {
			System.out.println("Download Excel document link is not available");
		}
		js.executeScript("arguments[0].click();", exportExcelLink);
		
	}
	
	public void verifyDoneStatus() {
		if(doneStatus.isDisplayed()) {
			System.out.println("Delete process is completed");
		} else { 
			System.out.println("Delete process is not completed");
		}
	}

}
