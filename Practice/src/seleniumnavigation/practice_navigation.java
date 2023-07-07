package seleniumnavigation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class practice_navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http:\\www.google.com");
	    driver.manage().window().maximize();
	    
	    //open new tab
	    driver.executeScript("window.open('https://www.seleniumeasy.com/','_blank');");
	    
	    //step2:
	    //get control of first tab: driver.getwindowhandle() -parent
	    //get control of both tabs: driver.getwindowhandle() - s-{}
	    
	    String parent = driver.getWindowHandle();
	    Set<String> s = driver.getWindowHandles();
	    
	    Iterator<String> i = s.iterator();
	    
	    while(i.hasNext())
	    {
	    String child_window = i.next();
	    if(!parent.equals(child_window)) {
	    driver.switchTo().window(child_window);
	    System.out.println(driver.getTitle());
	    TimeUnit.SECONDS.sleep(3);
	    driver.findElementByLinkText("Maven").click();
	    TimeUnit.SECONDS.sleep(3);
	    driver.close();
	    }
	    }
	    driver.switchTo().window(parent);
	    System.out.println(driver.getTitle());
	    TimeUnit.SECONDS.sleep(3);
	    driver.quit();
	}

}
