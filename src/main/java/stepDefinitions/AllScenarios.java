package stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.assement.reusablecomponents.WebdriverHelper;
import com.assesment.uistore.LandingPageUI;
import com.assesment.uistore.MACH3PrdocutsUI;
import com.assesment.uistore.ProductsPage;
import com.assesment.uistore.ResultsPage;
import com.assesment.uistore.StylingPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllScenarios {
	
	WebdriverHelper driverHelper;
	WebDriver driver;
	@Given("Initialize Driver")
	public void initialize_driver() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		driverHelper = new WebdriverHelper();
		driver =driverHelper.getDriver();
		
		
	}

	@Given("and Open Browser")
	public void and_open_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driverHelper.OpenBrowser();
	}

	@Given("load the url {string}")
	public void load_the_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(string);
	}
	@When("Hover over {string} tab")
	public void hover_over_tab(String string) {
	    // Write code here that turns the phrase above into concrete actions
		LandingPageUI lpage = new LandingPageUI(driver);
		Actions action = new Actions(driver);
		List<WebElement> list =lpage.getNavBarElements();
		WebElement element = null;
		if(string.equals("Learn"))
			element = list.get(0);
		else if(string.equals("Products"))
			element = list.get(1);
		action.moveToElement(element).build().perform();
	}

	@When("Choose MACH3 under by Brands from top down")
	public void choose_mach3_under_by_brands_from_top_down() {
	    // Write code here that turns the phrase above into concrete actions
		LandingPageUI lpage = new LandingPageUI(driver);
		lpage.getMach3().click();
		MACH3PrdocutsUI mpage = new MACH3PrdocutsUI(driver);
		mpage.getExplore().click();
	}
	
	@Then("I check if {string} is present in prodcuts")
	public void i_check_if_is_present_in_prodcuts(String string) {
	    // Write code here that turns the phrase above into concrete actions
		ProductsPage pg = new ProductsPage(driver);
	    Assert.assertEquals(pg.getFirstTitle().getText(), string);
	}
	
	
	@When("search for {string}")
	public void search_for(String string) {
	    // Write code here that turns the phrase above into concrete actions
		LandingPageUI lpage = new LandingPageUI(driver);
		
		WebElement search =lpage.getSearchIcon();
		search.click();
		search.sendKeys(string);
		search.sendKeys(Keys.ENTER);
		
		
	}
	
	@Then("check if results contain {string}")
	public void check_if_results_contain(String string) {
	    // Write code here that turns the phrase above into concrete actions
		ResultsPage rpage = new ResultsPage(driver);
		Assert.assertEquals(rpage.getResultsTitle().getText(), string);
	}
	
	@When("click styling in drop down menu")
	public void click_styling_in_drop_down_menu() {
	    // Write code here that turns the phrase above into concrete actions
		LandingPageUI lpage = new LandingPageUI(driver);
		lpage.getStyling().click();
	}
	
	@Then("verify if we have ?Facial Hair Styles: The Anchor Beard? in results articles")
	public void verify_if_we_have_facial_hair_styles_the_anchor_beard_in_results_articles() {
	    // Write code here that turns the phrase above into concrete actions
	    StylingPage sp =new StylingPage(driver);
	    sp.getContianerResults().get(1);
	    
	}
	
	@Then("verify if we have {string} in results articles")
	public void verify_if_we_have_in_results_articles(String string) {
	    // Write code here that turns the phrase above into concrete actions
		StylingPage sp =new StylingPage(driver);
		Boolean flag =sp.getResultFromList(string);
		Assert.assertTrue(false);
		
	}

}
