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

/**
 * @author fendyridwan
 *
 */
public class ProfilePage {
	WebDriver driver;
	
	/*Plan Tab*/
	public ProfilePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using = "sg.wesley:id/iv_more_tab")
	@CacheLookup
	WebElement moreTab;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/iv_avatar")
	@CacheLookup
	WebElement avatarTab;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")
	@CacheLookup
	WebElement camera;
	
	@FindBy(how = How.ID, using = "com.android.permissioncontroller:id/permission_allow_button")
	@CacheLookup
	WebElement allowCameraPersimissionButton;

	@FindBy(how = How.XPATH, using = "(//GLButton[@content-desc=\"NONE\"])[2]")
	@CacheLookup
	WebElement takeAPicButton;
	
	@FindBy(how = How.XPATH, using = "(//GLButton[@content-desc=\"NONE\"])[1]")
	@CacheLookup
	WebElement okTakePicButton;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ImageView")
	@CacheLookup
	WebElement folder;
	
	@FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[@content-desc=\"Screenshot_20201012-111649_LINE.jpg, 0.97 MB, 11:16\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView")
	@CacheLookup
	WebElement pic1;
	
	//edit Profile
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_edit_profile")
	@CacheLookup
	WebElement editProfileButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/et_email")
	@CacheLookup
	WebElement emailAddressField;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/et_first_name")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/et_last_name")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_done")
	@CacheLookup
	WebElement doneButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_user_name")
	@CacheLookup
	WebElement userNameinMoreTab;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/et_new_password")
	@CacheLookup
	WebElement newPassword;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/et_retype_new_password")
	@CacheLookup
	WebElement coPassword;
	
	@FindBy(how = How.ID, using = "android:id/message")
	@CacheLookup
	WebElement androidMessage;
	
	
	
	public void clickMoreTab() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(moreTab)).click();
	}
	
	public void clickAvatarTab() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(avatarTab)).click();
	}
	
	public void clickAllowPermission() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(allowCameraPersimissionButton)).click();
	}
	
	public void clickOkTakePicButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(okTakePicButton)).click();
	}
	
	public void takeAPicFromCamera() {
		clickAvatarTab();
		clickAllowPermission();
		clickAllowPermission();
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(camera)).click();
		
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(takeAPicButton)).click();
		
		clickOkTakePicButton();
	}
	
	public void takeApicFromFolder() {
		clickAvatarTab();

		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(folder)).click();
		
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(pic1)).click();
		
	}
	
	public void clickEditProfileButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(editProfileButton)).click();
	}
	
	public boolean checkEmailIsEnabled() {
		if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(emailAddressField)).isEnabled()==false) {
			return true;
		}else {
			return false;
		}
	}
	
	public void typeFirstName(String firstName) {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(this.firstName)).sendKeys(firstName);;
	}
	
	public void typeLasttName(String lastName) {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(this.lastName)).sendKeys(lastName);
	}
	
	public void clickDoneButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(doneButton)).click();
	}
	
	public String getUserNameinMoreTab() {
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(userNameinMoreTab)).getText();
	}
	
	public void typeNewPassword(String a) {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(newPassword)).sendKeys(a);
	}
	
	public void typeCoPassword(String a) {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(coPassword)).sendKeys(a);
	}
	
	public String getAndroidMessage() {
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(androidMessage)).getText();
	}

}
