package testngannotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class typesandorder {
	
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

	@BeforeTest
	public void bt() {
		System.out.println("Before Test");	
	}
	
	@Test(priority=0)
	public void tc1() {
		System.out.println("Test Case 1");	
	}
	
	@Test(priority=0)
	public void tc2() {
		System.out.println("Test Case 2");	
	}
	
	@AfterTest
	public void at() {
		System.out.println("After Test");	
	}
	
	@BeforeClass
	public void bc() {
		System.out.println("Before Class");	
	}
	
	@AfterClass
	public void ac() {
		System.out.println("After Class");	
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("Before Method");	
	}
	
	@AfterMethod
	public void am() {
		System.out.println("After Method");	
	}
	
}
