package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.jqueryui.com/slider/");
		
		//horizontal: x value, y value 0
		c.switchTo().frame(0);
		WebElement ele = c.findElementById("slider");
		Actions act=new Actions(c);
		
		act.dragAndDropBy(ele, 30, 0).build().perform();
		Thread.sleep(3000);
		c.quit();
	}
}
