package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultiple {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		
	//	 String text = driver.findElement(By.xpath("//p[@name='a' and @id='a']")).getText();
	//	String text = driver.findElement(By.xpath("(//p[@name='a'])[1]")).getText();
	//	 String text = driver.findElement(By.xpath("(//p[@name='a'])[position()=1]")).getText();
		String text = driver.findElement(By.xpath("(//p[@name='a'])[last()]")).getText();
		
		
		System.out.println(text);
		
		Thread.sleep(2000);
		driver.close();
		 

	}

}
