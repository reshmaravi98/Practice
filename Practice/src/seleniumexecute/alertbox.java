package seleniumexecute;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");	
		ChromeDriver c= new ChromeDriver();
		c.get("http://www.mycontactform.com");
		
		c.executeScript("alert('time out')");
		Thread.sleep(3000);
		Alert al = c.switchTo().alert();
		al.accept();
		Thread.sleep(3000);
		
		c.executeScript("window.confirm('Time outt')");
		Thread.sleep(3000);
		
		c.switchTo().alert();
		al.accept();
		Thread.sleep(3000);
		c.quit();
	}

}
