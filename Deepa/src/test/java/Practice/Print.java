package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
       driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
       
       String text = driver.findElement(By.cssSelector("p[name='a'][id='a']")).getText();
       System.out.println(text);
       
       Thread.sleep(2000);
       driver.close();

	}

}
