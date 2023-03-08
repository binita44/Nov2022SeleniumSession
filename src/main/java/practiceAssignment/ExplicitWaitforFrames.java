                             package practiceAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitforFrames {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://londonfreelance.org/courses/frames/index.html");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("main"));
		//we do not need to write driver.switch to frame, until method will return webdriver
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		// you have to come back to default page since the driver is at frame now
		
		driver.switchTo().defaultContent();
		
	}
	public static void waitForFrameAndSwitchByStringName(int timeout, String frameidorName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameidorName));
		//An expectation for checking whether the given frame is available to switch to.
		//	If the frame is available it switches the given driver to the specified frame.
		//you will give frame name or id		
	}
	public static void waitForFrameAndSwitchByIndex(int timeout, int frameindex) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameindex));
		//you will give frame index
	}
	public static void waitForFrameAndSwitchByElement(int timeout, WebElement framelement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelement));
		//you will give webelement ie driver,findElement(By())
	}
	public static void waitForFrameAndSwitchByLocator(int timeout, By frameLocator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
		//we will maintain a By locator and pass
	}
	
	

}
