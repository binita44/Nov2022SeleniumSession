package practiceAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		Thread.sleep(2000);
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("binu");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("simmi");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("kusum");
		
		//to return to frame 2 use parent frame method
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys("simmi 1");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys("binu 1");
		// to come to main page use default content
		
		driver.switchTo().defaultContent(); 
	}

}
