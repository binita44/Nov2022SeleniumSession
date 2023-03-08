package practiceAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitWithClick {
	static WebDriver driver;
	
	public static void main(String[] args) {
		//Web Driver wait, click on element when ready
		
		//use incognito mode not working with this
		driver = new ChromeDriver();
		driver.get("https://www.freshwork.com");
		By locator = By.cssSelector("a[title='Free Trial']");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(locator));

	}
	public static void clickWhenReadyWithLocator(int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	
	public static WebElement waitforElementToBeClickable(int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	//using actions class  with wait
	//internally call Wait for web element to be clickable method
	//and store in web element
	//not make actions class object and perform action
	
	public static void doclickWithActionsandWait(int timeout, By locator) {
		WebElement ele = waitforElementToBeClickable(timeout, locator);
		Actions act = new Actions(driver);
		act.click(ele).build().perform();
		
	}
	
}
