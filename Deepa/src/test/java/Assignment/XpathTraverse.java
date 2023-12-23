package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTraverse {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in");
		
		//forward traversing
		//driver.findElement(By.xpath("//div[@class='nav-search-field ']/input")).sendKeys("mobiles");
		
		//parent to immediate child
		//driver.findElement(By.xpath("//div[@class='nav-search-field ']/child::input")).sendKeys("mobiles");
		
		//move from parent to grandchild
	//	driver.findElement(By.xpath("//form[@id='nav-search-bar-form']/descendant::input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
        
		//To move to next sibling
		//driver.findElement(By.xpath("//label[@for='twotabsearchtextbox']/following-sibling::input")).sendKeys("mobiles");
		
		//To move child to patent
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/..")).sendKeys("mobiles");
		
		//To move child to Immediate parent(This is not possible in real time)
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/../..")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/parent::div"));
		
		//to move from child to grand parent
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/ancestor::form"));
		
		//to move from one sibling to another sibling in backward direction
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/preceding-sibling::label"));
		
		
	}

}
