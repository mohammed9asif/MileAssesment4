package com.assesment.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MACH3PrdocutsUI {

private WebDriver driver;
	
	public MACH3PrdocutsUI(WebDriver driver) {
		this.driver = driver;
	}
	
	By explore = By.xpath("//*[@id=\"main-content\"]/div/div[4]/div/div[1]/div/div[1]/div/a/span[1]");
	
	public WebElement getExplore() {
		return driver.findElement(explore);
	}
}
