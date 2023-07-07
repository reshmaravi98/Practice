package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class basiclocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.mycontactform.com");
		
		
		//id=user
		c.findElementById("user").sendKeys("Dhivyakarthi123");
		
		//name=pass
		c.findElementByName("pass").sendKeys("12345");
		
		
		//classname= btn_log  (not usually preferred
		c.findElementByClassName("btn_log").click();
	}

}
