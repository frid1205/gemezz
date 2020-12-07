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
public class SearchTest extends BaseSetting{

	/*
	 * Tap on search icon in top navigation
	
	 */
	@Test
	public void D_001() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		searchPage sp = PageFactory.initElements(driver, searchPage.class);
		
		System.out.println("-> Tap on search icon");
		hp.clickSearch();
		Thread.sleep(5000);
		
		System.out.println("-> Verify search page is displayed");
		Assert.assertTrue(sp.isSearchPage(), "Search page is not displayed");
	}
	
	/*
	 * Search available item
	
	 */
	@Test
	public void D_002() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		searchPage sp = PageFactory.initElements(driver, searchPage.class);
		
		System.out.println("-> Search available item");
		System.out.println("-> Tap on search icon");
		hp.clickSearch();
		Thread.sleep(7000);
		
		System.out.println("-> Type Text");
		sp.inputSearch("Space Trip");
		
		System.out.println("-> Enter search button");
		sp.clickSearchButton();
		Thread.sleep(3000);
	
		System.out.println("-> Verify search result is displayed");
		Assert.assertTrue(sp.searchResultisExist("Space Trip"), "Search result is not displayed");
	}
	
	/*
	 * Search unavailable item
	
	 */
	@Test
	public void D_003() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		searchPage sp = PageFactory.initElements(driver, searchPage.class);
		
		System.out.println("-> Search unavailable item");
		System.out.println("-> Tap on search icon");
		hp.clickSearch();
		Thread.sleep(7000);
		
		System.out.println("-> Type Text");
		sp.inputSearch("xxxx");
		
		System.out.println("-> Enter search button");
		sp.clickSearchButton();
		Thread.sleep(3000);
	
		System.out.println("-> Verify search result is displayed");
		Assert.assertTrue(sp.isNoResultFoundisExist(), "Search result should not be displayed");
	}
	
	/*
	 * search with entering special character in search field
	
	 */
	@Test
	public void D_004() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		searchPage sp = PageFactory.initElements(driver, searchPage.class);
		
		System.out.println("-> search with entering special character in search field");
		System.out.println("-> Tap on search icon");
		hp.clickSearch();
		Thread.sleep(5000);
		
		System.out.println("-> Type Text");
		sp.inputSearch("*Space Trip#");
		
		System.out.println("-> Enter search button");
		sp.clickSearchButton();
		Thread.sleep(3000);
	
		System.out.println("-> Verify search result is displayed");
		Assert.assertTrue(sp.isNoResultFoundisExist(), "Search result should not be displayed");
	}
}
