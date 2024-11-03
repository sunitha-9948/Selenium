package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage extends BasePage {

	
	//public WebDriver driver;
	public AccountRegistrationPage(WebDriver driver){
		super(driver);
		//this.driver=driver;
		
		//PageFactory.initElements(driver, this);
				
	}
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtfirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtlastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtphone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtconfirm;
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkpolicy;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btncontinue;
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement getMsg;

	
	
	
	public void setfirstname(String fname ) {
		
		txtfirstname.sendKeys(fname);
	}
public void setlastname(String lname ) {
		
		txtlastname.sendKeys(lname);
	}
	
public void setmail(String mail ) {
	
	txtmail.sendKeys(mail);
}

public void setpwd(String pwd ) {
	
	txtpassword.sendKeys(pwd);
}

public void confirmpassword(String pwd ) {
	
	txtconfirm.sendKeys(pwd);
}

public void setphone(String phone) {
	txtphone.sendKeys(phone);
}
public void setpolicy() {
	
	chkpolicy.click();
}
public void contniue() {
	
	btncontinue.click();
}

public String getConfirmationMsg() {
	try{
		return getMsg.getText();
	}catch(Exception e) {
		return (e.getMessage());
	}
	
}
	
	
	
	
	
}
