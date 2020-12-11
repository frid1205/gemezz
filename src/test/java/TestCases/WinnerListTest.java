/**
 * 
 */
package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseSetting.BaseSetting;
import Pages.HomePage;
import Pages.WinnerListPage;

/**
 * @author fendyridwan
 *
 */
public class WinnerListTest extends BaseSetting {

	/*
	 * Access winner list page
	
	 */
	@Test
	public void G_001() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		WinnerListPage wlp = PageFactory.initElements(driver, WinnerListPage.class);
		
		System.out.println("-> Access Winners List page");
		System.out.println("-> Tap on side menu button");
		hp.clickTribarButton();
		
		System.out.println("-> Tap on Winner List menu button");
		hp.clickWinnerList();
		
		System.out.println("-> Verify winner list page is displayed");
		sa.assertTrue(wlp.verifyWinnerPage(), "winner page is not displayed");
		sa.assertTrue(wlp.verifyAllMenuTabIsDisplayed(), "menu tab are not displayed");
		sa.assertTrue(wlp.verifyContentofTabIsDisplayed(), "contents are not displayed");
		sa.assertAll();
		
		
	}
	
	/*
	 * tap on all tab
	 *
	 */
	@Test
	public void G_002() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		WinnerListPage wlp = PageFactory.initElements(driver, WinnerListPage.class);
		
		System.out.println("-> Access Winners List page");
		System.out.println("-> Tap on side menu button");
		hp.clickTribarButton();
		
		System.out.println("-> Tap on Winner List menu button");
		hp.clickWinnerList();
		
		System.out.println("-> Tap on tab all");
		wlp.clickTabAll();
		
		System.out.println("-> Verify tab all is selected");
		sa.assertTrue(wlp.verifyTabAllisSelected(), "Tab all is not selected");
		sa.assertAll();
		
		
	}
	
	/*
	 * Tap on selected game tab
	 *
	 */
	@Test
	public void G_003() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		WinnerListPage wlp = PageFactory.initElements(driver, WinnerListPage.class);
		
		System.out.println("-> Access Winners List page");
		System.out.println("-> Tap on side menu button");
		hp.clickTribarButton();
		
		System.out.println("-> Tap on Winner List menu button");
		hp.clickWinnerList();
		
		System.out.println("-> Tap on tab 1");
		wlp.clickTab1();
		
		System.out.println("-> Verify tab 1 is selected");
		sa.assertTrue(wlp.verifyTab1isSelected(), "Tab 1 is not selected");
		Thread.sleep(5000);
		
		System.out.println("-> Tap on tab 2");
		wlp.clickTab2();
		
		System.out.println("-> Verify tab 2 is selected");
		sa.assertTrue(wlp.verifyTab2isSelected(), "Tab 2 is not selected");
		sa.assertAll();
		
		
	}
}
