package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopUp {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]", "https://www.amazon.in/");
		
	//	js.executeScript("alert()");
	//	Thread.sleep(3000);
		
		TargetLocator tg = driver.switchTo();
	    Alert alert = tg.alert();
	   alert.accept();
	    
	    
	    js.executeScript("confirm()");
	    Thread.sleep(5000);
	    alert.dismiss();
	    
	 
	    
			
			

	}

}
