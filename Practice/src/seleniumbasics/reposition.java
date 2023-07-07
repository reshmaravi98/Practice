package seleniumbasics;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class reposition {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.facebook.com");
		
		
		Point p=new Point(100,200);
		c.manage().window().setPosition(p);
		
		
		Thread.sleep(3000);
		
		c.quit();

	}

}
