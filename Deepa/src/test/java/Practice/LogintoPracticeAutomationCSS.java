package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoPracticeAutomationCSS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("student");
		
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("Password123");
		
		
		//Traditional approach
	//	driver.findElement(By.cssSelector("[id='submit']")).click();
		
		
		//Optimized approach
	//	driver.findElement(By.cssSelector("[id*='su']")).click();
		
		
		//Optimized approach
	//	driver.findElement(By.cssSelector("button#submit")).click();
		
		
		//Optimized approach
	//	driver.findElement(By.cssSelector(".btn")).click();
		
		
		//To avoid case Sensitive
		driver.findElement(By.cssSelector("[id*='Su' i]")).click();
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
