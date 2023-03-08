package practiceAssignment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//we have to convert driver to javasript executor
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content')";
		
		//select JavascriptExecutor.executeScript(String script, Object... args),
		String pseudocode = js.executeScript(script).toString();
		
		System.out.println(pseudocode);
		if(pseudocode.contains("*")) {
			System.out.println("This is a mandatory field");
		}
		
			
		
	}

}
