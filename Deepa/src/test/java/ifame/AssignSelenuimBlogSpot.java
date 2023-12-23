package ifame;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignSelenuimBlogSpot {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@class='td-a-rec td-a-rec-id-header  ']//a[.='Free Mock Tests']")).click();
		
		String parentid = driver.getWindowHandle();
		Set<String> Allids = driver.getWindowHandles();
		for(String id:Allids) {
			if(!(parentid.equals(id))) {
				driver.switchTo().window(id);
				
			}
			
		}
		driver.findElement(By.name("phone")).sendKeys("9876543210");

	}

}
