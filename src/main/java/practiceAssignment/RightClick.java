package practiceAssignment;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions rightclc = new Actions(driver);
		
		 
		//rightclc.contextClick().build().perform();
		//this will click in the default location of mouse which is at the top right corner
		
		rightclc.contextClick(ele).build().perform();
		
		 List<WebElement> eleList = driver.findElements(By.xpath("(//ul[contains(@class,'context-menu-list')])//span"));
		 
		 for(WebElement e: eleList) {
			String text= e.getText();
			
			System.out.println(text);
			
			if(text.contains("Edit")) {
				e.click();
				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();
				
				Thread.sleep(1500);
				
			}
		 }
			 
		
	}

}
