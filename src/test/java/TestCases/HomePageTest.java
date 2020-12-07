/**
 * 
 */
package TestCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseSetting.BaseSetting;
import Pages.HomePage;
import Pages.gameDetailPage;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author fendyridwan
 *
 */
public class HomePageTest extends BaseSetting {

	/*
	 * Verify Home Page display
	
	 */
	@Test
	public void C_001() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);

		System.out.println("-> Verify Home Page display");
		System.out.println("-> Verify home page");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(hp.carrouselIsExist(), "Carrousel is not exist");
		sa.assertTrue(hp.topBannersAreExist(), "3 top banners are not displayed");
		sa.assertTrue(hp.puzzleListIsExist(), "Puzzle list is not exist");
		sa.assertTrue(hp.arcadeListIsExist(), "arcade list is not exist");
		sa.assertTrue(hp.cardListIsExist(), "card list is not exist");
		sa.assertTrue(hp.racingListIsExist(), "racing list is not exist");
		sa.assertTrue(hp.sportListIsExist(), "sport list is not exist");
		sa.assertTrue(hp.shootingListIsExist(), "shooting list is not exist");
		sa.assertTrue(hp.strategyListIsExist(), "strategy list is not exist");
		sa.assertTrue(hp.platformerListIsExist(), "platformer list is not exist");
		sa.assertAll();
		
	}
	
	/*
	 * Tap on right/left button in carrousel
	
	 */
	@Test
	public void C_004() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		
		System.out.println("-> Tap on right/left button in carrousel");
		System.out.println("-> Verify Carrousel right and left button can be clicked");
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(hp.clickCarrouselRightButton(), "Right button of Carrousel cannot be clicked");
		sa.assertTrue(hp.clickCarrouselLeftButton(), "Right button of Carrousel cannot be clicked");
		sa.assertAll();
		
	}
	
	/*
	 * Tap on "Play Now and Win" button in carrousel
	
	 */
	@Test
	public void C_005() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		gameDetailPage gdp = PageFactory.initElements(driver, gameDetailPage.class);
		
		System.out.println("-> Tap on \"Play Now and Win\" button in carrousel");
		hp.clickPlayNowAndWinButton();
		
		System.out.println("-> Verify URL is valid");
		Assert.assertTrue(verifyURLisvalid("/mobile/detail?idgame"), "URL is not valid");
		
	}
	
	/*
	 * 3 top banner
	
	 */
	@Test
	public void C_006() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		
		System.out.println("-> Verify 3 top banner are displayed");
		sa.assertTrue(hp.topBannersAreExist(), "3 top banners are not displayed");
	}
	
	/*
	 * Tap on one of 3 top banner in home page
	
	 */
	@Test
	public void C_007() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		SoftAssert sa = new SoftAssert();
		
		System.out.println("Tap on one of 3 top banner in home page");
		hp.clickBanner1();
		sa.assertTrue(verifyURLisvalid("/mobile/detail?idgame"), "Banner 1 is not clicked");
		
		accessHomePage();
		hp.clickBanner2();
		sa.assertTrue(verifyURLisvalid("/mobile/detail?idgame"), "Banner 1 is not clicked");
		
		accessHomePage();
		hp.clickBanner3();
		sa.assertTrue(verifyURLisvalid("/mobile/detail?idgame"), "Banner 1 is not clicked");
		
		sa.assertAll();
	}
	
	/*
	 * Tap on thumbnail card in section list
	
	 */
	@Test
	public void C_009() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		SoftAssert sa = new SoftAssert();
		
		System.out.println("Tap on thumbnail card in section list");
		hp.clickThumbnailCard();
		sa.assertTrue(verifyURLisvalid("/mobile/detail?idgame"), "Banner 1 is not clicked");
		sa.assertAll();
	}

}
