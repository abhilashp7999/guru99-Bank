package guru99bank.Pages;
//page class for Login page contains web Elements and methods that perform operations on elements
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	
	WebDriver driver;
	
	//web-elements or objects of a login page
	By userName = By.name("uid");
	By password = By.name("password");
	By title = By.className("barone");
	By loginButton = By.name("btnLogin");
	
	
	
	
	//methods that perform operations on the web-elements
	public Login(WebDriver driver)   //constructor
	{
		this.driver = driver;  //converting instance variables to local variables
	}
	
	//set username in text box
	
	public void setUserName(String strUserName)
	{
		driver.findElement(userName).sendKeys(strUserName);
	}
	
	public void setPassword(String strPassword)
	{
		driver.findElement(password).sendKeys(strPassword);
	}
	
	public void clickLogin()
	{
		
		driver.findElement(loginButton).click();
	}
	
	public String getLoginTitle()
	{
		return driver.findElement(title).getText();
	}
	
	
		
	public void loginToGuru99(String strUserName, String strPassword)
	{
		this.setUserName(strUserName);
		this.setPassword(strPassword);
		this.clickLogin();
		
		
		
	}
	
	
}
