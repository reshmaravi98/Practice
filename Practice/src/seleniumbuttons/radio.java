package seleniumbuttons;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.letskodeit.com/practice");
		
		
		c.findElementById("bmwradio").click();
		Thread.sleep(3000);
		c.findElementById("benzradio").click();
		Thread.sleep(3000);
		c.findElementById("hondaradio").click();
		Thread.sleep(3000);
		
		
		//multiple
		
		List<WebElement> l = c.findElementsByXPath("//*[@name='cars' and @type='radio']");
			
		for(WebElement x:l) {
			x.click();
		}
		c.quit();
		
		
	}

}
