package testNgSession;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 10)
	public void createusertest() {
		System.out.println("create user ");
	}

}
