/**
 * 
 */
package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseSetting.BaseSetting;
import Pages.AboutPage;
import Pages.CustomerSupportPage;
import Pages.HomePage;
import Pages.searchPage;

/**
 * @author fendyridwan
 *
 */
public class SideMenuTest extends BaseSetting{
	
	/*
	 * Tap on Home Button
	
	 */
	@Test
	public void E_002() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		
		System.out.println("-> Tap on Home Button");
		System.out.println("-> Tap On side menu button");
		hp.clickTribarButton();
		
		System.out.println("-> Tap On home page menu button");
		hp.clickHomePageButton();
		Thread.sleep(7000);
		
		System.out.println("-> verify by URL");
		Assert.assertTrue(verifyURLisvalid("home"), "home page is not displayed");
	}
	
	/*
	 * Tap on competition schedule
	
	 */
	@Test
	public void E_003() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		
		System.out.println("-> Tap on competition schedule");
		System.out.println("-> Tap On side menu button");
		hp.clickTribarButton();
		
		System.out.println("-> Tap On schedule menu button");
		hp.clickSchedule();
		Thread.sleep(7000);
		
		System.out.println("-> verify by URL");
		Assert.assertTrue(verifyURLisvalid("competitionschedule"), "schedule page is not displayed");
	}
	
	/*
	 * Tap on winner list menu
	
	 */
	@Test
	public void E_004() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		
		System.out.println("-> Tap on winner list");
		System.out.println("-> Tap On side menu button");
		hp.clickTribarButton();
		
		System.out.println("-> Tap On winner list menu button");
		hp.clickWinnerList();
		Thread.sleep(7000);
		
		System.out.println("-> verify by URL");
		Assert.assertTrue(verifyURLisvalid("winnersprizelist"), "schedule page is not displayed");
	}
	
	/*
	 * Subcribe button
	
	 */
	@Test
	public void E_005() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		HomePage hp1 = PageFactory.initElements(driver, HomePage.class);
		
		System.out.println("-> Logout button");
		System.out.println("-> Tap On side menu button");
		hp.clickTribarButton();
		
		System.out.println("-> if login, user should logout");
		hp.logoutIfUserLogin();
		
		System.out.println("-> Access URL");
		accessHomePage();
		
		System.out.println("-> Tap On side menu button");
		hp.clickTribarButton();
		
		System.out.println("-> verify subcribe button is exist");
		sa.assertTrue(hp.subcribeButtonIsExist(), "subcribe button is not displayed");
		
		System.out.println("-> if login, user should logout");
		hp1.logoutIfUserLogin();
		
		//Login
		login();
		
		System.out.println("-> Tap On side menu button");
		hp1.clickTribarButton();
		
		System.out.println("-> verify subcribe button is exist");
		sa.assertTrue(!hp1.subcribeButtonIsExist(), "subcribe button should not be displayed");
		
		sa.assertAll();
	}
	
	/*
	 * Logout button
	
	 */
	@Test
	public void E_006() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		HomePage hp1 = PageFactory.initElements(driver, HomePage.class);
		
		System.out.println("-> Logout button");
		System.out.println("-> Tap On side menu button");
		hp.clickTribarButton();
		
		System.out.println("-> if login, user should logout");
		hp.logoutIfUserLogin();
		
		//login
		login();
		
		System.out.println("-> Tap On side menu button");
		hp.clickTribarButton();
		
		System.out.println("-> verify logout button is exist");
		sa.assertTrue(hp.logoutButtonIsExist(), "Logout button is not displayed");
		
		System.out.println("-> Tap On logout button");
		hp1.logoutButton();
		
		System.out.println("-> Tap On side menu button");
		hp1.clickTribarButton();
		
		System.out.println("-> verify logout button should not exist");
		sa.assertTrue(hp1.logoutButtonShouldnotExist(),"logoutbutton should not be displyed");
		
		sa.assertAll();
	}
	
	/*
	 * About Us
	 * 	
	 */
	@Test
	public void E_008() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AboutPage ap = PageFactory.initElements(driver, AboutPage.class);
		
		System.out.println("-> About Us Menu button");
		System.out.println("-> Tap On side menu button");
		hp.clickTribarButton();
		
		System.out.println("-> Tap On About Us menu button");
		hp.clickAbout();
		Thread.sleep(6000);
		
		System.out.println("-> verify about page by URL");
		Assert.assertTrue(ap.verifyAboutURL(), "About page is not displayed");
	}
	
	/*
	 * Customer Support
	 * 	
	 */
	@Test
	public void E_009() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		CustomerSupportPage csp = PageFactory.initElements(driver, CustomerSupportPage.class);
		
		System.out.println("-> About Us Menu button");
		System.out.println("-> Tap On side menu button");
		hp.clickTribarButton();
		
		System.out.println("-> Tap On Customer Support menu button");
		hp.clickCS();
		Thread.sleep(6000);
		
		System.out.println("-> verify Customer page by URL");
		Assert.assertTrue(csp.verifyAboutURL(), "Customer page is not displayed");
	}

}
