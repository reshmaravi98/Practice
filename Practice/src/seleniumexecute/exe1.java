package seleniumexecute;

import org.openqa.selenium.chrome.ChromeDriver;

public class exe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");	
		ChromeDriver c= new ChromeDriver();
		c.get("http://www.mycontactform.com");
		
		System.out.println(c.executeScript("return document.title"));
		System.out.println(c.executeScript("return document.URL"));
		c.quit();
	}

}
