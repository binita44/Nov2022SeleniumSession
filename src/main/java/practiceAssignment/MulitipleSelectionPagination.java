package practiceAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulitipleSelectionPagination {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);
		
		//logic for multiple selection
		//if india is available in 1st page select all multiple check box
		//  capture group concept with xpath
		while(true) {
			if(driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {
				selectMultipleCountry("India");//if India is available in 1st page then click all the check box which have india
				
		
			
				WebElement next = driver.findElement(By.id("tablepress-1_next"));
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("The country is not available in pagination");
					break;
				}
				 next.click();
				Thread.sleep(2000);
			
			}
		
	}
		
	}
	public static void selectMultipleCountry(String countryname) {
		List<WebElement> countrylist = driver.findElements(By.xpath("(//td[text()='"+countryname+"'])//preceding-sibling::td/input[@type='checkbox']"));
		for(WebElement e: countrylist) {
			e.click();
		}
			
		
	}
}
