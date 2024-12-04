package Com.Crm.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;s
import org.testng.annotations.BeforeSuite;

import Com.Crm.Pom.LoginPage;

public class BaseClass
{
public WebDriver driver;

@BeforeSuite
public void priCondition(String browser)
{
	if(browser.equalsIgnoreCase("chrome"))
	{
		driver = new ChromeDriver();
		
	}
	if(browser.equalsIgnoreCase("edge"))
	{
		driver = new EdgeDriver();
	}
	if(browser.equals("firfox"))
	{
		driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://localhost:8888/");
}
@BeforeMethod
public void login()
{
	LoginPage login = new LoginPage(driver);
	login.username("admin","root");
}
//@AfterMethod
//public void logout()
//{
//	
//}
}
