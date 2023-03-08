package practiceAssignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String Parentwindow = driver.getWindowHandle(); // this is used for specific window
		Thread.sleep(2000);
		
		WebElement twiter = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		twiter.click();
		
		WebElement youtube = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		youtube.click();
		
		WebElement facebook = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		facebook.click();
		
		WebElement linkedin = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		linkedin.click();
		
		//1st part: get window id
		
		Set<String> handle = driver.getWindowHandles();
		
		Iterator<String> it = handle.iterator();
		
		//hasnext: will check if there is next element or not, it will return a boolean
		
		while(it.hasNext()) {
			String windowId = it.next();
			//2nd part where i am switching the window
			driver.switchTo().window(windowId);
			//get url of current page
			System.out.println(driver.getCurrentUrl());
			//close the current page or window and go to loop
			
			//condition so that the parent window will not be close
			Thread.sleep(2000);
			
			if(!windowId.equals(Parentwindow)) {
			driver.close();
			}
		}
		driver.switchTo().window(Parentwindow);
		System.out.println("parent window : "+ driver.getCurrentUrl());
		
		 

	}

}
