package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class zoom {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.facebook.com");
		
		
		c.executeScript("document.body.style.zoom='200%'");
		
		Thread.sleep(7000);
		
		c.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(7000);
		c.executeScript("document.body.style.zoom='20%'");
		Thread.sleep(7000);
		c.quit();
		
		
		
	}

}
