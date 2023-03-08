package practiceAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TitleExpicitWait {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		driver.findElement(By.linkText("Forgotten Password")).click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//boolean ele = wait.until(ExpectedConditions.titleContains("Password?"));
		
		//System.out.println(ele);
		//System.out.println(driver.getTitle());
		
		
		String title = waitTittleContains(10, "Password?");
		//this part is responsible only see title is available or not
		//use condition to write in console
		if(title.contains("Forgot Your Password?")) {
			System.out.println("the test is pass");
		}
		
		driver.navigate().to("https://amazon.in/");
		driver.findElement(By.linkText("Mobiles")).click();
		
		if(waitForUrlContains(10, "mobile-phone")) {
			System.out.println("Url is correct");
			
		}
		else {
			System.out.println("test fail");
		}
		
			
		}
	
	public static String waitTittleContains(int timeout, String titlevalue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.titleContains(titlevalue));
		
		return driver.getTitle();
		
	}
	public static String waitTittleAndFetchFullTitle(int timeout, String fulltitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.titleIs(fulltitle));
		return driver.getTitle();
	}
	//will return string if you want to print
	public static String waitUrlContainsTitle(int timeout, String partialurlvalue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.urlContains(partialurlvalue));
		return driver.getCurrentUrl();
	}
	//will return boolean: 
	public static boolean waitForUrlContains(int timeout, String partialurlvalue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.urlContains(partialurlvalue));
		
	}
	public static String waitForUrltobe(int timeout, String fullurl) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.urlToBe(fullurl));
		return driver.getCurrentUrl();
	}
	

}
