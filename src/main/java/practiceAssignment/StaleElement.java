package practiceAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstname = driver.findElement(By.id("input-firstname"));
		firstname.sendKeys("Binita");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
	
		//firstname.sendKeys("Binu");
	    //If i directly send another key after refreshing the page i get exception
		//org.openqa.selenium.StaleElementReferenceException: 
		//stale element reference: element is not attached to the page document
		
		//Always Create webelement of updated Dom
		firstname = driver.findElement(By.id("input-firstname"));
		 firstname.sendKeys("Binu");
		 
		 //selenium maintains webelement id internally, and after refresh, back , forward with the page, the dom 
		 //gets updated and selenium will create new webelement id.
		 //now if we do not create webelement again, 
		 //the new webelement id will not be equal to last webelement id
		 //and the fn still has last webelement id 
		 //that is why we get stale element exception
		 
		
	}

}
