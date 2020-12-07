/**
 * 
 */
package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseSetting.BaseSetting;
import Pages.HomePage;
import Pages.searchPage;

/**
 * @author fendyridwan
 *
 */
public class TopNavigationTest extends BaseSetting{
	
	/*
	 * Side menu button if user not login
	
	 */
	@Test
	public void B_001() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
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
	 * Side menu button if user login
	
	 */
	@Test
	public void B_002() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		System.out.println("-> Tap On side menu button");
		
		login();
		
		hp.clickTribarButton();
		
		System.out.println("-> Verify side menu");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(hp.helloGuestTextisExist("2059431100"), "text 2059431100 is not exist");
		sa.assertTrue(hp.scheduleIsExist(), "Schedulle button is not exist");
		sa.assertTrue(hp.winnerListIsExist(), "winner list is not exist");
		sa.assertTrue(hp.homePageButtonIsExist(), "home page button is not exist");
		sa.assertTrue(hp.subcribeButtonIsExist(), "subscribe button is not exist");
		sa.assertTrue(hp.chooseLanguageIsExist(), "language setting is not exist");
		sa.assertTrue(hp.aboutIsExist(), "about is not exist");
		sa.assertTrue(hp.csIsExist(), "customer support is not exist");
		sa.assertAll();
		
	}
	
	/*
	 * Tap On logo
	
	 */
	@Test
	public void B_003() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		
		System.out.println("-> Tap on logo");
		hp.clickLogo();
		
		System.out.println("-> Verify page is in homescreen");
		Assert.assertTrue(hp.assertURL(),"URL is found");
		
	}
	
	/*
	 * Tap on search icon
	
	 */
	@Test
	public void B_004() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		searchPage hp = PageFactory.initElements(driver, searchPage.class);
		
		System.out.println("-> Tap on search icon");
		hp.clickSearch();
		
		System.out.println("-> Verify page is in search page");
		Assert.assertTrue(sp.isSearchPage(),"Page is not displayed");
		
	}

}
