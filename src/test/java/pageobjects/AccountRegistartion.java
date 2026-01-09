package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import freemarker.core.ReturnInstruction.Return;

public class AccountRegistartion extends BasePage{
	public AccountRegistartion(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtlastname;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txttelephone;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtpwd;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtconfirmpwd;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement chcktpolicy;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btncontinue;
	
	@FindBy(xpath ="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgconfirmation;
	
	 private void waitFor(WebElement element) {
	        new WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.visibilityOf(element));
	    }

public void setfirstname(String fname) 
{
	txtFirstName.sendKeys(fname);	
}

public void setlastname(String lname) 
{
	txtlastname.sendKeys(lname);
}

public void setEmail(String email) 
{
	txtEmail.sendKeys(email);
}

public void settelephone(String tel) 
{
	txttelephone.sendKeys(tel);
}

public void setpassword(String pwd) 
{
	txtpwd.sendKeys(pwd);
}

public void setconfirmpwd(String pwd) 
{
	txtconfirmpwd.sendKeys(pwd);
}

public void setprivacypolicy()
{
	chcktpolicy.click();
}

public void clickcontinue()
{
	btncontinue.click();
}

public String getconfirmationmsg() {
	try {
		return(msgconfirmation.getText());
	}
	catch(Exception e) {
		return (e.getMessage());
	}	
}

}






