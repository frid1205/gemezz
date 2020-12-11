/**
 * 
 */
package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseSetting.BaseSetting;
import Pages.GamePage;
import Pages.HomePage;
import Pages.WinnerListPage;
import Pages.gameDetailPage;

/**
 * @author fendyridwan
 *
 */
public class GameDetailTest extends BaseSetting{
	
	/*
	 * Access game detail page
	
	 */
	@Test
	public void H_001() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		gameDetailPage gdp = PageFactory.initElements(driver, gameDetailPage.class);
		
		System.out.println("-> Access game detail page");
		System.out.println("-> click on banner");
		hp.clickBanner1();
		
		System.out.println("-> Verify game detail page is displayed");
		sa.assertTrue(gdp.verifyGameDetailPageURL(), "Game detail page is not displayed");
		sa.assertTrue(gdp.verifyLikeButtonIsExist(), "Like button is not displayed");
		sa.assertTrue(gdp.verifyShareButtonIsExist(), "Share button is not displayed");
		sa.assertTrue(gdp.verifyCurrentDailyWeeklyMonthly(), "leaderboard is not displayed");
		sa.assertTrue(gdp.verifyReviewTabisTapped(), "Review is not displayed");
		
		sa.assertAll();
		
		
	}
	
	/*
	 * Review game
	
	 */
	
	public void H_002() throws InterruptedException {
		//not supported
		
	}

	/*
	 * Like game
	
	 */
	@Test
	public void H_003() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		gameDetailPage gdp = PageFactory.initElements(driver, gameDetailPage.class);
		
		System.out.println("-> Access game detail page");
		System.out.println("-> click on banner");
		hp.clickBanner3();
		Thread.sleep(5000);
		
		System.out.println("-> Verify like button is working or not");
		sa.assertTrue(gdp.verifyLikeButtonIsWorkingOrNot(), "Like button is not working");
		sa.assertAll();
	}
	
	/*
	 * Share game
	
	 */
	@Test
	public void H_004() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		gameDetailPage gdp = PageFactory.initElements(driver, gameDetailPage.class);
		
		System.out.println("-> Access game detail page");
		System.out.println("-> click on banner");
		hp.clickBanner3();
		
		System.out.println("-> Verify Share button is working or not");
		sa.assertTrue(gdp.verifyShareButtonIsWorkingOrNot(), "Share button is not working");
		driver.navigate().back();
		sa.assertAll();
		
		
	}
	
	/*
	 * Share game via whatsapp
	
	 */
	@Test
	public void H_005() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		gameDetailPage gdp = PageFactory.initElements(driver, gameDetailPage.class);
		
		System.out.println("-> Share game via whatsapp");
		System.out.println("-> click on banner");
		hp.clickBanner3();
		
		System.out.println("-> Verify whatsapp button is working or not");
		sa.assertTrue(gdp.verifyShareButtonIsWorkingOrNot(), "Share button is not working");
		sa.assertAll();
		
		
	}
	
	/*
	 * Play the game with subcribed user
	
	 */
	@Test
	public void H_007() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		gameDetailPage gdp = PageFactory.initElements(driver, gameDetailPage.class);
		GamePage gp = PageFactory.initElements(driver, GamePage.class);
		
		System.out.println("-> Play the game with subcribed user");
		
		hp.clickTribarButton();
		hp.logoutIfUserLogin();
		
		login();
		
		System.out.println("-> Go to detail game page");
		hp.puzzleListIsExist();
		hp.clickThumbnailCard();
		Thread.sleep(5000);
		
		gdp.clickPlayButton();
		Thread.sleep(5000);
		
		sa.assertTrue(gp.verifyGamePageURL(), "game page is not displayed");
		sa.assertAll();
		
		
	}
	
	/*
	 * Play the game with unsubcribed user
	
	 */
	@Test
	public void H_008() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		gameDetailPage gdp1 = PageFactory.initElements(driver, gameDetailPage.class);
		
		System.out.println("-> Play the game with unsubcribed user");
		
		hp.clickTribarButton();
		hp.logoutIfUserLogin();
		
		System.out.println("-> Go to detail game page");
		hp.puzzleListIsExist();
		hp.clickThumbnailCard();
		
		gdp1.clickPlayButton();
		Thread.sleep(7000);
		
		sa.assertTrue(hp.verifyMsisdnIsExistOrNot(), "msisdn is not displayed");
		sa.assertAll();
		
		
	}
}
