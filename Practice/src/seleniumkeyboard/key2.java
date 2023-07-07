package seleniumkeyboard;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class key2 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");	
		
	
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.mycontactform.com");
	WebElement ele = ob.findElementByName("user");
	Actions ac= new Actions(ob);
	ac.click(ele).sendKeys("reshma").build().perform();

	//control+a
	ac.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
	Thread.sleep(1500);
	//control+c
	ac.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).build().perform();
	Thread.sleep(1500);
	//tab
	ac.sendKeys(Keys.TAB).build().perform();
	Thread.sleep(1500);
	//control +v
	ac.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
	Thread.sleep(1500);
	//tab
	ac.sendKeys(Keys.TAB).build().perform();
	Thread.sleep(1500);
	//Enter
	ac.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(1500);
	}
}