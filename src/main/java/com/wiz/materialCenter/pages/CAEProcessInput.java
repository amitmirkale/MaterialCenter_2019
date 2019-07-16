package com.wiz.materialCenter.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiz.materialCenter.util.TestBase;

public class CAEProcessInput extends TestBase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public CAEProcessInput() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[contains(@id,'CreateMaterialModel') and @value='Submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//input[@value='OK' and contains(@id,'ConfirmDlg')]")
	WebElement caeRevisionDlg;
	
	public void clickOnSubmit() {
		js.executeScript("arguments[0].scrollIntoView(true);", submitButton);
		js.executeScript("arguments[0].click();", submitButton);
		/*try {
			js.executeScript("arguments[0].click();", caeRevisionDlg);
		} catch(Exception e) {
			System.out.println("Revision dialog didn't come");
		}*/
	}

}
