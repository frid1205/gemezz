/**
 * 
 */
package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseSetting.BaseSetting;

import Pages.PrayerPage;

/**
 * @author fendyridwan
 *
 */
public class PrayerTest extends BaseSetting{

	@Test
	public void login() throws InterruptedException
	{
		signIn();
		Thread.sleep(3000);
	}
	
	/*
	 * User accesses wesley tab
	 * 
	 * Expected result
	 * User should be able to see :
 		- List of wesley prayer
 		- each prayer has prayer button and share button
	 */
	@Test
	public void Prayer_01() throws InterruptedException
	{
		PrayerPage pp = PageFactory.initElements(driver, PrayerPage.class);
		
		pp.clickPrayerTab();
		
		pp.clickWesleyTab();
		
		Assert.assertEquals(pp.prayerTitleIsExist(), true,"prayer title is not displayed");
	}
	
	/*
	 * User taps on pray button in one of wesley list
	 * 
	 * Expected result
	 * Prayer will be marked
	 */
	@Test
	public void Prayer_02() throws InterruptedException
	{
		PrayerPage pp = PageFactory.initElements(driver, PrayerPage.class);
		
		pp.clickPrayButton();
		
		Assert.assertEquals(pp.prayMarked(), "1","prayer should be 1");
	}
	
	/*
	 * User taps on share button in one of wesley list
	 * 
	 * Expected result
	 * Option to select app displayed
	 */
	@Test
	public void Prayer_03() throws InterruptedException
	{
		PrayerPage pp = PageFactory.initElements(driver, PrayerPage.class);
		
		pp.clickShareButton();
		
		Assert.assertEquals(pp.shareListIsExist(), true,"share list is displayed");
	}
	
	/*
	 * User accesses ministries tab
	 * 
	 * Expected result
	 * User should be able to see :
		 - List of ministry prayer
		 - each prayer has prayer button and share button
	 */
	@Test
	public void Prayer_04() throws InterruptedException
	{
		PrayerPage pp = PageFactory.initElements(driver, PrayerPage.class);
		
		backButton();
		
		pp.clickMinistriesTab();
		
		//Assert.assertEquals(pp.shareListIsExist(), true,"share list is displayed");
	}
	
	/*
	 * User taps on pray button in one of ministries list
	 * 
	 * Expected result
	 * Prayer will be marked
	 * 
	 */
	@Test
	public void Prayer_05() throws InterruptedException
	{
		PrayerPage pp = PageFactory.initElements(driver, PrayerPage.class);
		
		pp.clickPrayButton();
		
		//Assert.assertEquals(pp.shareListIsExist(), true,"share list is displayed");
	}
	
	/*
	 * User taps on share button in one of ministries list
	 * 
	 * Expected result
	 * Option to select app displayed
	 * 
	 */
	@Test
	public void Prayer_06() throws InterruptedException
	{
		PrayerPage pp = PageFactory.initElements(driver, PrayerPage.class);
		
		pp.clickShareButton();
		
		Assert.assertEquals(pp.shareListIsExist(), true,"share list is displayed");
	}
	
	/*
	 * User accesses Pray Together tab
	 * 
	 * Expected result
	 * User should be able to see :
 		- List of Pray Together
	 * 
	 */
	@Test
	public void Prayer_07() throws InterruptedException
	{
		PrayerPage pp = PageFactory.initElements(driver, PrayerPage.class);
		
		backButton();
		
		pp.clickPrayTogetherTab();
		
		//Assert.assertEquals(pp.shareListIsExist(), true,"share list is displayed");
	}
	
	/*
	 * User taps on pray button in one of "Pray Together" list
	 * 
	 * Expected result
	 * User should be able to see :
 		- List of Pray Together
	 * 
	 */
	@Test
	public void Prayer_08() throws InterruptedException
	{
		PrayerPage pp = PageFactory.initElements(driver, PrayerPage.class);
		
		pp.clickPrayButton();
		
		Assert.assertEquals(pp.prayMarked(), "1","pray is marked");
	}
	
	/*
	 * User taps on share button in one of "Pray Together" list
	 * 
	 * Expected result
	 * Option to select app displayed
	 * 
	 */
	@Test
	public void Prayer_09() throws InterruptedException
	{
		PrayerPage pp = PageFactory.initElements(driver, PrayerPage.class);
		
		pp.clickShareButton();
		
		Assert.assertEquals(pp.shareListIsExist(), true,"share list is not displayed");
	}
	
	/*
	 * User taps on "Download prayer pointer" button
	 * 
	 * Expected result
	 * User will be redirected to webview of download page
	 * 
	 */
	@Test
	public void Prayer_10() throws InterruptedException
	{
		PrayerPage pp = PageFactory.initElements(driver, PrayerPage.class);
		
		backButton();
		
		pp.clickDownloadPointer();
		
		Assert.assertEquals(pp.shareListIsExist(), true,"share list is not displayed");
	}
}
