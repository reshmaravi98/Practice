package seleniumkeyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class key1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.google.com/");
		c.findElementByName("q");
		Actions act=new Actions(c);
		act.sendKeys("Hi").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		c.quit();
		
	}

}
