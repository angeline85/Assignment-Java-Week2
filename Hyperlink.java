package session2.Week2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
          
		driver.findElementByPartialLinkText("Go to Home Page").click();
		driver.navigate().back();
		String Print = driver.findElementByPartialLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
		System.out.println(Print);
		
		driver.findElementByXPath("//*[text()='Verify am I broken?']").click();
	   String Title = driver.getTitle();
	   
	   if (Title.contains("HTTP Status 404"))	 
	   {
		   System.out.println("Tilte is correct");
	   }
	   else
	   {
			   System.out.println("Tilte is incorrect");	   
		   }
	   
	   driver.navigate().back();
	   
	   driver.findElementByPartialLinkText("Go to Home Page").click();
	   driver.navigate().back();
	   
	}

}
