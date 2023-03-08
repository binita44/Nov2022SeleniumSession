package practiceAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSession.ElementUtil;
// find all images 
	//find all links in page
	//print the image count
	//print text of each links
		
public class ElementsTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		
		
		By linksize = By.tagName("a");
		
		ElementUtil ele = new ElementUtil(driver);
		//ele.getElementAttributesList(links, "href");
		ele.getElementSize(linksize);
		
		
		
		
		
		
		//each links will have index
		//some might be blank too
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
		// links ma text vako kati 
		//blank vako kati
		//find size 
		//total link size-no of link with text = blank text
		
		int listsize = links.size();
		
		System.out.println(listsize);
		
		int count =0;
		for(WebElement e: links) {
			String text = e.getText();
			
			if (text.length()>0) {
				System.out.println(count+ " : "+text);
			}
			count++;
		
			
	
		
	
	
				
			
//			if (text.length()> 0) {
//			System.out.println(i + " : "+ text);
//			}
//			
			
		}
		
		
		
		
	
		
		
		
		
		
		
		
		

	}	

}
