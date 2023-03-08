package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class driverAssigment {

	public static void main(String[] args) {
		String browser = "opera";
		WebDriver driver = null;
		
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			
			break;
		case "firefox":
			driver = new FirefoxDriver();
			
			break;
			
		case "safari":
			driver = new SafariDriver();
			
			break;
			

		default:
			System.out.println("Enter valid Browser Name");
			break;
		}
		
		driver.get("https://www.facebook.com");
		 String pageTitle = driver.getTitle();
		 System.out.println("The title of this Webpage is :" + pageTitle);
		 		 
		 if(pageTitle.equals("Facebook - log in or sign up")) {
			 System.out.println("Test Pass");
		 }
		 else {
			 System.out.println("Test Fail");
		 }
		 
		 driver.quit();
	}
	

}
