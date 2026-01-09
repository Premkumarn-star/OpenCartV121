package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.sql.Driver;
import java.time.Duration;
import pageobjects.AccountRegistartion;
import pageobjects.Home;
import pageobjects.*;
import testBase.BaseClass;

import org.openqa.selenium.WebDriver;

public class TC002_LoginTest extends BaseClass{

	@Test(groups={"Sanity","Master"})
	public void verify_login()
	{
		logger.info("****** Startign TC_002_LoginTest *****");
		
		try
		{
		//HomePage
		Home hp = new Home(driver);
		hp.clickMyaccount(); 
		hp.clickLogin();
	
		//Login
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		//MyAccount
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetPage=macc.isMyAccountPageExists();
		
		Assert.assertTrue(targetPage);//Assert.assertEquals(targetPage, true,"Login failed");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("****** Finished TC_002_LoginTest *****");
	}
	
}