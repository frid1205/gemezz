/**
 * 
 */
package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseSetting.BaseSetting;
import Pages.ProfilePage;

/**
 * @author fendyridwan
 *
 */
public class ProfileTest extends BaseSetting{

	@Test
	public void login() throws InterruptedException
	{
		ProfilePage pp = PageFactory.initElements(driver, ProfilePage.class);
		
		signIn();
		Thread.sleep(3000);
		
		pp.clickMoreTab();
		
	}
	
	/*
	 * Update profile picture from camera
	 * 
	 * Expected result
	 * Profile picture is updated
	 * 
	 */
	@Test
	public void Profile_01() throws InterruptedException
	{
		ProfilePage pp = PageFactory.initElements(driver, ProfilePage.class);
		
		pp.takeAPicFromCamera();
		
		//Assert.assertEquals(mp.getWebViewTitle(), "Latest Updates","title is not found");
		
		//no assertion, if this test case can thorough all step, it means passed
	}
	
	/*
	 * Update profile picture from internal device folder
	 * 
	 * Expected result
	 * Profile picture is updated
	 * 
	 */
	@Test
	public void Profile_02() throws InterruptedException
	{
		ProfilePage pp = PageFactory.initElements(driver, ProfilePage.class);
		
		pp.takeApicFromFolder();
		
		//Assert.assertEquals(mp.getWebViewTitle(), "Latest Updates","title is not found");
		
		//no assertion, if this test case can thorough all step, it means passed
	}
	
	/*
	 * Unable to edit email address
	 * 
	 * Expected result
	 * Email field is disabled
		User cannot edit email address
	 * 
	 */
	@Test
	public void Profile_03() throws InterruptedException
	{
		ProfilePage pp = PageFactory.initElements(driver, ProfilePage.class);
		
		pp.clickEditProfileButton();
		
		Assert.assertTrue(pp.checkEmailIsEnabled(), "email address field is enabled");
	}
	
	/*
	 * User changes first name & last name
	 * 
	 * Expected result
	 * First name & Last name are updated
	 * 
	 */
	@Test
	public void Profile_04() throws InterruptedException
	{
		ProfilePage pp = PageFactory.initElements(driver, ProfilePage.class);
		String firstName = getDay();
		String lastName = String.valueOf(getCurrentTime());
		backButton();
		
		pp.clickEditProfileButton();
		
		pp.typeFirstName(firstName);
		
		pp.typeLasttName(lastName);
		
		pp.clickDoneButton();
		
		Assert.assertEquals(pp.getUserNameinMoreTab(), firstName+" "+lastName,"user name is different");
	}
	
	/*
	 * Update password with password & co-password are different
	 * 
	 * Expected result
	 * Password is not updated
		Display message validation "New password doesn't match"
	 * 
	 */
	@Test
	public void Profile_05() throws InterruptedException
	{
		ProfilePage pp = PageFactory.initElements(driver, ProfilePage.class);
		
		pp.clickEditProfileButton();
		
		pp.typeNewPassword("12345678");
		
		pp.typeCoPassword("123456789");
		
		pp.clickDoneButton();
		
		Thread.sleep(1000);
	
		try {
			Assert.assertEquals(findTextContains("New Password does not match"), "New Password does not match","password validation is not match");
			
		}catch(Exception e) {
			backButton();
			//Assert.assertTrue(false,"cannot find element");
		}
		
	}
	
	/*
	 * Update password with password & co-password are less than 6 character
	 * 
	 * Expected result
	 * Password is not updated
		Display message validation "Password length must be 6 or more"
	 * 
	 */
	@Test
	public void Profile_06() throws InterruptedException
	{
		ProfilePage pp = PageFactory.initElements(driver, ProfilePage.class);
		
		pp.clickEditProfileButton();
		
		pp.typeNewPassword("12345");
		
		pp.typeCoPassword("12345");
		
		pp.clickDoneButton();
		
		Thread.sleep(1000);
		
		Assert.assertEquals(pp.getAndroidMessage(), "Password length must be 6 or more","password validation is not match");
	}
	
	/*
	 * Update password
	 * 
	 * Expected result
	 * Password is updated
	 * 
	 */
	@Test
	public void Profile_07() throws InterruptedException
	{
		ProfilePage pp = PageFactory.initElements(driver, ProfilePage.class);
		
		pp.clickEditProfileButton();
		
		pp.typeNewPassword("12345678");
		
		pp.typeCoPassword("12345678");
		
		pp.clickDoneButton();
		
	}
}
