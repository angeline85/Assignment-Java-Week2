package session2.Week2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     ChromeDriver driver = new ChromeDriver();
     
     WebDriverManager.chromedriver().setup();
     
     driver.get("http://leaftaps.com/opentaps/control/main");
     
   driver.findElementById("username").sendKeys("demosalesmanager");
   driver.findElementById("password").sendKeys("crmsfa");
   driver.findElementByClassName("decorativeSubmit").click();
   driver.findElementByLinkText("CRM/SFA").click();
   driver.findElementByPartialLinkText("Leads").click();
   driver.findElementByPartialLinkText("Create Lead").click();  
   driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
   driver.findElementById("createLeadForm_firstName").sendKeys("ABC");
   driver.findElementById("createLeadForm_lastName").sendKeys("DEF");
   
   Select Source = new Select(driver.findElementById("createLeadForm_dataSourceId"));
   Source.selectByVisibleText("Employee");
   Select MarketingCampaign = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
   MarketingCampaign.selectByValue("9001");
   Select Ownership = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
   Ownership.selectByIndex(5);
   Select Country = new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
  Country.selectByVisibleText("India");
  
  driver.findElementByName("primaryPhoneNumber").sendKeys("99");
     
   driver.findElementByName("submitButton").click();
   System.out.println(driver.getTitle());
  
	}

}
