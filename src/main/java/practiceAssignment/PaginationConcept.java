package practiceAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);
		//single element selection:
		while(true) {
			//find elements method will return 0, so we are using it,
			//if there is no element in 1st page then find element method will return no such element exception
			
			
			//ele is on 1st page or not
			//will check on each and every page
			if(driver.findElements(By.xpath("//td[text()='Hong Kong']")).size() > 0) {
				selectcountry("Hong kong");//if honkong is available in 1st page then click the check box
				break; 
				//now comes the pagination concept
				//if Hong Kong is not available in 1st page then it must clck on next button
				
				
			}
			else {
				//storing in web element variable 
				WebElement next =driver.findElement(By.id("tablepress-1_next"));
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("The country is not available in pagination");
				}
				 next.click();
				Thread.sleep(2000);
			}
			//what if there is no such country available at all
			//it will give infinite loop, so we need logic for that too
			
		}
	}
	//method to select the check box for the country 
	public static void selectcountry(String CountryName) {
		driver.findElement(By.xpath("//td[text()='Hong Kong']//preceding-sibling::td/input[@type='checkbox']")).click();
		
	}

}
