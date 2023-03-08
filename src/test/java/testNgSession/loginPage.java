 package testNgSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginPage {
	public WebDriver driver;
	public boolean doLogin(String userName, String password) {
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		//driver.findElement(By.xpath("//input[@value='Login']")).clear();
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String errorMessage = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		if(errorMessage.contains("No match for E-Mail Address and/or Password.")) {
			System.out.println(errorMessage);
			return true;
		}
		return false;
		
	}
	@BeforeTest
	public void setup() {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	//for multiple data we use data provider concept 
	@DataProvider
	public Object[][] getloginNegativeData() {
		return new Object[][] {
			{"abc@gmail.com","abc123"},
			{"abc@gmail","123@gmail"},
			{" ","123456"}, 
			
		};
	}
	
	//for only 1 set off data
	@Test(dataProvider="getloginNegativeData")
	public void logintest(String userName, String password) {
		boolean login =doLogin(userName,password);
		Assert.assertTrue(login);	}
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}



	

}
