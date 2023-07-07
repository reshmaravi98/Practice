package testngdepend;

import org.testng.annotations.Test;

public class groupdepend {
	
	
	@Test(priority=0,groups="fav")
	public void hi() {
		System.out.println("hi");
	}
	
	@Test(priority=1,timeOut=3000,groups="fav")
	public void vanakkam() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("vanakkam");
	}
	
	@Test(priority=2,groups="fav")
	public void hola() {
		System.out.println("hola");
	}
	
	@Test(priority=3,dependsOnGroups="fav")
	public void namaste() {
		System.out.println("namaste");
	}
}
