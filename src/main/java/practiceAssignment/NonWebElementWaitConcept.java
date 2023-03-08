package practiceAssignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NonWebElementWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		// no need to create alert class and switch to alert methos and all
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Alert jsAlert = wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(jsAlert.getText());
		jsAlert.accept();
		//until method will change according to the input you pass
		//for alert it will give us an alert, so store it in alert
	}
	//utility for explicit wait 
	
	public static Alert waitForAlertPresence(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String getAlertText(int timeout) {
		return waitForAlertPresence(timeout).getText();
	}
	
	public static void alertDismiss(int timeout) {
		waitForAlertPresence(timeout).dismiss();
	}
	
	public static void alertAccept(int timeout) {
		waitForAlertPresence(timeout).accept();
	}
	public static void alertSendKeys(int timeout, String value) {
		waitForAlertPresence(timeout).sendKeys(value);
	}

}
