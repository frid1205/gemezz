/**
 * 
 */
package Pages;

import org.openqa.selenium.WebDriver;
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
public class LandingPage extends BaseSetting {
	
	WebDriver driver;
	
	/*Landing Page*/
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
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

}
