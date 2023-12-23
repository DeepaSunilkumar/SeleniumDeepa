package ShadowRoot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRootLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/shadow");
		
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("document.querySelector(\"form[class='pe-5']>div\").shadowRoot.querySelector(\"input[placeholder='Enter your username']\").value=\"Deepa\";");
	//	js.executeScript("document.querySelector(\"form[class='pe-5']>div+div\").shadowRoot.querySelector(\"input[placeholder='Enter your password']\").value=\"Deepa123\";");
	//	driver.findElement(By.xpath("//button[.='Login']")).click();
		
     	WebElement ele = driver.findElement(By.cssSelector("form[class='pe-5']>div"));
     	SearchContext shadow1 = ele.getShadowRoot();
     	shadow1.findElement(By.cssSelector("input[placeholder='Enter your username']")).sendKeys("Deepa");  
     	
     	WebElement ele2 = driver.findElement(By.cssSelector("form[class='pe-5']>div+div"));
     	SearchContext shadow2 = ele2.getShadowRoot();
     	shadow2.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("Deepa@321");
     	
     	driver.findElement(By.xpath("//button[.='Login']")).click();

	}

}
