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
import Pages.SchedulePage;
import Pages.gameDetailPage;
import Pages.searchPage;

/**
 * @author fendyridwan
 *
 */
public class ScheduleTest extends BaseSetting {
	
	/*
	 * Access competition schedule page
	
	 */
	@Test
	public void F_001() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		SchedulePage sp = PageFactory.initElements(driver, SchedulePage.class);
		
		System.out.println("-> Access competition schedule page");
		System.out.println("-> Tap on side menu button");
		hp.clickTribarButton();
		
		System.out.println("-> Tap on schedule menu button");
		hp.clickSchedule();
		
		System.out.println("-> Verify schedule page is displayed");
		sa.assertTrue(sp.currentTabIsExist(), "Current tab is not exist");
		sa.assertTrue(sp.commingSoonTabIsExist(), "comming soon tab is not exist");
		sa.assertTrue(sp.finishTabIsExist(), "Finish tab is not exist");
		sa.assertAll();
		
		System.out.println("-> Tap on 3 menu tab ");
		sp.click3tab();
		
	}
	
	/*
	 * Tap on Current tab
	
	 */
	@Test
	public void F_002() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		SchedulePage sp = PageFactory.initElements(driver, SchedulePage.class);
		gameDetailPage gdp = PageFactory.initElements(driver, gameDetailPage.class);
		
		System.out.println("-> Tap on Current tab");
		System.out.println("-> Tap on side menu button");
		hp.clickTribarButton();
		
		System.out.println("-> Tap on schedule menu button");
		hp.clickSchedule();
		
		System.out.println("-> Verify load more button is working");
		sa.assertTrue(sp.verifyLoadMoreButtonIsWorkingOrNot(), "load more button is not working");
		
		System.out.println("-> Tap on play now button");
		sp.clickPlayNowButton();
		
		System.out.println("-> verify detail game page is displayed by URL");
		sa.assertTrue(gdp.verifyGameDetailPageURL(), "Game detail Page is not displayed");
		sa.assertAll();
	}
}
