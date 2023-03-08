package practiceAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {

	public static void main(String[] args) throws InterruptedException {
		//note: svg element cannot be captured with normal xpath
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		
		// since svg is inside frame, 1st switch to frame
		Thread.sleep(2000);
		 
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

		
		String svgxpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g'and @id='regions']//*[name()='path']";
		
		List<WebElement> statelist = driver.findElements(By.xpath(svgxpath));
		System.out.println(statelist.size());
		
		for(WebElement e: statelist) {
			String Statename = e.getAttribute("name");
			System.out.println(Statename);
			
			if(Statename.equals("Georgia")) {
				e.click();
				System.out.println(driver.getCurrentUrl());
				break;
			}
		}
			System.out.println();
			
			Thread.sleep(5000);
			//you dont have to switch frame again
//			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
//			Thread.sleep(2000);
			
			String gpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='georgia']//*[name()='g'and@class='subregion']//*[name()='path']";
			List<WebElement> countylist = driver.findElements(By.xpath(gpath));
			System.out.println(countylist.size());
			
			for(WebElement f: countylist) {
				String countyname= f.getAttribute("name");
				System.out.println(countyname);
			}
		
			
		

		
		

	}

}
