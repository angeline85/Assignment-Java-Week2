package session2.Week2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElementByXPath("//div[@class ='large-6 small-12 columns']/img").click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class ='large-6 small-12 columns'])[3]/img").click();
	 }

}
