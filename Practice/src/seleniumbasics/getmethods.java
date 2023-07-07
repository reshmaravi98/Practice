package seleniumbasics;


import org.openqa.selenium.Point;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.facebook.com");
		
		System.out.println(c.getCurrentUrl());
		System.out.println(c.getTitle());
			
		Dimension d=c.manage().window().getSize();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
		
		Point p=c.manage().window().getPosition();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		Capabilities ca= c.getCapabilities();
		System.out.println(ca.getBrowserName());
		System.out.println(ca.getVersion());
		System.out.println(ca.getPlatform());
		
		
		c.quit();
	
	
	
	}

}
