package practiceAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUt {
	
	private WebDriver driver;
	
	
	
	public WebDriver initiateDriver(String browserName) {
		
		System.out.println("The browser name is : "+ browserName);
		
		switch (browserName.trim().toLowerCase()) {
		
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Firefox":
			driver = new FirefoxDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		case "Safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please enter the valid browser name: "+browserName);
			break;
		}
		
		
		return driver;
	}
	
	public void lunchUrl (String Url) {
		//when opening the url it should not be null and it should always start with https 
		//so always create a check point
		
		if(Url==null) {
			System.out.println("Url cannot be null.Please pass right URL");
			
		}
		if(Url.indexOf("https")==0) {
			driver.get(Url);
			
		}
		
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("The title of the page is: "+title);
		return title;
	}
	
	public String getPageUrl() {
		String pageUrl=driver.getCurrentUrl();
		System.out.println(pageUrl);
		return pageUrl;
	}
	
	public void quitBrowser() {
		//check if the browser is open or not, check if its null or not
		if (driver!=null) {
		driver.quit();
		}
	}
	public void closeBrowser() {
		if(driver!=null) {
			driver.close();
		}
	}
	

}
