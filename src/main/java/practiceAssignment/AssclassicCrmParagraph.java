package practiceAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssclassicCrmParagraph {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/");
		driver.getTitle();
		
		
		List<WebElement> paragraph = driver.findElements(By.tagName("small"));
		
		int no = paragraph.size();
		System.out.println(no);
		
		//int c = 0; 
		for(WebElement e:paragraph) {
			String text = e.getText();
			if(text.length()>0) {
				System.out.println(text);
				System.out.println();
				
			}
			//c++;
		}
		
	

	}

}
