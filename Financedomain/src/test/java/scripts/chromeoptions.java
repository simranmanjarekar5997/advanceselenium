package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromeoptions {
	@Test
	public void tc1() {
		
ChromeOptions options=new ChromeOptions();
options.addArguments("--disable-notifications");
	System.out.println(options);
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(options);
	//driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	System.out.println(driver.getCurrentUrl());

	System.out.println(driver.getTitle());

}
}