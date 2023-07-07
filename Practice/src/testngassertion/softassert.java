package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(testnglistener.listener1.class)
public class softassert {

	@Test
	public void at() {
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c = new ChromeDriver();
	    c.get("http:\\www.google.com");
	    
	    SoftAssert s=new SoftAssert();
	    s.assertEquals(c.getTitle(),"Google");
	    s.assertNotEquals(c.getTitle(), "hi");
	    WebElement e = c.findElementByLinkText("Images");
	    s.assertTrue(e.isDisplayed());
	    s.assertFalse(e.isSelected());
	    
	    
	    c.quit();
	    s.assertAll();
	    
		
	}

}


