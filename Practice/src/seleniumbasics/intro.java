package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class intro {

	public static void main(String[] args) throws InterruptedException {
		//download chrome driver, sleneium jars and import in java build path
		//configure chrome driver
		//create obj for chromedriver
		//open website
		
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.facebook.com");
		//c.manage().window().maximize();
		//c.manage().window().fullscreen();
		c.navigate().refresh();
		Thread.sleep(3000);
		c.quit(); 
	}

}
