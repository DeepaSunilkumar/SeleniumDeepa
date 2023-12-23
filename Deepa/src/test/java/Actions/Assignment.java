package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.mysql.cj.jdbc.Driver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement ele = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();

	}

}
