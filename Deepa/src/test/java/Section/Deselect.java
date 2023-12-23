package Section;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/Deepa/OneDrive/Desktop/Multiple.html");
		
		WebElement ele = driver.findElement(By.id("Movies"));
		
		Select se = new Select(ele);
		//check the dropdown is multiselect or not
		System.out.println(se.isMultiple());
		
		
		//To select all the options
		List<WebElement> Allopt = se.getOptions();
		for(WebElement r:Allopt) {
			r.click();
		}
		
		se.deselectByIndex(0);
		se.deselectByValue("KGF");
		se.deselectByVisibleText("LEO");
		se.deselectAll();

	}

}
