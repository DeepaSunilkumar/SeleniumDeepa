package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMultipleWindow {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//span[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone15");
		driver.findElement(By.cssSelector("[class='_2iLD__']")).click();
		WebElement ele = driver.findElement(By.xpath("//div[.='APPLE iPhone 15 (Blue, 128 GB)']"));
		
		

	}

}
