package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.letskodeit.com/practice");
		
		
		/*
		 * create obj for select class
		 * pass dropdown as input
		 * identified by - index, value, visiblel text
		 * */
		
		//WebElement e = c.findElementById("carselect");
		//Select s=new Select(e);
		//s.selectByIndex(0);
	   //s.selectByValue("benz");
	    // s.selectByVisibleText("Benz");
		
		
		WebElement e = c.findElementById("multiple-select-example");
		Select s=new Select(e);
		s.selectByIndex(0);
		s.selectByValue("orange");
		s.selectByVisibleText("Peach");
		
		Thread.sleep(3000);
		
		s.deselectByIndex(2);
		s.deselectByValue("apple");
		s.deselectByVisibleText("Orange");
		
		Thread.sleep(3000);
		c.quit();
	}

}
