package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksOnAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://www.amazon.in");
		
		driver.get("https://www.facebook.com/login/");
		
		List<WebElement> Alllinks = driver.findElements(By.tagName("a"));
		
		for(WebElement r:Alllinks) {
			String links = r.getAttribute("href");
			System.out.println(links);
			
			
		}

	}

}
