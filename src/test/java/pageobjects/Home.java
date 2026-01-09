package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage {
	public Home(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath = "//span[normalize-space()='My Account']")
WebElement InkMyaccount;
@FindBy(xpath="//a[normalize-space()='Register']") 
WebElement lnkRegister;
//@FindBy(linkText = "Login")   // Login link added in step5
//WebElement linkLogin;
@FindBy(xpath="//a[normalize-space()='Login']") 
WebElement linkLogin;

//a[normalize-space()='Login']


public void clickMyaccount() 
{
	InkMyaccount.click();
	
}

public void clickRegister()
{
	lnkRegister.click();
}

public void clickLogin()
{
	linkLogin.click();
}
}
