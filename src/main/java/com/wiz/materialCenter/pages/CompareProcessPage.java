package com.wiz.materialCenter.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiz.materialCenter.util.TestBase;

public class CompareProcessPage extends TestBase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	
	public CompareProcessPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='Compare Results']")
	WebElement compareResult;
	
	public void compareResult() {
		if(compareResult.isDisplayed()) {
			System.out.println("Compare results displayed");
		} else {
			System.out.println("Compare results didn't display");
		}
	}

}
