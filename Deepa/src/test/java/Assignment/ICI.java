package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICI {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.icc-cricket.com/rankings/mens/overview");
		
		//String text = driver.findElement(By.xpath("//nav[@id='']/descendant::button[contains(text(),'Rankings')]")).getText();
		//driver.findElement(By.xpath("//nav[@id='']//button[contains(text(),'Rankings')]"));
		String text = driver.findElement(By.xpath("//nav[@id='']//button[normalize-space(text())='Rankings']")).getText();
        System.out.println(text);
        
        Thread.sleep(3000);
        driver.close();
	}

}
