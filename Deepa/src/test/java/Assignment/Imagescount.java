package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imagescount {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in");
		
       /* List<WebElement> Alllinks = driver.findElements(By.tagName("a"));
		
		for(WebElement r:Alllinks) {
			String links = r.getAttribute("href");
			System.out.println(links);  */
			
			List<WebElement> ele = driver.findElements(By.xpath("//a|//img"));
			//int size = ele.size();
			//System.out.println(size);
			
			int count=0;
			for(WebElement r:ele) {
				count++;
			}
			
			
			System.out.println(count);
			
		

	}

}
