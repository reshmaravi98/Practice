package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.jqueryui.com/droppable/");
		//get elements inside teh frame
		//switch control to teh frame
		//id,name, index
		
		c.switchTo().frame(0);
		
		Actions ac=new Actions(c);
		WebElement ele1 = c.findElementById("draggable");
		WebElement ele2 = c.findElementById("droppable");
		ac.dragAndDrop(ele1, ele2).build().perform();
		Thread.sleep(3000);
		c.quit();
		
		
		
	}

}
