package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatePracticeAutomation {
	WebDriver driver;
	public void accessBrowser() {
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
	}
	
	public void login() {
		
		driver.findElement(By.className("nav-input nav-progressive-attribute")).sendKeys("mobiles");
	} 

}
