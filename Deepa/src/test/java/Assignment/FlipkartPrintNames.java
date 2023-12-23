package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPrintNames {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com");
		
		WebElement ele = driver.findElement(By.cssSelector("span[role='button']"));
		if(ele.isDisplayed())
		{
			ele.click();
		}
		else {
			
		}
		
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("iphone-15");
		
		driver.findElement(By.cssSelector("[class*='iLD']")).click();
		
List<WebElement> AllNames = driver.findElements(By.cssSelector("[class*='rR']"));
		
		for(WebElement r:AllNames) {
			String Names = r.getText();
			System.out.println(Names);
		}
			Thread.sleep(2000);
			driver.close();
			

	}

}

