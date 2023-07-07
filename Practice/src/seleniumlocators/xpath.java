package seleniumlocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.mycontactform.com/");
		
		//absolute xpath -- starts with single slash (/)
		c.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input").sendKeys("hi");
		
		//relative xpath -- starts with double slash(//)
		c.findElementByXPath("//input[@type='password']").sendKeys("hi");
		
		//copypast method
		c.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
		
		
		TimeUnit.SECONDS.sleep(3);
		
		c.quit();
	}

}
