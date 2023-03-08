package practiceAssignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement twiter = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		twiter.click();
		//In order to switch driver to new tab opened
		//method to handle the window
		
		//1st part: get the window ids
		
		Set<String> handle = driver.getWindowHandles();//this will return set of string, which do not follow any order
		// since set of string is not order based we use iterator
		
		Iterator<String> it = handle.iterator();//will return iterator over the element in the set
		
		//it: here is just variable name which will point towards just above of the set object, 
		//i.e parent window to thikka mathi point garxa, where there is nothing right now
		//it.next use gare paxi chai avilable window ma janxa
		
		String parentWindowid = it.next(); // 1st window is parent page
		System.out.println(parentWindowid);
		
		String childWindowid = it.next();//2nd child window
		System.out.println(childWindowid);
		
		//2nd part: switch to child window
		driver.switchTo().window(childWindowid);
		System.out.println("child window url : "+driver.getCurrentUrl());
		driver.close();// we will use close method and it will close the child window
		//do not use quit method, otherwise it will close parent window too
		
		
		//3rd part: again switch to parent page
		driver.switchTo().window(parentWindowid);
		System.out.println("parent window url : "+driver.getCurrentUrl());
		
		//now to close parent window use quit() method
		
		driver.quit();

	}

}
