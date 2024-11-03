package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	//public WebDriver driver;
	
	public HomePage(WebDriver driver){
		super(driver);
		
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement lnkmyaccount;
	
	@FindBy(xpath="(//a[text()='Register'])[1]")
	WebElement lnkregister;

	//@FindBy(linkText = "Login")
	@FindBy(xpath="(//a[text()='Login'])[1]")
	WebElement linklogin;   //login likn added in steps
	
	public void clickmyaccount() {
		lnkmyaccount.click();
	}
	public void clickregister() {
		lnkregister.click();
	}
	public void clicklogin() {
		linklogin.click();
	}
	
	
	
	
}
