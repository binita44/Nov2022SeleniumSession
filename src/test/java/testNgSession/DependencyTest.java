package testNgSession;

import org.testng.annotations.Test;

public class DependencyTest {
	@Test 
	public void searchTest() {// 1st search test will be executed 
		System.out.println("Search test");
		//int i =9/0; 
	}
	@Test (dependsOnMethods = "searchTest")
	public void addToCartTest() {
		System.out.println("Add to Cart");
		
	}
	@Test (dependsOnMethods = "addToCartTest")
	public void makePaymentTest() {
		System.out.println("Make apyment");
		
	}

	
}
