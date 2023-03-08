package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class webDriver {

	public static void main(String[] args) {
		//First thing is to always open the brower
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new SafariDriver();
		
		// Enter url
		driver.get("https://www.amazon.com");
		
		//Get the tittle of webpage
		String webTitle = driver.getTitle();
		System.out.println("The tittle of this page is: " + webTitle);
		
		//validation point, write a validation point
		if(webTitle.equals("Amazon.com. Spend less. Smile more.")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		driver.quit();
	
	}

}
