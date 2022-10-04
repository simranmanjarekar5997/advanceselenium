package scripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class database {
	
	@Test
	public void demo() throws SQLException
	{
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/cursue","root","Infotech@45");
		Statement statement=co.createStatement();
		String query="select * from logintables";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(("https://www.facebook.com/"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ResultSet result=statement.executeQuery(query);
		while(result.next())
		{

			driver.findElement(By.id("email")).sendKeys(result.getString(1));
			driver.findElement(By.id("pass")).sendKeys(result.getString(2));
		}
	
	
	}
}
