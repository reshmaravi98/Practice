package testngdepend;

import org.testng.annotations.Test;

public class methoddepend {

	
	
	@Test(priority=0)
	public void hi() {
		System.out.println("hi");
	}
	
	@Test(priority=1,dependsOnMethods="hi")
	public void hola() {
		System.out.println("hola");
	}
}
