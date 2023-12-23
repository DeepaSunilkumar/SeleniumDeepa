package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class document {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]", "https://practicetestautomation.com/practice-test-login/");
		js.executeScript("document.getElementById('username').value='student';");
		js.executeScript("document.getElementById('password').value='Password123';");
		js.executeScript("document.querySelector(\"[id='submit']\").click();");

	}

}
