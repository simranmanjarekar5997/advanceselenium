package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {
	@Test
	public void Drag()
	{
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	

}
}
