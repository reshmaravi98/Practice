package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class resize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.facebook.com");
		
		//resize
		//create object for diment
		//set desired size with height and width
		//apply window on it
		
		Dimension d=new Dimension(300,400);
		c.manage().window().setSize(d);
		
	
		Thread.sleep(3000);
		
		c.quit();
	}

}
