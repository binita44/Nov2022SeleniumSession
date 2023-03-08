package practiceAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentid = driver.getWindowHandle();// used to get id of single window: or parent or existing window
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://google.com");
		System.out.println("new tab : " + driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentid);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("binu");
		 
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://google.com");
		driver.close();
		
		driver.switchTo().window(parentid);
		driver.quit();
		
	}

}
