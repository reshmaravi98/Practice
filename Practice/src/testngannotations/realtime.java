package testngannotations;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class realtime {
	
	/*
	 * TESTNG
	 * 
	 * BeforeTest
	 * BeforeClass
	 *  Before method TC1 AfterMethod
	 *  Before method TC2 AfterMethod
	 * AfterClass
	 * AfterTest
	 * 
	 * Types:
	 * Before Test
	 * After Test
	 * 
	 * 
	 * */

	ChromeDriver c; //globally declared
	
	@BeforeTest
	public void bt() {
		System.out.println("Before Test");	
		System.setProperty("webdriver.chrome.driver","/Users/resh/Downloads/chromedriver_mac_arm64/chromedriver");
		c = new ChromeDriver();
	    c.get("http:\\www.google.com");
	}
	
	@Test(priority=0)
	public void tc1() {
		System.out.println("Test Case 1" );
		c.findElementByLinkText("Images").click();;
	}
	
	@Test(priority=0)
	public void tc2() {
		System.out.println("Test Case 2"+c.getTitle());	
	}
	
	@AfterTest
	public void at() {
		System.out.println("After Test");
		c.quit();
	}
	
	@BeforeClass
	public void bc() throws InterruptedException {
		System.out.println("Before Class");	
		c.manage().window().maximize();
		Thread.sleep(4000);
		
	}
	
	@AfterClass
	public void ac() {
		System.out.println("After Class"+ c.getCurrentUrl());	
		c.manage().deleteAllCookies();
		
	}
	
	@BeforeMethod
	public void bm() throws InterruptedException {
		System.out.println("Before Method");
		Thread.sleep(4000);
	}
	
	@AfterMethod
	public void am() {
		System.out.println("After Method");	
		c.navigate().refresh();
	}
	
}

