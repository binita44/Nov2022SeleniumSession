package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	private WebDriver driver;
	// we will access web driver using encapsulation concept
	// it will avoid null pointer exception
	
	/**
	 * 
	 * @param browsername
	 * @return browser
	 */
	public WebDriver initalizeDriver (String browsername) {
		System.out.println("Browser name is : " + browsername);
		
		switch (browsername.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			break;
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		return driver;
		
		
	}
	
	public String lunchUrl (String url) {
		if (url==null) {
			System.out.println("url cannot be null");
		}
		else if (url.indexOf("https")==0){
			driver.get(url); 
		}
		return url;
		
		
	}
	
	public String gettitle () {
		String title = driver.getTitle();
		System.out.println("Page title is : "+ title);
		return title;
		}

	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("The current Url is : "+url);
		return url;
		
		
	}
	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}
	
	
	
}
