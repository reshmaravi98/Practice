package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class scroller {

	public static void main(String[] args) throws InterruptedException {
	/*
	 * Two types: Horizontal & Vertical
	 * 
	 * Hori: x axis changes, y remains 0
	 * 		right: positive x value
	 * 		left:negative x value
	 * 
	 * Ver:
	 * 		down: positive y
	 * 		up: negative y
	 * 
	 
	 * */
		
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.letskodeit.com/practice");
		
		/*Method 1 : full doc height
		 * 
		 * c.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		c.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		*/
		
		//Method 2: height based on numbers we give
		
		c.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(3000);
		
		c.quit();
	}

}
