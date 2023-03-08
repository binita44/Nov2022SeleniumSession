package practiceAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendkey {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		 
		By fn = By.id("input-firstname");
		By ln = By.id("input-lastname");
		By cont = By.cssSelector("input[type='submit']");
//		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(fn), "binu").build().perform();
//		act.sendKeys(driver.findElement(ln), "binu").build().perform();
		
		sendkeys(fn,"binu");
		sendkeys(ln,"poudel");
		clicks(cont);
		
	
	
	
	
	}
	
	
	public static WebElement getelement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void sendkeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getelement(locator),value).build().perform();
	}
	public static void clicks (By locator) {
		Actions action = new Actions(driver);
		action.click(getelement(locator));
	}

}
