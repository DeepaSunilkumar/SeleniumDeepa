package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchIphone {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
	    WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		
	 //   element.sendKeys("iphone14");
	    
	    element.sendKeys("videogames");
	    
	     driver.findElement(By.id("nav-search-submit-button")).click();
	     
	     //when in the code type="submit"
	     
	     driver.findElement(By.id("nav-search-submit-button")).submit();
	    
	    

	}

}
