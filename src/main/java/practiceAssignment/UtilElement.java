package practiceAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilElement {
	private WebDriver driver;
	
	
	public UtilElement(WebDriver driver) {
		this.driver = driver;
	}
	

	
	
	//get element method will return : driver.findElement(By locator)
	
	public WebElement getElement (By locator) {
	return driver.findElement(locator);
	}
	
	// give me the locator of the element then i will click it
	//we are calling getElement method internally like: calling m2 inside m1 same concept
	
	public void doClick (By locator) {
		getElement(locator).click();
		
	}
	//give me the locator of text element i will write text inside
	
	public void dosendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	//Give me locator i will give the text available 
	public String getElementtext (By locator) {
		return getElement(locator).getText();
	}
	
	//give me locator i will say if the element is displayed or not
	public boolean elementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
		//isDisplayed method will return a boolean it will say true(if element is displayed)
		//will give false: if element is not displayed
		
	}
	 
	
	
}

