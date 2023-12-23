package Section;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleOrMultiselect {

	public static void main(String[] args) {
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("file:///C:/Users/Deepa/OneDrive/Desktop/Movies.html");
	    
	    WebElement ele = driver.findElement(By.id("movies"));
	    
	    Select s = new Select(ele);
	    System.err.println(s.isMultiple());

	}

}
