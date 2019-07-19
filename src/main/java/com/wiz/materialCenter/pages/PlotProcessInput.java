package com.wiz.materialCenter.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class PlotProcessInput extends TestBase{
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	public PlotProcessInput() {
		PageFactory.initElements(driver, this);
	}
	
	/*Plot type xpath coverages*/
	
	@FindBy(xpath = "//div[@class='XPlotMenu']/select[@id='plotType']")
	WebElement plotTypeDropDown;
	
	@FindBy(xpath = "//select[@id='plotType']/option[text()='Bar Chart']")
	WebElement barChartType;
	
	@FindBy(xpath = "//select[@id='plotType']/option[text()='Scatter Plot']")
	WebElement scatterPlot;
	
	@FindBy(xpath = "//select[@id='plotType']/option[text()='Pie Chart']")
	WebElement pieChartPlot;
	
	@FindBy(xpath = "//select[@id='plotType']/option[text()='Spider Plot']")
	WebElement spiderPlot;
	
	/*X-Values xpath coverages*/
	
	@FindBy(xpath = "//select[@id='xSel']")
	WebElement xValuesDropDown;
	
	@FindBy(xpath = "//select[@id='xSel']/option[text()='Density']")
	WebElement xValueDensity;
	
	/*Y-Values xpath coverages*/
	
	@FindBy(xpath = "//select[@id='ySel']")
	WebElement yValues;
	
	@FindBy(xpath = "//select[@id='ySel']/option[text()='Maximum Short-Term Material Temperature'] | //select[@id='ySel']/option[text()='Ultimate Strength'] | //select[@id='ySel']/option[text()='Ultimate Tensile Strength'] | //select[@id='ySel']/option[contains(text(),'Shear Ultimate Strength')]")
	WebElement yValueUltimateStrength;
	
	@FindBy(xpath = "//select[@id='ySel']/option[text()='Density']")
	WebElement yValueDensity;
	
	@FindBy(xpath = "//option[text()='[68.0 : 572] °F'] | //option[text()='572 °F'] | //option[text()='300 °C']")
	WebElement tempFilter;
	
	/*Plot page buttons xpath coverages*/
	
	@FindBy(xpath = "//input[@value='Plot']")
	WebElement plotButton;
	
	@FindBy(xpath = "//input[@value='PNG' and @type='button']")
	WebElement plotResult;
	
	@FindBy(xpath = "//input[@value='PDF' and @type='button']")
	WebElement plotPdf;
	
	public void clickOnPlotType() {
		action.click(plotTypeDropDown).build().perform();
		//js.executeScript("arguments[0].click();", plotTypeDropDown);
	}
	
	public void clickOnBarChartType() {
		action.moveToElement(barChartType).build().perform();
		action.sendKeys(Keys.ENTER).click(barChartType).build().perform();
	}
	
	public void selectPieChart() {
		action.moveToElement(pieChartPlot).build().perform();
		action.sendKeys(Keys.ENTER).click(pieChartPlot).build().perform();
	}
	
	public void clickOnScatterPlot() {
		action.moveToElement(scatterPlot).build().perform();
		action.sendKeys(Keys.ENTER).click(scatterPlot).build().perform();
	}
	
	public void clickOnSpiderPlot() {
		action.moveToElement(spiderPlot).build().perform();
		action.sendKeys(Keys.ENTER).click(spiderPlot).build().perform();
	}
	
	public void clickOnXValuesDropDown() {
		action.click(xValuesDropDown).build().perform();
	}
	
	public void clickOnDensity() {
		js.executeScript("arguments[0].scrollIntoView(true);", xValueDensity);
		action.click(xValueDensity).build().perform();
	}
	
	public void clickOnUltimateStrength() {
		js.executeScript("arguments[0].scrollIntoView(true);", yValueUltimateStrength);
		action.click(yValueUltimateStrength).build().perform();
	}
	
	public void selectYvalueDensity() {
		js.executeScript("arguments[0].scrollIntoView(true);", yValueDensity);
		action.click(yValueDensity).build().perform();
	}
	
	public void selectMultipleValues() {
		Select select = new Select(yValues);
		select.selectByValue("0");
		select.selectByValue("1");
		select.selectByValue("2");
		select.selectByValue("3");
		select.selectByValue("4");
		select.selectByValue("5");
		select.selectByValue("6");
		select.selectByValue("7");
		select.selectByValue("8");
		select.selectByValue("9");
		select.selectByValue("10");
		select.selectByValue("11");
	}
	
	public void selectFilter() {
		action.click(tempFilter).build().perform();
	}
	
	public void spiderPlotYValues() {
		Select select = new Select(yValues);
		select.selectByValue("9");
		select.selectByValue("15");
		select.selectByValue("17");
		select.selectByValue("19");
	}
	
	public void spiderPlotYValuesFord() {
		Select select = new Select(yValues);
		select.selectByValue("0");
		select.selectByValue("1");
		select.selectByValue("2");
		select.selectByValue("3");
	}
	
	public void clickOnPlotButton() {
		js.executeScript("arguments[0].click();", plotButton);
	}
	
	public void plottingResult() {
		js.executeScript("arguments[0].click();", plotResult);
		/*Boolean ImagePresent = (Boolean) (js.executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", plotResult));
		if (!ImagePresent)
        {
             System.out.println("Image not displayed.");
        } else {
            System.out.println("Image displayed.");
        }*/
	}

}
