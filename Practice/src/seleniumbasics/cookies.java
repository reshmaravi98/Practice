package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.facebook.com");
		
		//delete cookies
		
		c.manage().deleteAllCookies();
		//get size of cookies
		Set<Cookie> s = c.manage().getCookies();
		System.out.println("Number of cookies is: "+ s.size());
		
		c.quit();
	}

}
