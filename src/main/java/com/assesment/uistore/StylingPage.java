package com.assesment.uistore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StylingPage {

		
private WebDriver driver;
	
	public StylingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By headingResult = By.id("tabContainer");
	
	By headResults = By.xpath("//ul//li");
	
	public List<WebElement> getContianerResults(){
		return driver.findElements(headingResult);
	}
	
	public List<WebElement> getHeadResults(){
		return driver.findElements(headResults);
	}
	
	public Boolean getResultFromList(String heading) {
		List<WebElement> list =getHeadResults();
		for(int i=0;i<10;i++) {
			String result =list.get(i).findElement(By.tagName("a")).getText();
			if(result.contentEquals(heading))
				return true;
		}
		
		return false;
	
	
	}
}
