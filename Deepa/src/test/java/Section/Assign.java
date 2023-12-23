package Section;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public class Assign {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/Deepa/OneDrive/Desktop/Multiple.html");
		
		WebElement ele = driver.findElement(By.id("Movies"));
		
		Select se = new Select(ele);
		System.out.println(se.isMultiple());
		
		
		//To select all the options
		List<WebElement> Allopt = se.getOptions();
		for(WebElement r:Allopt) {
			r.click();
		}
		
		
		//To print first option
		 String first = se.getFirstSelectedOption().getText();
		 System.out.println(first);
		
		//To print all the names
	  List<WebElement> all = se.getAllSelectedOptions();
	  for(WebElement re:all) {
		 String text2 = re.getText();
		  System.out.println(text2);
	  }
	  
	  
	  // To print second name
	  for(int i=0;i<all.size();i++) {
		  if(i==1)
		  {
			  System.out.println(all.get(i).getText());
		  }
		  
	  }
	  
		
	}

}
