package PopUps;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowLIC {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://licindia.in/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
	/*	JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("open('https://www.hdfcbank.com/')");  */
		
		driver.get("https://www.hdfcbank.com/");

	}

}
