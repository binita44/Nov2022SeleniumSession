package testNgSession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	
	//How to design test cases
	// global pre condition are written in jira or orther tool
	//pre conditions are written
	//we write test cases-->test steps are created--> actual vs expected result i.e Assertion
	//we write post steps
	//post global steps
	
	
	//1st
	@BeforeSuite
	//Annotation is special key word written with @
	//Annotation should
	
	public void startDBConnection() {
		System.out.println("BS - Start Data base connection");
		
	}
	//2nd
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- Created User");
		
	}
	//3rd
	@BeforeClass
	public void lunchBrowser() {
		System.out.println("BC -- Lunch Browser");
	}
	//4th//7th//10th
	@BeforeMethod//before method will be executed or run before each and every test case or test method
	//it will choose the test case or method to exected on basis of alphabatical order
	public void logintoApp() {
		System.out.println("BM  Login to app");
	}
	//@Test denotes all the test cases 
	@Test//8th
	public void homePageTitleTest() {
		System.out.println("Home page title test");
	}
	
	@Test//11th
	public void homePageUrlTest() {
		System.out.println("Home page title test");
	}
	
	@Test//5th
	public void homePageSearchTest() {
		System.out.println("Home page title test");
	}
	
	@AfterMethod//6th//9th//12th
	// it will run after each and every test method
	public void logout() {
		System.out.println("AM -- log out");
		
	}
	@AfterClass//13th
	public void closeBrowser() {
		System.out.println("Ac -- closeBrowser ");
		
	}
	@AfterTest//14th
	public void deleteUser() {
		System.out.println("AT -- delete User");
		
	}
	@AfterSuite//15th
	public void disconnectWithDB() {
		System.out.println("AS -- Disconnect with DB");
		
	}
	
	
	
	

}
