package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AllControls {
	
	public static void main(String[] args) {
		
		// launch the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\eclipse workspace\\Selenium\\Drivers\\Chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// get the URL
		
		driver.get("http://softwaretesting-guru.blogspot.com/p/main-page.html");
		
		//handle Hyperlink
		
		driver.findElement(By.linkText("Selenium Practice page")).click();
		
		//Handle textbox
		
		driver.findElement(By.name("Name")).sendKeys("Selenium");
		
		//Handle Checkbox
		
		driver.findElement(By.name("subscribe")).click();
		
		// Handle text area
		driver.findElement(By.name("comments")).sendKeys("Welcome to Selenium");
		
		// Handle dropdown
		
  new Select(driver.findElement(By.name("countries"))).selectByVisibleText("Aruba");
  
  // Handle radio button
  
  driver.findElement(By.xpath("//input[@value='bad']")).click();
  	
		driver.close();
	}
	
	
	

}
