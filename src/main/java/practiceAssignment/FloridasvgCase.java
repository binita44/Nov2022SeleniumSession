package practiceAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FloridasvgCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		
		// since svg is inside frame, 1st switch to frame
		Thread.sleep(2000);
		 
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

		
		String svgxpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g'and @id='regions']//*[name()='path']";
		
		List<WebElement> statelist = driver.findElements(By.xpath(svgxpath));
		System.out.println(statelist.size());
		
		Actions act = new Actions(driver);
		
		for(WebElement e: statelist) {
			String Statename = e.getAttribute("name");
			
			System.out.println(Statename);
			
			if (Statename.equals("Florida")) {
				Thread.sleep(3000);
			//jsUtil.scrollIntoView(e);
			
				//act.scrollToElement(e).build().perform();

				int x = e.getSize().getWidth();
				int y = e.getSize().getHeight();
				System.out.println(x + " : " + y);
				
				act.moveToElement(e, ((x/2)-40), 0).click().build().perform();
				
				break;
				
				
				}
			
//			else if (Statename.equals("Hawaii")) {
//			//jsUtil.scrollIntoView(e);
//			act.scrollToElement(e).build().perform();
//
//			int x = e.getSize().getWidth();
//			int y = e.getSize().getHeight();
//			// System.out.println(x + " : " + y);
//			act.moveToElement(e, (x / 2)-20, 0).click().build().perform();
//		}
//		
//		else {
//			e.click();
//		}
//		break;
	}
		
		
		
	}

}
