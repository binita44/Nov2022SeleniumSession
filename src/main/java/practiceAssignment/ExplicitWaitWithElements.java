package practiceAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitWithElements {
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.freshwork.com");
		
		By footer = By.cssSelector("footer a");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
		//An expectation for checking that there is at least one element present on a web page
		List<WebElement> footerlist = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footer));
		System.out.println(footerlist.size());
		
		List<WebElement> footerslist = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footer));
		System.out.println(footerslist.size()); 
		

	}
	
	//utility
	
	public static List<WebElement> visibilityOfAllElement(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	public static List<WebElement> presenceOfAllElement(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

}
