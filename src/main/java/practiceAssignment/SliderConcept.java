package practiceAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement slider = driver.findElement(By.id("slider"));
		
		slider.click();
		
		int width =slider.getSize().getWidth();
		System.out.println(width);//532
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(slider, -((width/2)-164), 0).click().build().perform();
		
		//using click and hold and move by offset method
		//action.clickAndHold(slider).moveByOffset((-(width/2)-60), 0).click().build().perform();
		

	}

}
