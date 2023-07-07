package seleniumlocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class css {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.mycontactform.com/");
		
		//1.tagname and id
		//c.findElementByCssSelector("input#user").sendKeys("hi");
		
		//2.tagname and classname
		//c.findElementByCssSelector("input.txt_log").sendKeys("hi");
		
		//3.tagname and attribute
		//c.findElementByCssSelector("input[type='text']").sendKeys("hi");
		
		//4.tagname and prefix of attribute
		//c.findElementByCssSelector("input[type^='te']").sendKeys("hi");
		
		//5.tagname and suffix of attribute
		//c.findElementByCssSelector("input[type$='xt']").sendKeys("hi");
		
		//6.tagname and substring of attribute
		//c.findElementByCssSelector("input[type*='ex']").sendKeys("hi");
		
		//7.tagname, classname and attribute
		//c.findElementByCssSelector("input.txt_log[type='text']").sendKeys("hi");
		
		
		//Shortcut - most used in realtime
		c.findElementByCssSelector("#user").sendKeys("hi");
		
		TimeUnit.SECONDS.sleep(3);
		
		c.quit();
	}

}
