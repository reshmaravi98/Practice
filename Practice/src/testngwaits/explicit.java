package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class explicit {
	
	
	/*Webdriver sync tech
	 * */

	@Test
	public void imp() {
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c = new ChromeDriver();
	    c.get("http:\\www.google.com");
	    WebDriverWait w=new WebDriverWait(c,5);
	   // w.until(ExpectedConditions.alertIsPresent());
	    w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.name("Google")));
	    w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("div")));
	    w.until(ExpectedConditions.titleIs("Google"));
	    w.until(ExpectedConditions.titleContains("oo"));
	    c.quit();
	    
}
}
