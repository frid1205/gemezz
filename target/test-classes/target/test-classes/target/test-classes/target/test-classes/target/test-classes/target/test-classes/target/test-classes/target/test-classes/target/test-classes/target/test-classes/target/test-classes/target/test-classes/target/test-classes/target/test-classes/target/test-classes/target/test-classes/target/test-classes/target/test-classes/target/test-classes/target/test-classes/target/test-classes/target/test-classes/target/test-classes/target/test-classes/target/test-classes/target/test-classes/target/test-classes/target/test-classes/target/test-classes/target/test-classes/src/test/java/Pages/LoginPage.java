/**
 * 
 */
package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseSetting.BaseSetting;

/**
 * @author fendyridwan
 *
 */
public class LoginPage extends BaseSetting {
	
	/*Login Page*/
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	@CacheLookup
	WebElement loginText;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/et_email")
	@CacheLookup
	WebElement email;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/et_password")
	@CacheLookup
	WebElement password;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_forgot_password")
	@CacheLookup
	WebElement forgotPassword;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/bt_next")
	@CacheLookup
	WebElement nextButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/bt_login")
	@CacheLookup
	WebElement loginButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_register_new_account")
	@CacheLookup
	WebElement registerButton;
	
	public void clickLoginButton() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(loginButton)).click();
		
	}
	
	public void clickRegisterButton()
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(registerButton)).click();
	}
	
	
	public String checkLoginText()
	{
		String LoginText;
		LoginText = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(loginText)).getText();
		
		return LoginText;
	}
	
	public void typeEmail(String email)
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(this.email)).sendKeys(email);
	}
	
	public void typePass(String password)
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(this.password)).sendKeys(password);
	}
	
	public void clickNextButton()
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(nextButton)).click();
	}
	
	public void login(String emailIsi, String passIsi) throws InterruptedException {
		typeEmail(emailIsi);
		typePass(passIsi);
		clickNextButton();
		
		Thread.sleep(3000);
	}
	
	
	

}
