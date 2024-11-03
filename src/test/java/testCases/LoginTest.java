package testCases;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import pageObject.HomePage;
import pageObject.LoginPage;
import testBase.BaseCase;

public class LoginTest extends BaseCase{
		
	
	@Test
	public void TC2_LoginTest() throws InterruptedException{
		
		//homepage

		HomePage home=new HomePage(driver);

		home.clickmyaccount();
		Thread.sleep(5000);
		home.clicklogin();
		
		//LoginPage
		
		LoginPage p= new LoginPage(driver);
		p.setEmail(prop.getProperty("email"));
		Thread.sleep(5000);
		p.setPassword(prop.getProperty("password"));
		p.clickLogin();
		
		Thread.sleep(5000);
		
		//Account page
		
		AccountPage ap= new AccountPage(driver);
		boolean targetpage=ap.isMyAccountExists();
		Assert.assertTrue(targetpage);
		
		
		
		
	}
	
	
}
