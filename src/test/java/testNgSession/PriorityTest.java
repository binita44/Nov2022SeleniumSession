package testNgSession;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority =2)
	public void atest() {
		System.out.println("a test");
	}
	@Test(priority =1)
	public void btest() {
		System.out.println("b test");
	}
	@Test
	public void ctest() {
		System.out.println("c test");
	}
	@Test
	public void dtest() {
		System.out.println("d test");
	}
	@Test
	public void etest() {
		System.out.println("e test");
	}

}
