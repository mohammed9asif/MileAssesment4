package com.assesment.uistore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageUI {

	By navbar = By.xpath("//div[@class='block px-20 h-full']");
	By mach3 = By.linkText("MACH3");
	By searchIcon = By.id("searchIcon");
	By styling = By.xpath("//*[@id=\"headerMenu\"]/div/nav/div/div[1]/div/div/div/div/div[1]/div[1]/a");
	
	private WebDriver driver;
	
	public LandingPageUI(WebDriver driver) {
		this.driver = driver;
	}
	
	public List<WebElement> getNavBarElements() {
		List<WebElement> list =driver.findElements(navbar);
		return list;
	}
	
	public WebElement getMach3() {
		return driver.findElement(mach3);
	}
	
	public WebElement getSearchIcon() {
		return driver.findElement(searchIcon);
	}
	
	public WebElement getStyling() {
		return driver.findElement(styling);
	}
	
}
