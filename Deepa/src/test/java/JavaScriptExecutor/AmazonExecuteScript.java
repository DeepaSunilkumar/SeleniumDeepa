package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonExecuteScript {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]", "https://www.amazon.in/");
		
	//	js.executeScript("window.loction=arguments[0]", "https://www.flipkart.com/");
		
		//Scrolling in downward
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		
		//Scrolling upward
		js.executeScript("window.scrollBy(0,-600)");
			
			

	}

}
