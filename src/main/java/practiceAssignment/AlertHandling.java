package practiceAssignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// Handling Java Script alert pop up
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		String text = alert.getText();
		
		System.out.println(text);
		alert.accept();
		//Handling Java Confirmation Pop Up
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alt = driver.switchTo().alert();
		String tex = alt.getText();
		System.out.println(tex);
		alt.dismiss();
		
		//Handling Java Script prompt pop up
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert al = driver.switchTo().alert();
		
		String tx = al.getText();
		System.out.println(tx);
		Thread.sleep(2000);
		al.sendKeys("binu");
		al.accept();
		
		

	}
	

}
