package testng;

import org.testng.annotations.Test;

public class basics {
	
	/*
	 * Priority: arrange in order
	 * description: adding short note
	 * groups: grouping test cases
	 * invocation count
	 * enabled=false , ignoring/disabled
	 * timeOut
	 * */

	@Test(priority=0,description="one",groups="hello", invocationCount=3)
	public void m1() {
		System.out.println("case 1");
	}
	@Test(priority=1,description="two",groups="hello",enabled=false)
	public void ab() {
		System.out.println("case 2");
	}
	@Test(priority=2,description="three",groups="hi")
	public void m2() {
		System.out.println("case 3");
	}
}
