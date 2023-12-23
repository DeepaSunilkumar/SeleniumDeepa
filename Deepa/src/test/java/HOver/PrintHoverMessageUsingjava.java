package HOver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHoverMessageUsingjava {
	WebDriver driver;
	public void Accessbrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
	/**
	 * This method Perform Login action
	 */
	public void login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		}
	/**
	 * This method return hover Message
	 * @return 
	 */
	public String Hovermessage() {
		 WebElement ele = driver.findElement(By.xpath("//button[@title='Assign Leave']"));
		String text = ele.getAttribute("title");
		return text;
	}

}
