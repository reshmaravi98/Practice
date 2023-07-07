package seleniumnavigation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigatetab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.google.com"); 
		
		c.findElementByLinkText("Images").click();
		Thread.sleep(3000);
		
		c.navigate().back();
		TimeUnit.SECONDS.sleep(3);
		
		c.navigate().forward();
		TimeUnit.SECONDS.sleep(3);
		
		c.quit();
		
		
	}

}
