package session2.Week2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead
 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Duplicate Lead:
		ChromeDriver driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();

		driver.get("http://leaftaps.com/opentaps/control/main");
//			1	Launch the browser
		//			2	Enter the username
		driver.findElementById("username").sendKeys("demosalesmanager");
//			3	Enter the password
		driver.findElementById("password").sendKeys("crmsfa");
//			4	Click Login
		driver.findElementByClassName("decorativeSubmit").click();
//			5	Click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
//			6	Click Leads link
		driver.findElementByPartialLinkText("Leads").click();
//			7	Click Find leads
		driver.findElementByPartialLinkText("Find Leads").click();
//			8	Click on Email
		driver.findElementByLinkText("Email").click();
//			9	Enter Email
		driver.findElementByName("emailAddress").sendKeys("xyz@gmail.com");
//			10	Click find leads button
		driver.findElementByXPath("(//*[text()='Find Leads'])[3]").click();
		Thread.sleep(3000);
//			11	Capture name of First Resulting lead
		String firstname = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")
				.getText();
//			12	Click First Resulting lead
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]").click();
		// 13 Click Duplicate Lead
		driver.findElementByPartialLinkText("Duplicate Lead").click();
//			14	Verify the title as 'Duplicate Lead'
		String check = driver.findElementByXPath("//div[@class='x-panel-header sectionHeaderTitle']").getText();
		String str = "Duplicate Lead";
		
		{
			if(check.equalsIgnoreCase (str))
			System.out.println("Title is correct");
			else
				System.out.println("Title is incorrect");	
		}
		
		
		// 15 Click Create Lead
		driver.findElementByXPath("//*[@value ='Create Lead']").click();
		// 16 Confirm the duplicated lead name is same as captured name
	
		String Duplicate = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(Duplicate);
		System.out.println(firstname);
		if (firstname.equalsIgnoreCase(Duplicate)) {
			System.out.println("The First Name is correct");
		}
		else		{
		System.out.println("The First Name is not correct");
		}
		// 17 Close the browser (Do not log out)
		driver.close();

	}

}
