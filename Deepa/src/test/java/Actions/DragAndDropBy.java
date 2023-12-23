package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[.='X']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone15");
		driver.findElement(By.cssSelector("[class*='iLD']")).click();
		
		WebElement ele = driver.findElement(By.cssSelector("[class='_31Kbhn _28DFQy'] [class='_3FdLqY']"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(ele, 20, 0).perform();
		

	}

}
