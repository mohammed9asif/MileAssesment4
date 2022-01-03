

Feature: In the products tab choosing MACH3
  

  Scenario: Verify if Gillete Mach3 is displayed
    Given Initialize Driver
    And and Open Browser
    And load the url "https://www.gillette.co.in/en-in"
    When Hover over "Products" tab
    And Choose MACH3 under by Brands from top down
    Then I check if "Gillette MACH3 Turbo" is present in prodcuts
   

	Scenario: Searching for Razor
		Given Initialize Driver
    And and Open Browser
    And load the url "https://www.gillette.co.in/en-in"
    When search for "Razor"
    Then check if results contain "Results For Razor" 
  
  Scenario: Verify if articles contain Facial hair styles
  	Given Initialize Driver
    And and Open Browser
    And load the url "https://www.gillette.co.in/en-in"
    When Hover over "Learn" tab
    And  click styling in drop down menu
    Then verify if we have "Facial Hair Styles: The Anchor Beard" in results articles
    
    
 