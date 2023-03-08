package practiceAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SeleniumSession.BrowserUtil;
import SeleniumSession.ElementUtil;

public class ElementDisplayed {

	public static void main(String[] args) {
		BrowserUtil brutil = new BrowserUtil();
		String browserNmae = "chrome";
		
		WebDriver driver = brutil.initalizeDriver(browserNmae);
		driver.get("https://www.naveenautomationlabs.com/opencart/");
		ElementUtil eleutil = new ElementUtil(driver);
		
		By search = By.xpath("//input[@name='search']");
		By searchbutton = By.xpath("//button[@type='button']/parent::span");
		boolean flag = eleutil.elementIsDisplayed(search);
			if(flag==true) {
				System.out.println("Pass");
				eleutil.doSendKeys(search, "macbook");
				eleutil.doClick(searchbutton);
		}
		



	}

}
