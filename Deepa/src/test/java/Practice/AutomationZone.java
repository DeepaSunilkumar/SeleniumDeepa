package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationZone {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
       driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
       
       WebElement ele = driver.findElement(By.cssSelector("p[class='class1']"));
      String element = ele.getText();
       System.out.println(element);
       
       Thread.sleep(2000);
       driver.close();
	}

}
