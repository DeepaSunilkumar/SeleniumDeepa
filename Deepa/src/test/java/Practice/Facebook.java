package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/login/");
		
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
	 WebElement ele = driver.findElement(By.partialLinkText("Forgotten account?"));
	 String tag = ele.getTagName();
	 System.out.println(tag);
	 
	 String value = ele.getAttribute("href");
	 System.out.println(value);
	 
	 String val = ele.getText();
	 System.out.println(val);
	 
	 Thread.sleep(2000);
	 driver.quit();

	}

}
