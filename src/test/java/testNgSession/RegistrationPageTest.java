package testNgSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationPageTest {
	public WebDriver driver;
	
	public boolean registrationPage(String firstname, String lastname, String email, String phn, String password) {
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);
		
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(phn);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		
		driver.findElement(By.id("input-confirm")).clear();
		driver.findElement(By.id("input-confirm")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String accountmesg = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		System.out.println(accountmesg);
		if (accountmesg.contains(" Warning: E-Mail Address is already registered!")){
			System.out.println("Account already exist");
			return true;
		}
		return false;
		

		
	}
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@DataProvider
	public Object[][] registrationTestData () {
		return new Object[][] {
			{"bini","bini","bini@gmail.com","1234567891","test321"},
			{"simu","simu","simu@gmail.com","9846789399","simu1234"},
			{"kusu","kusu","kusu@gmail.com","3434343434","kusu1234"}
			
		};
			
		
		
	}
	
	
	
	@Test(dataProvider="registrationTestData")
	public void registrationPageTest (String firstname, String lastname, String email, String phn, String password) {
		boolean register = registrationPage(firstname,lastname, email, phn,password);
		Assert.assertTrue(register);
	}
	
	@AfterMethod
	public void teardown () {
		driver.quit();
	}
	
	
	

}
