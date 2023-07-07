package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class functions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.mycontactform.com");
		
		
		WebElement el = c.findElementByName("btnSubmit");
		/* Mouse Activiities
		 * Left click
		 * right click - context click
		 * hover - moveto element
		 * drag and drop
		 * drag and drop by
		 * click hold release
		 * 
		 * create ob for actions class
		 * pass driver instance as input
		 * 
		 * */
		Actions act=new Actions(c);
		act.click(el).build().perform();
		act.doubleClick(el).build().perform();
		
		Thread.sleep(3000);
		c.quit();
		
	}

}
