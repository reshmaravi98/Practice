package seleniumbuttons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.letskodeit.com/practice");
		TimeUnit.SECONDS.sleep(4);
		//c.findElementById("opentab").click();
		//TimeUnit.SECONDS.sleep(4);
		//c.findElementByXPath("//*[@id=\"openwindow\"]").click();
		//TimeUnit.SECONDS.sleep(3);
		
		
		c.findElementById("enabled-example-input").sendKeys("Reshu");
		TimeUnit.SECONDS.sleep(4);
		c.findElementByXPath("//*[@id=\"disabled-button\"]").click();
		TimeUnit.SECONDS.sleep(3);
		c.findElementById("enabled-button").click();
		TimeUnit.SECONDS.sleep(2);
		c.findElementById("enabled-example-input").sendKeys(" Fran");
		TimeUnit.SECONDS.sleep(3);
		c.quit();
		
	}

}
