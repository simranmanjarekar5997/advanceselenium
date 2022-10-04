package Typesofparallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dpe {
	WebDriver driver;
	
	
	
	@Test
	@Parameters(value="browser")
	public void tc1( String browser) {
		WebDriverManager.chromedriver().setup();
	
		WebDriverManager.firefoxdriver().setup();
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("browserName", browser);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("simran");
		driver.findElement(By.id("pass")).sendKeys("sam1234");

		driver.findElement(By.name("login")).click();
		driver.close();
		
		
	}
}
