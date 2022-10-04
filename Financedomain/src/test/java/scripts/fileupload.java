package scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileupload {
	@Test
	public void auoIt() throws IOException, InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.id("login_Layer")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("simranmanjarekar.sm.5997@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Infotech@45");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__bars']")).click();
	driver.findElement(By.xpath("//a[text()='View & Update Profile']")).click();
	
	//driver.findElement(By.xpath("//
	Runtime.getRuntime().exec("‪C:\\Users\\PANKAJ\\Desktop\\fileupload.au4.exe");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@type='Logout']")).click();
	}
}
