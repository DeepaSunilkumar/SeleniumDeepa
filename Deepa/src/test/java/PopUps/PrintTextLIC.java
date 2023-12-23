package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTextLIC {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]", "https://licindia.in/");
		
	 	driver.findElement(By.cssSelector("[class =login1]")).click();
	 	
	 	Alert alert = driver.switchTo().alert();
	 	
	 	String text = alert.getText();
	 	System.out.println(text);
	 	
	 	
	    alert.dismiss();
		
		
		

	}

}
