package practiceAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSession.ElementUtil;

public class FooterLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		
		By footer = By.xpath("//td/child::a");
		
		ElementUtil elem = new ElementUtil(driver);
		elem.getElementSize(footer);
		elem.getElementAttributesList(footer, "href");
			

	}

}
