package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dps {
	@Test
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("Enum");
		driver.findElement(By.id("pass")).sendKeys("Enum1234");

		driver.findElement(By.name("login")).click();
		driver.close();
		
		
	}

}
