package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.facebook.com");
		
		Thread.sleep(4000);
		
		//linktext
		//c.findElementByLinkText("Forgotten password?").click();
		
		//partial linktext
		c.findElementByPartialLinkText("Forgotten").click();
		
		Thread.sleep(5000);
		
	}

}
