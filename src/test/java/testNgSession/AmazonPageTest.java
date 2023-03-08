package testNgSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonPageTest { 
	WebDriver driver;
	
	@BeforeTest//  
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		
	}
	@Test
	public void titleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title,"Amazon.com. Spend less. Smile more.");
	}
	
	@Test
	public void SearchbarExistTest() {
		boolean bar = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(bar);
	}
	@Test
	public void helpExistanceTest() {
		boolean help = driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(help);
	}
	
	@AfterTest
	//tear down is a naming convention for closing the browser
	public void teardown() {
		driver.quit();
	}

}
