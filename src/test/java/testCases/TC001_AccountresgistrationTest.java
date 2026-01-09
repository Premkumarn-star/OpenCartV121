package testCases;

import java.sql.Driver;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.BaseClass;
import net.bytebuddy.utility.RandomString;
import pageobjects.AccountRegistartion;
import pageobjects.Home;

public class TC001_AccountresgistrationTest extends BaseClass
{

	@Test(groups={"Regression","Master"})
	public void verify_acunt_registration() 
	
	{
		logger.info("***** Starting TC001_AccountRegistrationTest  ****");
		try {
		Home hp =new Home(driver);
		hp.clickMyaccount();
		logger.info("Clicked on MyAccount Link.. ");
		hp.clickRegister();
		logger.info("Clicked on Register Link.. ");
		
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		AccountRegistartion registartion =new AccountRegistartion(driver);
		 	
		logger.info("Providing customer details...");
		
		System.out.println("Current Page: " + driver.getCurrentUrl());

		
		registartion.setfirstname(randomeString().toUpperCase());
		registartion.setlastname(randomeString().toUpperCase());
		registartion.setEmail(randomeString()+"@gmail.com");
		registartion.settelephone(randomeNumber());
		String password =randomeAlphanumeric();
		registartion.setpassword(password);
		registartion.setconfirmpwd(password);
		registartion.setprivacypolicy();
		registartion.clickcontinue();
		logger.info("Validating expected message..");
		
		String confmsg=registartion.getconfirmationmsg();
		Assert.assertEquals(confmsg,"Your Account Has Been Created!");
		}
		catch (Exception e) {
			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());
		}

		
		//Warning: E-Mail Address is already registered!
		logger.info("***** Finished TC001_AccountRegistrationTest *****");	
		
	}
	
	
	
	
	
	
}

