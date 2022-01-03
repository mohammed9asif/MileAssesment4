package com.assesment.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

	private WebDriver driver;
	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By firstTitle = By.xpath("//h1[@class='product-title font-BoldFont text-navy-dark-blue text-26 md:text-30 mdl:text-36 leading-36 md:leading-38 mdl:leading-50 py-10 mdl:pt-0 mdl:pb-20']");
	
	public WebElement getFirstTitle() {
		return driver.findElement(firstTitle);
	}
}
