package practiceAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
  class MultipleMenuHandleBigBasket {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		
		By locator = By.cssSelector("a.meganav-shop");
		selectProductFromMenu4(locator, "Beverages", "Tea", "Tea Bags");
		
//		WebElement menu1 = driver.findElement(By.cssSelector("a.meganav-shop"));
//		
//		Actions act = new Actions(driver);
//		//1st with action class move over at 1st parent menu
//		act.moveToElement(menu1).build().perform();
//		
//		WebElement submenu2 = driver.findElement(By.linkText("Beverages"));
//		act.moveToElement(submenu2).build().perform();
//		
//		WebElement submenu3 = driver.findElement(By.linkText("Tea"));
//		act.moveToElement(submenu3).build().perform();
//		
//		WebElement submenu4 = driver.findElement(By.linkText("Tea Bags"));
//		submenu4.click();
		 
		

	}
	//generic method
	public static void selectProductFromMenu4 (By menulocator, String mainmenu, String menu2, String menu3) {
       
		WebElement menu1 = driver.findElement(By.cssSelector("a.meganav-shop"));
		
		Actions act = new Actions(driver);
		//1st with action class move over at 1st parent menu
		act.moveToElement(menu1).build().perform();
		
		WebElement submenu2 = driver.findElement(By.linkText(mainmenu));
		act.moveToElement(submenu2).build().perform();
		
		WebElement submenu3 = driver.findElement(By.linkText(menu2));
		act.moveToElement(submenu3).build().perform();
		
		WebElement submenu4 = driver.findElement(By.linkText(menu3));
		submenu4.click();
	}

}
