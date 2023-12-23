package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingToParticularElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]", "https://www.amazon.in/");
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Facebook']"));
		
	//	js.executeScript("window.scrollBy(arguments[0].scrollIntoView())",ele);
		
		  int y = ele.getLocation().getY();
		 js.executeScript("window.scrollBy(0,"+ y +" )");
		

	}

}
