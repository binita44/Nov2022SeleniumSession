package practiceAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SeleniumSession.BrowserUtil;
import SeleniumSession.ElementUtil;

public class locatorAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		String browsername = "chrome";
	BrowserUtil brutil = new BrowserUtil();
	//this method will return the driver that we have initialized and it will have session id 123
	
	WebDriver driver = brutil.initalizeDriver(browsername);
	brutil.lunchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
	//gettittle will return string so we are storing in string 
	String title = brutil.gettitle();
	System.out.println(title);
	
	By fname = By.id("input-firstname");
	By lname = By.id("input-lastname");
	By email = By.xpath("//input[@name='email']");
	By telephone = By.id("input-telephone");
	By password = By.id("input-password");
	By confirmpassword = By.id("input-confirm");
	By newsletter = By.xpath("//input[@name='newsletter' and @value=1]");
	By policy = By.xpath("//input[@name='agree']");
	By login = By.xpath("//input[@class='btn btn-primary']");
	By header = By.tagName("h1");
	
	
	
//	
//	By myaccount = By.xpath("//a[text()='My Account']");
	ElementUtil eleutil = new ElementUtil(driver);
//	eleutil.doClick(myaccount);
	
//	
	
	eleutil.doSendKeys(fname, "Binita");
	eleutil.doSendKeys(lname, "Poudel");
	eleutil.doSendKeys(email, "bini.poudel@gmail.com");
	eleutil.doSendKeys(telephone, "9846790890");
	eleutil.doSendKeys(password, "Binita@123");
	eleutil.doSendKeys(confirmpassword, "Binita@123");
	eleutil.doClick(newsletter);
	eleutil.doClick(policy);
	eleutil.doClick(login);
	eleutil.getText(header);
	brutil.gettitle();
	
	Thread.sleep(3000);
	
	driver.quit();
	
	
	 

	}

}
