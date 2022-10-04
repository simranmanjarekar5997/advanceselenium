package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class disable {
	@Test
	public void demo() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/PANKAJ/Desktop/disable.html");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement ele=driver.findElement(By.id("abc"));
	if(ele.isEnabled())
	{
		System.out.println("enabled");
	}
	else {
		System.out.println("disabled");
	}
	JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("document.getElementById('abc').value='Simran'");
Thread.sleep(3000);
js.executeScript("document.getElementById('abc').value=''");
Thread.sleep(3000);   
driver.close();


}

}