package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class practice_linktext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.seleniumeasy.com/");
		Thread.sleep(4000);		
		//c.findElementByLinkText("Apache Poi").click();
		
		c.findElementByPartialLinkText("pache").click();
		Thread.sleep(4000);
		
	
	}

}
