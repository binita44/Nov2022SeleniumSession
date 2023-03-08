package practiceAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforWindow {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//WebElement twiter = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		//twiter.click();
		
		By twiter = By.xpath("//a[contains(@href,'twitter')]");
		
		//ExplicitWaitWithClick ele = new ExplicitWaitWithClick();
		//ExplicitWaitWithClick.clickWhenReadyWithLocator(5, twiter);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(twiter)).click();
		
		boolean w = wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(w);
		

		//other things remains same
	}          

}
