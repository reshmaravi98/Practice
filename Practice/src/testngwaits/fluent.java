package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class fluent {
	
	@Test
	public void imp() {
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c = new ChromeDriver();
	    c.get("http:\\www.google.com");
	    
	    FluentWait f=new FluentWait(c);
	    f.withTimeout(6000,TimeUnit.SECONDS);
	    
	    f.pollingEvery(2000, TimeUnit.SECONDS);
	    
	    f.until(ExpectedConditions.titleIs("Google"));
	    
	    c.quit();
	    
	    
}}
