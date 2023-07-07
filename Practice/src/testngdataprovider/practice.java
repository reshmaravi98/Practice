package testngdataprovider;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class practice {

	ChromeDriver c;
	
	@DataProvider(name= "Reshu" )
	public static Object[][] DataSet(){
		Object[][] o= {
		{"reshistic", "Reshravi@98"},
		{"reshu", "reshu"},
		{"reshistic","godsgif"},
		{"reshu", "Reshravi@98"}
	
		};
		return o;
		}
	
	@Test(dataProvider= "Reshu")
	public void fb(String user, String pass) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		c = new ChromeDriver();
	    c.get("http:\\www.facebook.com");
	    c.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    c.findElementById("email").sendKeys(user);
	    c.findElementById("pass").sendKeys(pass);
	    c.findElementByName("login").click();
	    
	    Thread.sleep(2000);
	    c.quit();
		
		
	}

}
