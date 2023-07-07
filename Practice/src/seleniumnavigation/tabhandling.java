package seleniumnavigation;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabhandling {

	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http:\\www.google.com");
	    driver.manage().window().maximize();
	    
	   //open seleniumeasy.com in new tab   
	 driver.executeScript("window.open('https://www.seleniumeasy.com','_blank');");

	 
	 //step2:
	 // get the control of first tab:   driver.getwindowhandle()  => parent 
	 // get the control of both tabs :  driver.getwindowhandles() =>  s={google, seleniumeasy.com}

	  String parent=driver.getWindowHandle();// control will be in the parent window //google
	 // collecting all the handle
	  Set<String> s1 = driver.getWindowHandles();// 2(both the tabs = collected)
	  
	  
	  //step3: iteration
	 
	  
	// iterate through the elements present in set
	 
	  Iterator<String> I1 = s1.iterator();  // hasNext , next()

	  // hasnext=> whether content is there
	  // next -> read the content 
	  
	 
	 while(I1.hasNext())// whether any content is there 
	    {
	      String child_window=I1.next();
	      if(!parent.equals(child_window))// picking the seleniumeasy.com
	    	  { // control is moved to child window 
	        driver.switchTo().window(child_window);
	        System.out.println(driver.getTitle());
	        Thread.sleep(4000);
	        driver.findElementByLinkText("Maven").click();
	        Thread.sleep(4000);
	        driver.close();
	      } 
	       /*parent: google s={google, seleniumeasy.com}
	        * firs iteration: I1 points to the first element in set 
	        * I1 points to google.com 
	        *    I1.hasnext=> 
	        *         I1.next reads first element and store it in child_window
	        *         child_window=google.com
	        *         parent!=child_window
	        *         google!=google
	        *         terminate
	        * second : I1 points to second element in set
	        * I1.hasnext
	        *      I1.next reads seleniueasy.comd => child_window=seleniumeasy.cm
	        *      parent!=child
	        *      google!=seleniumeasy.com
	        *        switching control to child window
	        *        moving cursor to selenium easy.com
	        *           Maven
	        *           4 seconds 
	        *           close
	        * third iteration: I1 points to null loop terminate 
	        * 
	        * 
	  * */
	    
	  }

	    driver.switchTo().window(parent);//google 
	    System.out.println(driver.getTitle());// google
	    //driver.findElement(By.linkText("Images")).click();
	    Thread.sleep(5000);
	    driver.findElementByLinkText("Images").click();
	    Thread.sleep(5000);
	    driver.quit();
	}
	}

