package practiceAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextEnteredInTextfield {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstname = driver.findElement(By.id("input-firstname"));
		firstname.sendKeys("Binita");
		
		String textentered = firstname.getAttribute("value");
		System.out.println(textentered);

	}

}
