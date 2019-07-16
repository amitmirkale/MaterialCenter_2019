package com.wiz.materialCenter.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiz.materialCenter.util.TestBase;

public class SecurityProcess extends TestBase {
	
	Actions action = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public SecurityProcess() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[contains(@id,'myWorkspaceActionDialog')]")
	WebElement targetLevel;
	
	@FindBy(xpath = "//select[contains(@id,'myWorkspaceActionDialog')]/option[text()='1-In-Review']")
	WebElement inReviewLevel;
	
	@FindBy(xpath = "//select[contains(@id,'myWorkspaceActionDialog')]/option[text()='2-Production']")
	WebElement productionLevel;
	
	@FindBy(xpath = "//input[@value='Next >']")
	WebElement nextButton;
	
	@FindBy(xpath = "//input[contains(@id,'myWorkspaceActionDialog') and @value='Submit']")
	WebElement submitButtom;
	
	/*Release levels in result*/
	
	@FindBy(xpath = "//td[@class='MatTableEvenRow']/span[text()='1-In-Review'] | //td[@class='MatTableEvenRow']/span[text()='0-In-Work']")
	WebElement inReviewStatus;
	
	@FindBy(xpath = "//td[@class='MatTableEvenRow']/span[text()='2-Production']")
	WebElement prodStatus;
	
	public void clickOnTargetLevel() {
		action.click(targetLevel).build().perform();
	}
	
	public void selectProdLevel() {
		action.click(productionLevel).build().perform();
	}
	
	public void clickOnNext() {
		action.click(nextButton).build().perform();
	}
	
	public void clickOnSubmit() {
		js.executeScript("arguments[0].scrollIntoView(true);", submitButtom);
		js.executeScript("arguments[0].click();", submitButtom);
	}
	
	public void promoteResult() {
		if(prodStatus.isDisplayed()) {
			System.out.println("Release level is: Production");
		} else {
			System.out.println("Promote didn't happen");
		}
	}
	
	public void demoteResult() {
		if(inReviewStatus.isDisplayed()) {
			System.out.println("Release level is: In Review or In Work");
		} else {
			System.out.println("Promote didn't happen");
		}
	}

}
