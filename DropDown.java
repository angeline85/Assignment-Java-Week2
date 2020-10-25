package session2.Week2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		Select dd1 = new Select(driver.findElementById("dropdown1"));
		dd1.selectByIndex(2);
		
		Select dd2 = new Select(driver.findElementByName("dropdown2"));
		dd2.selectByVisibleText("Selenium");
		
		Select dd3 = new Select(driver.findElementById("dropdown3"));
		dd3.selectByValue("4");
		
		Select dd4 = new Select(driver.findElementByClassName("dropdown"));
         List<WebElement> WebElement = dd4.getOptions();
         int count = WebElement.size();
		
		System.out.println(count);
		
		WebElement Element = driver.findElementByXPath("(//div[@class ='example']/select)[5]");
//		Select dd5 =new Select(Element);
		Element.sendKeys("Appium");
		
		Select dd6 = new Select(driver.findElementByXPath("(//div[@class ='example']/select)[6]"));
		dd6.selectByValue("1");
		
		driver.close();
	
		
		
		
		
		
		
	}

}
