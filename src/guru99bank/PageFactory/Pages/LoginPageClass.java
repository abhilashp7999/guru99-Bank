package guru99bank.PageFactory.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	
	WebDriver driver;
	
	//this class contains all web-elements of login page and methods that operate on those web-elements
	@FindBy(name="uid")
	WebElement user99GuruName;
	
	@FindBy(name="password")
	WebElement password99Guru;
	
	@FindBy(className ="barone")
	WebElement titleText;
	
	@FindBy(name="btnLogin")
	WebElement login;
	
	public LoginPageClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); //initElements method create all web elements
	}
	
	//set username in text box
	public void setUsername(String strUserName)
	{
		user99GuruName.sendKeys(strUserName);
	}

	//set password in text box
	public void setPassword(String setPassword)
	{
		password99Guru.sendKeys(setPassword);
	}
	
	//get the title of login page
	public String getLoginTitle()
	{
		return titleText.getText();
	}
	
	//click the login button
	public void clickLogin()
	{
		login.click();
	}
	
	public void loginToGuru99(String strUserName, String strPassword)
	{
		this.setUsername(strUserName);
		this.setPassword(strPassword);
		this.clickLogin();
		
	}
	
	
	
	
}
