package com.assesment.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultsPage {

	
private WebDriver driver;
	
	public ResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By resultsTitle = By.cssSelector("h1[class*='search-heading']");
	
	public WebElement getResultsTitle() {
		return driver.findElement(resultsTitle);
	}
	
}
