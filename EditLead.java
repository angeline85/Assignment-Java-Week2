package session2.Week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();

		driver.get("http://leaftaps.com/opentaps/control/main");
//	     Enter the username
		driver.findElementById("username").sendKeys("demosalesmanager");
		// Enter the password
		driver.findElementById("password").sendKeys("crmsfa");
		// Enter the password
		driver.findElementByClassName("decorativeSubmit").click();
		// Click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		// Click Leads link
		driver.findElementByPartialLinkText("Leads").click();
		// Click Find leads
		driver.findElementByPartialLinkText("Find Leads").click();
//		   8	Enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("ABC");
//	   9	Click Find leads button
		driver.findElementByXPath("(//*[text()='Find Leads'])[3]").click();
		driver.manage().window().maximize();
//	   10	Click on first resulting lead	   
		driver.findElementByXPath("//*[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a")
				.click();
//		   11	Verify title of the page
		System.out.println(driver.getTitle());
//	   12	Click Edit
		driver.findElementByLinkText("Edit").click();
//	   13	Change the company name
		driver.findElementById("updateLeadForm_companyName").clear();
		String CompanyName = "XYZ";
		driver.findElementById("updateLeadForm_companyName").sendKeys(CompanyName);
//		   14	Click Update
		driver.findElementByXPath("//*[@value ='Update']").click();
//		   15	Confirm the changed name appears
		String Compare = driver.findElementById("viewLead_companyName_sp").getText();
		// Have to trim
		System.out.println(Compare);
 String str = Compare.trim();
 System.out.println(str);
 		if(CompanyName.equalsIgnoreCase (str)) {
			System.out.println("Okay");
		}
 		else
 		{
			System.out.println("not okay");
		}
		driver.close();
//		   16	Close the browser (Do not log out)
	}

}
