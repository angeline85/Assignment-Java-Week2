package session2.Week2;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		Point location = driver.findElementById("position").getLocation();
		int x = location.getX();
		System.out.println(x);
		int y= location.getY();
		System.out.println(y);
		System.out.println(driver.findElementById("color").getCssValue("background-color"));
		System.out.println(driver.findElementById("size").getSize());
    	driver.findElementById("home").click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
