package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	private WebDriver driver;
	
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public void doSendKeys (By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void doClick (By locator) {
	getElement(locator).click();
	
	}
	
	public String getText (By locator) {
		return getElement(locator).getText();
	}
	
	public boolean elementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public List<WebElement> getElements (By locator) {
		return driver.findElements(locator);
	}
	
	public String getelementattribute (By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	
	}
	
	public void getElementAttributesList (By locator, String attributeName) {
		List<WebElement> eleList = getElements(locator);
		for(WebElement e: eleList) {
			String attrValue = e.getAttribute(attributeName);
			System.out.println(attrValue);
		}	
	}
	
	
	public int getElementSize(By locator) {
		int eleSize = getElements(locator).size();
		System.out.println(eleSize);
		return eleSize;
		
	}
}
