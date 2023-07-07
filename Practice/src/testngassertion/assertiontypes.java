package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertiontypes {
	
	/*
	 * Assert types
	 * Hard assert, soft assert
	 * 
	 * Hard assert:
	 *Static in nature
	 *commonly used
	 *assertion fails: test stops
	 *
	 *SoftAsserts:
	 *
	 *Nonstatic in nature
	 *assertion fails: proceeds 
	 *invoke assertall to know the statsu and whre issue is
	 *
	 *
	 *assertEqual
	 *assertNotEquals
	 *
	 * */
	
	@Test
	public void at() {
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c = new ChromeDriver();
	    c.get("http:\\www.google.com");
	    
	    Assert.assertEquals(c.getTitle(),"Google");
	    Assert.assertNotEquals(c.getTitle(), "hi");
	    WebElement e = c.findElementByLinkText("Images");
	    Assert.assertTrue(e.isDisplayed());
	    Assert.assertFalse(e.isSelected());
	    
	    c.quit();
	    
	    
		
	}

}
