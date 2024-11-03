package testBase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseCase {

	 public WebDriver driver;
	
	//public Logger logger;
	public Properties prop;
	
	@BeforeClass
	@Parameters({"os","browser"})
	//@Optional(os)
	
	public void setup(@Optional("os") String os ,@Optional("Firefox") String br) throws IOException{
		
		//loading config.properties
		
		FileReader file= new FileReader("./src//test//resources//config.properties");
		prop=new Properties();
		prop.load(file);
		
		//FileInputStream ip= new FileInputStream();
		
		
	//logger=LogManager.getLogger(this.getClass());
	
		driver= new ChromeDriver();
		//parallerl excution one tc
		
		switch(br.toLowerCase())
		{
		case "chrome" :driver= new ChromeDriver(); break;
		case "edge" : driver= new EdgeDriver();break;
		case "forefox" : driver= new FirefoxDriver(); break;
		default :System.out.print("invalid browser-----");return;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		
	driver.get(prop.getProperty("appURL"));//reading url from properties file
		driver.manage().window().maximize();	
	}
	
	

@AfterClass
public void teardown(){
	driver.quit();
}
	public String randomeString() {
		String genaratestring1= RandomStringUtils.randomAlphabetic(5);
		return genaratestring1;
		
	}
	public String randomeNumber() 
	{
		String genaratednumber1= RandomStringUtils.randomNumeric(10);
		return genaratednumber1;
		
	}
	
	public String randomeNumeric() {
		
		String genaratedstring= RandomStringUtils.randomAlphabetic(3);
		String genaratednumber= RandomStringUtils.randomNumeric(2);
		return (genaratedstring+"@"+genaratednumber);
		
	


}
	
}
