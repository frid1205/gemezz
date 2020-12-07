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
public class RegisterPage extends BaseSetting{
	
	WebDriver driver;
	public static String messageValidationText;
	
	/*Landing Page*/
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "sg.wesley:id/tv_hello_user")
	@CacheLookup
	WebElement helloUser;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/iv_avatar")
	@CacheLookup
	WebElement avatar;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/et_first_name")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/et_last_name")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/et_email")
	@CacheLookup
	WebElement email;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/et_password")
	@CacheLookup
	WebElement password;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/bt_next")
	@CacheLookup
	WebElement nextButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/btn_go_back")
	@CacheLookup
	WebElement goBackButton;
	
	@FindBy(how = How.ID, using = "android:id/message")
	@CacheLookup
	WebElement messageValidation;
	
	@FindBy(how = How.ID, using = "android:id/button1")
	@CacheLookup
	WebElement okMessageValidationButton;
	
	
	
	
	public void typeFirstName(String firstNameIsi) throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(firstName)).sendKeys(firstNameIsi);
		hidekeyboard();
		
	}
	
	public void typeLastName(String lastNameIsi) throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(lastName)).sendKeys(lastNameIsi);
		hidekeyboard();
	}
	
	public void typeEmail(String emailIsi) throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(email)).sendKeys(emailIsi);
		hidekeyboard();
	}
	
	public void typePassword(String passIsi) throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(password)).sendKeys(passIsi);
		hidekeyboard();
	}
	
	public void clickNextButton() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(nextButton)).click();
		
	}
	
	public void clickOkMessageValidationButton() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(okMessageValidationButton)).click();
		
	}
	
	public void inputField(String firstName, String lastName, String email, String pass) throws InterruptedException 
	{
		typeFirstName(firstName);
		typeLastName(lastName);
		typeEmail(email);
		typePassword(pass);
		clickNextButton();
		
		Thread.sleep(3000);
	}
	
	public void clearField() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(firstName)).clear();
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(lastName)).clear();
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(email)).clear();
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(password)).clear();
	}
	
	
	public boolean avatarIsExist() {
		if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(avatar)).isDisplayed()==true) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean firstNameIsExist() {
		if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(firstName)).isDisplayed()==true) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean lastNameExist() {
		if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(lastName)).isDisplayed()==true) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean emailExist() {
		if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(email)).isDisplayed()==true) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean passwordExist() {
		if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(password)).isDisplayed()==true) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean nextButtonIsExist() {
		if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(nextButton)).isDisplayed()==true) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean goBackButtonExist() {
		if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(goBackButton)).isDisplayed()==true) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean messageValidationIsExist(String message) {
		
		messageValidationText = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(messageValidation)).getText();
		
		if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(messageValidation)).isDisplayed()==true 
			&& messageValidationText.equals(message)) {
			return true;
		}
		else
		{
			return false;
		}
	}

}
