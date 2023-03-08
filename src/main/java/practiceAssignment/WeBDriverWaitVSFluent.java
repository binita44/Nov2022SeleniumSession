package practiceAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WeBDriverWaitVSFluent {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://freshworks.com/");
		//driver.manage().deleteAllCookies();
		
		By freetrial = By.cssSelector("a[title='Free Trial1']");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.withMessage("-----not found----------");
		
		wait.until(ExpectedConditions.elementToBeClickable(freetrial)).click();
		
		//we are using features from fluent class by webdriverwait class
		
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		waits.until(ExpectedConditions.elementToBeClickable(freetrial)).click();
	}

}
