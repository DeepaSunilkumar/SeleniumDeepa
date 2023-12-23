package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
       driver.get("https://practicetestautomation.com/practice-test-login/");
       
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
       
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
       
       
       // Xpath by attribute
      // driver.findElement(By.xpath("//button[@id='submit']")).click();
       
       // Xpath by VisibleText
     //  driver.findElement(By.xpath("//button[text()='Submit']")).click();
     //  driver.findElement(By.xpath("//button[.='Submt']")).click();
       
       // Xpath by contains(we can optimize the attribute value)
      // driver.findElement(By.xpath("//button[contains(@id,'s')]")).click();
       // Xpath by contains(we can optimize the text value)
       driver.findElement(By.xpath("//button[contains(text(),'S')]")).click();
       
       Thread.sleep(2000);
       driver.close();
       
       

	}

}
