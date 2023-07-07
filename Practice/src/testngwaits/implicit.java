package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class implicit {
	
	@Test
	public void imp() {
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c = new ChromeDriver();
	    c.get("http:\\www.google.com");
	    c.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	    System.out.println(c.getTitle());
	    System.out.println(c.getCurrentUrl());
	   WebElement e = c.findElementByLinkText("Images");
	   e.click();
		
	}

}
