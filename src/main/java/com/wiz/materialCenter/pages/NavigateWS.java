package com.wiz.materialCenter.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiz.materialCenter.util.TestBase;

public class NavigateWS extends TestBase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	
	public NavigateWS() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[contains(@id,'TreeChoice')]")
	WebElement treeSelection;
	
	@FindBy(xpath = "//select[contains(@id,'TreeChoice')]/option[text()='Libraries']")
	WebElement librariesTree;
	
	@FindBy(xpath = "(//div[@class='NavTree']/ul/li/ul/li[contains(@id,'cYrX')]/img)[1] | (//div[@class='NavTree']/ul/li/ul/li[contains(@id,'gVSK')]/img)[1]")
	WebElement matSelectorLibExpand;
	
	@FindBy(xpath = "(//div[@class='NavTree']/ul/li/ul/li[contains(@id,'XmcPVUwp')]/img)[1]")
	WebElement metalsExpand;
	
	@FindBy(xpath = "(//div[@class='NavTree']/ul/li[contains(@id,'Gmg')]/img)[1]")
	WebElement matFordExpand;
	
	@FindBy(xpath = "//div[@class='NavTree']/ul/li/ul/li/span[text()='METAL']")
	WebElement metalsFord;
	
	@FindBy(xpath = "//div[@class='NavTree']/ul/li/ul/li/span[text()='Metals']")
	WebElement metals;
	
	@FindBy(xpath = "//div[@class='NavTree']/ul/li/ul/li/span[text()='Polymers']")
	WebElement polymers;
	
	@FindBy(xpath = "//table[@class='ModBody']")
	WebElement modArea;
	
	@FindBy(xpath = "//div[@class='NavTree']/ul/li/ul/li/ul/li/span[text()='Ferrous Metals']")
	WebElement ferrousMetals;
	
	@FindBy(xpath = "(//div[@class='NavTree']/ul/li/ul/li/ul/li[contains(@id,'ZMYBb')]/img)[1]")
	WebElement ferrousExpand;
	
	@FindBy(xpath = "//div[@class='NavTree']/ul/li/ul/li/ul/li/span[text()='Nonferrous Metals']")
	WebElement nonferrousMetals;
	
	@FindBy(xpath = "//span[text()='Material Design Data']")
	WebElement matDesignData;
	
	
	public void clickOnTreeSelection() {
		action.click(treeSelection).build().perform();
	}
	
	public void selectLibrariesTree() {
		action.click(librariesTree).build().perform();
		//js.executeScript("arguments[0].click();", librariesTree);
	}
	
	public void clickOnMetalsExpand() {
		js.executeScript("arguments[0].click();", metalsExpand);
	}
	
	public void clickOnMatExpand_ford() {
		js.executeScript("arguments[0].click();", matFordExpand);
	}
	
	public void clickOnMetals() {
		js.executeScript("arguments[0].click();", metals);
		if(modArea.isDisplayed()) {
			System.out.println(" Metals MOD displayed");
		} else {
			System.out.println("Metals MOD didn't display");
		}
	}
	
	public void clickOnMetals_Ford() {
		js.executeScript("arguments[0].click();", metalsFord);
		if(modArea.isDisplayed()) {
			System.out.println(" Metals MOD displayed");
		} else {
			System.out.println("Metals MOD didn't display");
		}
	}
	
	public void clickOnFerrousMetals() {
		js.executeScript("arguments[0].click();", ferrousMetals);
	}
	
	public void clickOnNonFerrousMetals() {
		js.executeScript("arguments[0].click();", nonferrousMetals);
		if(modArea.isDisplayed()) {
			System.out.println(" NonFerrous MOD displayed");
		} else {
			System.out.println("NonFerrous MOD didn't display");
		}
	}
	
	public void clickOnFerrousExpand() {
		js.executeScript("arguments[0].click();", ferrousExpand);
	}
	
	public void clickOnMatSelExpand() {
		js.executeScript("arguments[0].click();", matSelectorLibExpand);
	}
	
	public void clickOnPolymers() {
		js.executeScript("arguments[0].click();", polymers);
		if(modArea.isDisplayed()) {
			System.out.println(" Polymers MOD displayed");
		} else {
			System.out.println("Polymers MOD didn't display");
		}
		// need to add code to verify that polymers MOD is open
	}
	
	public void clickOnMatDesignData() {
		action.click(matDesignData).build().perform();
	}

}
