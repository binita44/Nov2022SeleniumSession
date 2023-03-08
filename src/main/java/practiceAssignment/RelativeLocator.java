package practiceAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

// in order to use Relative locator which is also static method, we have to do static import

public class RelativeLocator {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.linkText("Salaberry De Valleyfield, Canada"));
		System.out.println(ele.getText());
		
		// relative locator will help to find element above, below, at right or at left of a base element
		// the method is: we use driver.find element(with) instead of By
		
		String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		
		System.out.println(rightIndex);
		
		String leftIndex = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftIndex);
		
		String above = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(above);
		
		String below = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(below);
		
		String near = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(near);
	}

}
