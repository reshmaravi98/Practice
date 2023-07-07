package testng;

import org.testng.annotations.Test;

public class timeoutattribute {

	@Test(timeOut=4000)
	public void z() throws InterruptedException {
		
		Thread.sleep(3000);
		System.out.println("Hola");
	}
}
