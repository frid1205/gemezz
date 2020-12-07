/**
 * 
 */
package TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseSetting.BaseSetting;
import Pages.HomePage;
import Pages.LandingPage;
import Pages.LoginPage;
import Pages.RegisterPage;

/**
 * @author fendyridwan
 *
 */
public class AuthenticationTest extends BaseSetting{
	
	
	@Test
	public void B_001() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		HomePage lp = PageFactory.initElements(driver, HomePage.class);
		driver.get("http://ltc.la.gemezz.mobi");
		Thread.sleep(10000);
		System.out.println("-> Tap On side menu button");
		hp.clickTribarButton();
		
		System.out.println("-> Verify side menu");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(hp.helloGuestTextisExist("Hello Guest"), "text hello guest is not exist");
		sa.assertTrue(hp.scheduleIsExist(), "Schedule button is not exist");
		sa.assertTrue(hp.winnerListIsExist(), "winner list is not exist");
		sa.assertTrue(hp.homePageButtonIsExist(), "home page button is not exist");
		sa.assertTrue(hp.subcribeButtonIsExist(), "subscribe button is not exist");
		sa.assertTrue(hp.chooseLanguageIsExist(), "language setting is not exist");
		sa.assertTrue(hp.aboutIsExist(), "about is not exist");
		sa.assertTrue(hp.csIsExist(), "customer support is not exist");
		sa.assertTrue(hp.logoutButtonShouldnotExist(), "Logout button should not be exist, but its exist");
		hp.logoutButton();
		sa.assertAll();
		
	}
	/*
	 * User accesses register page
	 * 
	 * expected result
	 * User should be able to see :
		- register page screen
		- Profile picture field
		- First name field
		- Last name field
		- Email field
		- Password field
		- Enter button (->)
		- Go back button
	 */
	@Test
	public void Authentication_01() throws InterruptedException
	{
		LandingPage lp = PageFactory.initElements(driver, LandingPage.class);
		LoginPage lg = PageFactory.initElements(driver, LoginPage.class);
		RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		//open login page
		lp.clickRegisterButton();
		
		//verify user has accessed login page
		//sa.assertEquals(lg.checkLoginText(), "Login", "Register page is not accessed");
		
		//verify all field is exist register page
		
		assertEquals(rp.avatarIsExist(), true, "avatar is not exist");
		assertEquals(rp.firstNameIsExist(), true, "first name is not exist");
		hidekeyboard();
		assertEquals(rp.lastNameExist(), true, "last name is not exist");
		assertEquals(rp.emailExist(), true, "email is not exist");
		assertEquals(rp.passwordExist(), true, "password is not exist");
		assertEquals(rp.nextButtonIsExist(), true, "next button is not exist");
		assertEquals(rp.goBackButtonExist(), true, "go back button is not exist");
	}
	
	/*
	 * User register with registered email address
	 * 
	 * Expected result
	 * - New account will not saved
	 * - Message validation is prompted
	 */
	@Test
	public void Authentication_02() throws InterruptedException
	{
		RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		
		rp.inputField("wesley", "01", "wesley01@yopmail.com", "12345678");
		
		//verify validation is displayed
		assertEquals(rp.messageValidationIsExist("Username already exists"), true,"Message validation is not displayed");
		
		rp.clickOkMessageValidationButton();
		//rp.clearField();
	}
	
	/*
	 * User register with entering password less than 6 character
	 * 
	 */
	@Test
	public void Authentication_03() throws InterruptedException
	{
		RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		
		rp.inputField("wesley", "100", "wesley01@yopmail.com", "12345");
		
		//verify validation is displayed
		assertEquals(rp.messageValidationIsExist("Password length must be 6 or more"), true,"Message validation is not displayed");
		
		rp.clickOkMessageValidationButton();
		//rp.clearField();
		
	}
	
	/*
	 * User login with invalid credential
	 * 
	 */
	@Test
	public void Authentication_04() throws InterruptedException
	{
		RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		
		rp.inputField("wesley", "11", "wesley11", "12345678");
		
		
		//verify validation is displayed
		assertEquals(rp.messageValidationIsExist("Username is not a valid email address"), true,"Message validation is not displayed");
		
		rp.clickOkMessageValidationButton();
		//rp.clearField();
		
		
	}

}
