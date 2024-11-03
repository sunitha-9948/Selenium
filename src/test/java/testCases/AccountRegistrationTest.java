package testCases;

import static org.testng.Assert.fail;

import java.time.Duration;

import org.apache.commons.exec.util.StringUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.util.Strings;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.cucumber.java.After;
import pageObject.AccountRegistrationPage;
import pageObject.HomePage;
import testBase.BaseCase;

public class AccountRegistrationTest extends BaseCase {

	
	//public WebDriver driver;
	@Test
	public void AccountRegistration_Test() throws InterruptedException{
		
		
	//logger.info("*****starting TC001 accountregisterpage*****");
		//try {//if any exception comes it vl handle automatically
		HomePage hp=new HomePage(driver);
		
		hp.clickmyaccount();
		hp.clickregister();
		//hp.Loginlink();
		
//logger.info("*****clicked on myaccount likn TC001 accountregisterpage*****");

		AccountRegistrationPage regpage= new AccountRegistrationPage(driver);
		
	regpage.setfirstname(randomeString().toUpperCase());
	Thread.sleep(5000);
		regpage.setlastname(randomeString().toUpperCase());
		Thread.sleep(5000);
		regpage.setmail(randomeString()+"@gmail.com");
		Thread.sleep(5000);
		regpage.setphone(randomeNumber());
		Thread.sleep(5000);
		String password= randomeNumeric();
		regpage.setpwd(password);
		regpage.confirmpassword(password);
		Thread.sleep(5000);
		regpage.setpolicy();
		
		Thread.sleep(5000);
		regpage.contniue();
		Thread.sleep(5000);
		
		//password
		
		
		
		//need to craete xpath for below one
		String confmmsg= regpage.getConfirmationMsg();
		
		/*if(confmmsg.equals("Your Account Has Been Created!")) {
			Assert.assertTrue(true);
		}else {
			logger.info("test info...");
			logger.debug("debug info......");
			Assert.assertTrue(false);
		}
		Assert.assertEquals(confmmsg, "Your Account Has Been Created!");
		
		}
		catch(Exception e) {
			
			//if any excption comes it vl handle here
			//assert.fail();
		}
		logger.info("****logerr fininshed****");
	*/
	
		}
	
}
