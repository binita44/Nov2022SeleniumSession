package practiceAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignatureAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://signature-generator.com/draw-signature/");
		
		WebElement sign = driver.findElement(By.id("signature-pad"));
		
		Actions act = new Actions(driver);
		
		Actions signature = act.click(sign)
				.moveByOffset(0, 5)
				.clickAndHold(sign)
				.moveByOffset(3, 5).moveByOffset(200, 45)
				.moveByOffset(30, 100);
		
		
		signature.build().perform();
		
		
		
		
	}

}
