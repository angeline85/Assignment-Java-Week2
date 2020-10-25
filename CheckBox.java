package session2.Week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='example']/div/input").click();
		boolean Checked = driver.findElementByXPath("//div[@class='example'][2]/div/input").isSelected();
		System.out.println(Checked);
		driver.findElementByXPath("//div[@class='example'][3]/div[2]").click();
		for (int i = 1; i <= 5; i++) {
			driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following::input["+i+"]").click();
        driver.close();
		}
}
}
