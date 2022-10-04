package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class invocationcount {
	@DataProvider
	public Object[][] getData()
	{
		Object[][] a=new Object[3][2];
		
		a[0][0]="ajbck";
		a[0][1]="ajdgaluywuio";
		
		a[1][0]="12335657";
		a[1][1]="9384202181388";
		
		a[2][0]="as&%#1225sdks.";
		a[2][1]="jskakl29492##R!O($&%^*";
		
		return a;
	}
	@Test(dataProvider="getData")
	
	public void demo(String user, String pass) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(("https://www.facebook.com/"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		Thread.sleep(3000);
	driver.close();
	}

}
