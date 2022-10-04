package scripts;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test0 {
	@Test 
	public void tc1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("Enum");
		driver.findElement(By.id("pass")).sendKeys("Enum1234");
		while(true) {
			try {
		 driver.findElement(By.id("l")).click();
		break;
			}
			catch(Exception e)
			{
				//e.printStackTrace();
				System.out.println( e.getMessage());
				//System.out.println("Element not visible");
				
			break;	
				
			}		}
		
		
		driver.close();
		
}
}

