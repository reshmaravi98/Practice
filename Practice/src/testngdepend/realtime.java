package testngdepend;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class realtime {
	ChromeDriver c;
	@Test(priority=0,groups="one",description="open")
	public void open() {
	System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
	c = new ChromeDriver();
    c.get("http:\\www.google.com");
	}
	
	@Test(priority=1,groups="one",description="maximise")
	public void max() throws InterruptedException {
		Thread.sleep(4000);
		c.manage().window().maximize();
	}
	@Test(priority=2,groups="one",description="refresh")
	public void refresh() {
		c.navigate().refresh();
	}
	
	@Test(priority=3,groups="two",description="images",dependsOnGroups="one")
	public void images() throws InterruptedException {
		Thread.sleep(3000);
		c.findElementByLinkText("Images").click();
	}
	
	@Test(priority=4,groups="two",description="quit")
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		c.quit();
	}
	
}
