package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateOrangeHRM {
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	
	//driver.findElement(By.partialLinkText("OrangeHRM")).click();
	
	

}
}