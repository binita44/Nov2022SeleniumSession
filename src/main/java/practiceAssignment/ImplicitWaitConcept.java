package practiceAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(0, null);//was available till selenium 3 its debretated method
		//for depercated method it will have A not D, in option
		
		driver.manage().timeouts( ).implicitlyWait(Duration.ofSeconds(10));
		//Global wait of 10 sec
		//It will be applied for all the element by default
		//FE-- implicitly wait will be applied automatically the moment we creat any web element
		//
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("binita@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("binita123");
		driver.findElement(By.xpath("//button[@value='Login']")).click();
		
		// for every element we create 10 sec wait will be created
		// Specifies the amount of time the driver should wait when searching for an element if it is not immediately present.


		
	}

}
