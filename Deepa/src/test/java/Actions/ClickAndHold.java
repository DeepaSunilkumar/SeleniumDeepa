package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement ele2 = driver.findElement(By.id("droppable"));
		
		
		Actions act = new Actions(driver);
	//	act.clickAndHold(drag).perform();
		
	//	Thread.sleep(3000);
	//	act.release(ele2).perform();
		
		act.dragAndDrop(drag, ele2).perform();

	}

}
