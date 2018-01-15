package guru99bank.PageFactory.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {

	WebDriver driver;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[3]")
	WebElement homePageUserName;
	
	
	
	public HomePageClass(WebDriver driver)
	{
		this.driver = driver;
		
		//initElement method creates all the web-elements
		PageFactory.initElements(driver, this);
		
		
	}
	
	public String getHomePageDashboardUserName()
	{
		return homePageUserName.getText();
	}
	
	
}
