package seleniumlocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.facebook.com");
		/*
		//id= email
		c.findElementById("email").sendKeys("reshistic");
		
		Thread.sleep(4000);
		
		//name=pass
		c.findElementByName("pass").sendKeys("Reshravi@98");
		
		Thread.sleep(4000);
		
		//name= login 
		c.findElementByName("login").click();
		
		*/
		
		
		//XPATH PRACTICE
		
		c.findElementByXPath("//*[@id=\"email\"]").sendKeys("reshistic");
		TimeUnit.SECONDS.sleep(4);
		
		c.findElementByXPath("//*[@id=\"pass\"]").sendKeys("Reshravi@98");
		TimeUnit.SECONDS.sleep(4);
		
		c.findElementByXPath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button").click();
		TimeUnit.SECONDS.sleep(5);
		
	}

}
