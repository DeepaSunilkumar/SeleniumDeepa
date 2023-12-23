package ShadowRoot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRootBooks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://books-pwakit.appspot.com/explore?q=");
		
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("document.querySelector(\"book-app[apptitle='BOOKS']\").shadowRoot.querySelector(\"app-header[effects='waterfall']>app-toolbar[class='toolbar-bottom']>book-input-decorator>input[id='input']\").value=\"War and peace\";");		
		
		
		//Using selenuim
		WebElement ele = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']"));
		SearchContext shadow1 = ele.getShadowRoot();
		shadow1.findElement(By.cssSelector("app-header[effects='waterfall'] input[id='input']")).sendKeys("WAR AND PEACE");
		

	}

}
