package practiceAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginbtn = By.xpath("//input[@value='Login']");
		
		
		// in order to use explict wait we have to create object 
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
//		WebElement emailele = wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		//we are using wait for only email 
//		emailele.sendKeys("test@gmail.com");
		waitForElementPresence(email, 10).sendKeys("test@gmail.com ");
		getElement(password).sendKeys("test123");
		getElement(loginbtn).click();
		
		
		
		

	}
	public static WebElement getElement (By locator) {
		return driver.findElement(locator);
		
	}
	
	public static WebElement waitForElementPresence (By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitForElementVisibility (By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
