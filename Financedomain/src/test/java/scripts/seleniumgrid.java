package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumgrid {
	@Test
	public void demo() throws MalformedURLException {
		
URL remoteAddress=new URL("https://192.168.1.103/4444/wd/hub");
DesiredCapabilities capabilities=new DesiredCapabilities();	
capabilities.setBrowserName("chrome");
RemoteWebDriver driver=new RemoteWebDriver(remoteAddress, capabilities);

WebDriverManager.chromedriver().setup();

driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
System.out.println(driver.getCurrentUrl());

System.out.println(driver.getTitle());
driver.findElement(By.id("email")).sendKeys("Enum");
driver.findElement(By.id("pass")).sendKeys("Enum1234");
	
	}

}
