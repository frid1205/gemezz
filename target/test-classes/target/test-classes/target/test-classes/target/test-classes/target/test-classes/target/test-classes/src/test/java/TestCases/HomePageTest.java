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
	 * Verify Home Page display
	
	 */
	@Test
	public void C_004() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		
		System.out.println("-> Verify Carrousel right and left button can be clicked");
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(hp.clickCarrouselRightButton(), "Right button of Carrousel cannot be clicked");
		sa.assertTrue(hp.clickCarrouselLeftButton(), "Right button of Carrousel cannot be clicked");
		sa.assertAll();
		
	}

}
