package session2.Week2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/radio.html");
		
		driver.findElementById("yes").click();
		System.out.println(driver.findElementByXPath("//label[@for='Checked']").isSelected());
		
		
	}

}
