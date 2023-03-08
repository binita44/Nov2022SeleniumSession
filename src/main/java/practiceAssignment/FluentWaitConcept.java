package practiceAssignment;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://freshworks.com/");
		//driver.manage().deleteAllCookies();
		
		By freetrial = By.cssSelector("a[title='Free Trial11']");
		
	
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class)
				.pollingEvery(Duration.ofSeconds(1))//how many time or at what interval time will the availability of element
				.withMessage("..........Element not found on page......");
		//custom message
		
		WebElement freetrialele = wait.until(ExpectedConditions.presenceOfElementLocated(freetrial));
		freetrialele.click();

	}
	
	public static WebElement waitForElementPresenceWithFluentWait(int timeout, int pollingtime, By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.ignoring(NoSuchElementException.class)
				.pollingEvery(Duration.ofSeconds(pollingtime))//how many time or at what interval time will the availability of element
				.withMessage("..........Element not found on page......");
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static void waitForAlertPresenceWithFluentWait(int timeout, int pollingtime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.ignoring(NoSuchElementException.class)
				.pollingEvery(Duration.ofSeconds(pollingtime))//how many time or at what interval time will the availability of element
				.withMessage("..........Element not found on page......");
		
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	
	//we can use all method with webdriver wait too, coz fluent class is parent of webdriver wait class
	//flent wait and webdriver wait is same thing
	
	

	
	

}
