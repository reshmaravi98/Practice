package seleniumlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.facebook.com");
		
		List<WebElement> l = c.findElementsByTagName("img");
		System.out.println("Number of images in fb website is: "+ l.size());
		
		List<WebElement> l1 = c.findElementsByTagName("a");
		System.out.println("Number of links in fb page: "+ l1.size());
		
		List<WebElement> l2 = c.findElementsByTagName("div");
		System.out.println("Number of elements in fb page: "+l2.size());
		
		c.quit();

	}

}
