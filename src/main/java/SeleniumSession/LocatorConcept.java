package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		//create web element + perform action
		
		
		// the driver is static so can be called directly
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//DOM : Document Object model, Shadow DOM: not visible in webpage kinda hidden
		
//		//1. direct using id
//		driver.findElement(By.id("input-email")).sendKeys("binita@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("binita123");
//		//this method is not feasible in real time environment
		
		//2.
//		WebElement emailid = driver.findElement(By.id("input-email"));// this will return web element
//		WebElement password = driver.findElement(By.id("input-password"));
//    
//		emailid.sendKeys("binita@gmail.com");
//		password.sendKeys("binita123");
//		// it works again after will close and open not this way, it will return as binita@gmail.comnaveen@gmail.com kina
//		
//		emailid.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen123");
		
		
//		 //3rd option creating BY locator directly
//		By emailId = By.id("input-email");// By.id will give By class
//		By password = By.id("input-password");
//		 //mainting in by locator is also creating object repository
//		WebElement eid = driver.findElement(emailId);
//		WebElement pwd = driver.findElement(password);
//		//when ever required webelement is created, this will not make server busy
//		eid.sendKeys("bina@gmail.com");
//		pwd.sendKeys("bina123");
//		
		//4th way by using generic method: By locator + generic method
//		By emailid = By.id("input-email");
//		By password = By.id("input-password");
//		
//		
//		getElement(emailid).sendKeys("bina@gmail.com");
//		getElement(password).sendKeys("bina123");
//		
		//5th now we will create method for action to
		
//		By emailid = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(emailid, "naven@gmail.com");
//		doSendKeys(password, "naven123");
//		
		//6th approach: now we will create element util class so it can be used by anyone 
		
		By emailid = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailid, "binita@gmail.com");
		eleUtil.doSendKeys(password, "binita1234");
		
		 
	}
	//now we will create generic approach for driver.element 
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	public static void doSendKeys (By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
