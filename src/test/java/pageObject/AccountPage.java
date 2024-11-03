package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

	WebDriver driver;
	
	
	public AccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath= "//h2[text()='My Account']")
	WebElement msgHeading;
	
	@FindBy(xpath="(//a[text()='Logout'])[2]")
	WebElement btnlogout;
	
	public void clicklogout() {
		
		btnlogout.click();
	}
	
	public boolean isMyAccountExists() 
	{
		
	try {
		
		return msgHeading.isDisplayed();
	}
		catch(Exception e) 
{
		return false;
	}
}}
