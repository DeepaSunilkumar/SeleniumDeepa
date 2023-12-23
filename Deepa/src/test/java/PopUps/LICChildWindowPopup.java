package PopUps;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LICChildWindowPopup {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]", "https://www.licindia.in/");
		driver.findElement(By.partialLinkText("Login")).click();
		String parID = driver.getWindowHandle();
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		
		alert.accept();
		Thread.sleep(4000);
		Set<String> allIDs = driver.getWindowHandles();
	/*	for (String id : allIDs) {
			if (!(id.equals(parID))) {
//				System.out.println("ok");
				driver.switchTo().window(id);
			}
		}  */
	/*	Iterator<String> ids = allIDs.iterator();
		while(ids.hasNext()) {
			String id = ids.next();
			if(!(parID.equals(id))) {
				driver.switchTo().window(id);
			}
		}   */
		
		for(String r:allIDs) {
			String title = driver.switchTo().window(r).getTitle();
			System.out.println(title);
			System.out.println(driver.getTitle().equals("Life Insurance Corporation of India"));
			if(title.equals("Life Insurance Corporation of India")) {
				break;
			}
		}
		
		driver.findElement(By.name("userId")).sendKeys("Deepa");
	}

}
