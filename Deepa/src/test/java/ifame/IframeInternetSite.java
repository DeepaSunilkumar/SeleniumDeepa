package ifame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeInternetSite {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/iframe");
		WebElement ele = driver.findElement(By.id("mce_0_ifr"));
	  	driver.switchTo().frame(ele);
		System.out.println(driver.findElement(By.xpath("//p")).getText());
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[.='File']")).click();

	}

}
