package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/75602/nz-vs-sl-41st-match-icc-cricket-world-cup-2023");
		
		String PN = " Kusal Perera ";
		
	String text = driver.findElement(By.xpath("//a[.='"+PN+"']/ancestor::div[@class=\"cb-col cb-col-100 cb-scrd-itms\"]//div[@class=\"cb-col cb-col-8 text-right text-bold\"]")).getText();
		
          System.out.println(text);
          
          Thread.sleep(3000);
          driver.close();
	}

}
