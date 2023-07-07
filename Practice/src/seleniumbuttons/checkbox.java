package seleniumbuttons;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.letskodeit.com/practice");
		
		
		c.findElementById("bmwcheck").click();
		Thread.sleep(3000);
		c.findElementById("benzcheck").click();
		Thread.sleep(3000);
		c.findElementById("hondacheck").click();
		Thread.sleep(3000);
		
		
		//multiple
		
		List<WebElement> l = c.findElementsByXPath("//*[@name= 'cars' and @type='checkbox']");
		
		for(WebElement x:l) {
			x.click();
			
		}
		
		c.quit();
		
	}

}
