package Com.Crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.Crm.BaseClass.BaseClass;

public class LoginPage extends BaseClass
{	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='user_name']")
	private static WebElement name;
	@FindBy(xpath = "//input[@name='user_password']")
	private static WebElement password; 
	@FindBy(id = "submitButton")
     private static WebElement button;
	@Test
public void username(String name1,String password1)
{
	name.sendKeys(name1);
	password.sendKeys(password1);
	button.click();
}
}
