package practiceAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class MovetoElementConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
//		
//		
//		WebElement menu = driver.findElement(By.cssSelector("a.menulink"));
//		
//		//have to import action class and give the constructor webdriver
//		
//		Actions submenu = new Actions(driver);
//		submenu.moveToElement(menu).build().perform();
//		// with action class always use build and perform method
//		//otherwise it will move but there will not be any action
//		
//		
//		driver.findElement(By.linkText("COURSES")).click();
		
		
		//SPICE JET
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		
		//using locator concept coz i cannot find spiceclub element
		WebElement giftcard = driver.findElement(By.xpath("//div[contains(text(),'Gift Card')]"));
		
		Thread.sleep(1500);
		WebElement spiceclub = driver.findElement(with(By.tagName("div")).toRightOf(giftcard));
		System.out.println(spiceclub.getText());
		
		Actions spiceclb = new Actions(driver);
		spiceclb.moveToElement(spiceclub).build().perform();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//div[contains(text(),'Our Program')]")).click();
		


	}

}
