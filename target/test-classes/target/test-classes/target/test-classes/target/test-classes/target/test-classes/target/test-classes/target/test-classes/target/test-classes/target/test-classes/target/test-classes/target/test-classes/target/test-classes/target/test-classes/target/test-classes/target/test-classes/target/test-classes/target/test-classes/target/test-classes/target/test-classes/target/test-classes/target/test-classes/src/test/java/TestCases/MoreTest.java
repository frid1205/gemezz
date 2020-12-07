/**
 * 
 */
package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseSetting.BaseSetting;
import Pages.MorePage;
import Pages.PrayerPage;

/**
 * @author fendyridwan
 *
 */
public class MoreTest extends BaseSetting{

	@Test
	public void login() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		signIn();
		Thread.sleep(3000);
		
		mp.clickMoreTab();
		
	}
	
	/*
	 * Users taps on "Latest Updates" button
	 * 
	 * Expected result
	 * User will be redirected to webview of latest updates page
	 * 
	 */
	@Test
	public void More_01() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		mp.clickLatestUpdate();
		
		Assert.assertEquals(mp.getWebViewTitle(), "Latest Updates","title is not found");
		
		backButton();
	}
	
	/*
	 * Users taps on "Worship" button
	 * 
	 * Expected result
	 * Display 3 option to select 
		 - Worship Schedule
		 - Worship Online
		 - Worship Archive
	 * 
	 */
	@Test
	public void More_02() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		mp.clickWorshipButton();
		
		Assert.assertEquals(mp.allWorshipButtonsAreExist(),true, "cannot find option for worship");
		
		backButton();
	}
	
	/*
	 * Users accesses "Worship Schedule"
	 * 
	 * Expected result
	 * User will be redirected to webview of worship schedule page
	 * 
	 */
	@Test
	public void More_03() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		mp.clickWorshipButton();
		
		mp.clickWorshipScheduleButton();
		
		Assert.assertEquals(mp.getWebViewTitle(),"Worship Schedule", "Worship archives is not opened");
	}
	
	/*
	 * Users accesses "Worship Online"
	 * 
	 * Expected result
	 * User will be redirected to webview of worship Online page
	 * 
	 */
	@Test
	public void More_04() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		backButton();
		
		mp.clickWorshipButton();
		
		mp.clickWorshipOnlineButton();
		
		Assert.assertEquals(mp.getWebViewTitle(),"Worship Online", "Worship archives is not opened");
	}
	
	/*
	 * Users accesses "Worship Archives"
	 * 
	 * Expected result
	 * User will be redirected to webview of worship Archives page
	 * 
	 */
	@Test
	public void More_05() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		backButton();
		
		mp.clickWorshipButton();
		
		mp.clickWorshipAchiveButton();
		
		Assert.assertEquals(mp.getWebViewTitle(),"Worship Archives", "Worship archives is not opened");
	}
	
	/*
	 * Users accesses "Prayer Request"
	 * 
	 * Expected result
	 * User will be redirected to webview of Prayer Request page
	 * 
	 */
	@Test
	public void More_06() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		backButton();
		
		mp.clickPrayerRequestButton();
		
		Assert.assertEquals(mp.getWebViewTitle(),"Prayer Request", "Prayer Request webview is not opened");
	}
	
	/*
	 * Users accesses "Events / Courses"
	 * 
	 * Expected result
	 * User will be redirected to webview of Events / Courses page
	 * 
	 */
	@Test
	public void More_07() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		backButton();
		
		mp.clickEventCourseButton();
		
		Assert.assertEquals(mp.getWebViewTitle(),"Events / Courses", "Events/Courses webview is not opened");
	}
	
	/*
	 * Users tap on "Stay Connected" button
	 * 
	 * Expected result
	 * Display 3 option to select 
		 - Join us on telegram
		 - Follow us on facebook
		 - Follow us on instagram
	 * 
	 */
	@Test
	public void More_08() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		backButton();
		
		mp.clickStayConnectedButton();
		
		Assert.assertEquals(mp.allStayConnectionOptionsAreExist(),true, "Options are not found");
	}
	
	/*
	 * Users taps on "Join us on telegram" button
	 * 
	 * Expected result
	 * User will be asked to join the group
	 * 
	 */
	@Test
	public void More_09() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		backButton();
		
		mp.clickStayConnectedButton();
		
		mp.clickTelegramButton();
		
		Assert.assertEquals(mp.resolverListIsExist(),true, "telegram button is not working");
	}
	
	/*
	 * Users accesses "Follow us on facebook"
	 * 
	 * Expected result
	 * User will be redirected to wesley facebook account
	 * 
	 */
	@Test
	public void More_10() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		backButton();
		
		mp.clickStayConnectedButton();
		
		mp.clickFacebookButton();
		
		Assert.assertEquals(mp.resolverListIsExist(),true, "facebook button is not working");
	}
	
	/*
	 * Users accesses "Follow us on instagram"
	 * 
	 * Expected result
	 * User will be redirected to wesley instagram account
	 * 
	 */
	@Test
	public void More_11() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		backButton();
		
		mp.clickStayConnectedButton();
		
		mp.clickInstagramButton();
		
		Assert.assertEquals(mp.resolverListIsExist(),true, "instagram button is not working");
	}
	
	/*
	 * Users accesses "Give / Pledge"
	 * 
	 * Expected result
	 * Display 2 option to select 
		 - Give
		 - Pledge
	 * 
	 */
	@Test
	public void More_12() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		backButton();
		
		mp.clickGivePledgeButton();
		
		Assert.assertEquals(mp.givePledgeButtonAreExist(),true, "Options button are exist");
	}
	
	/*
	 * Users accesses "Give"
	 * 
	 * Expected result
	 * User will be redirected to webview of give page
	 * 
	 */
	@Test
	public void More_13() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		backButton();
		
		mp.clickGivePledgeButton();
		
		mp.clickGiveButton();
		
		Assert.assertEquals(mp.checkForContentWebGive(),true);
	}
	
	/*
	 * Users accesses "Pledge"
	 * 
	 * Expected result
	 * User will be redirected to webview of Pledge page
	 * 
	 */
	@Test
	public void More_14() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		backButton();
		
		mp.clickGivePledgeButton();
		
		mp.clickPledgeButton();
		
		Assert.assertEquals(mp.checkForContentWebPledge(),true);
	}
	
	/*
	 * Users taps on "Resources" button
	 * 
	 * Expected result
	 * Display 3 option to select 
		 - Wesley Weekly
		 - Worship Tidings
		 - Sermons
	 * 
	 */
	@Test
	public void More_15() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		backButton();
		
		mp.clickResourcesButton();
		
		Assert.assertEquals(mp.checkResourcesOptionsAreExist(),true, "cannot find option for resources");
		
	}
	
	/*
	 * Users accesses "Wesley Weekly"
	 * 
	 * Expected result
	 * User will be redirected to webview of Wesley Weekly page
	 * 
	 */
	@Test
	public void More_16() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		backButton();
		
		mp.clickResourcesButton();
		
		mp.clickWesleyWeeklyButton();
		
		Assert.assertEquals(mp.getWebViewTitle(),"Wesley Weekly", "Wesley Weekly is not opened");
	}
	
	/*
	 * Users accesses "Wesley Tiding"
	 * 
	 * Expected result
	 * User will be redirected to webview of Wesley Tidings page
	 * 
	 */
	@Test
	public void More_17() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		backButton();
		
		mp.clickResourcesButton();
		
		mp.clickWesleyTidingButton();
		
		Assert.assertEquals(mp.getWebViewTitle(),"Wesley Tidings", "Wesley Tidings is not opened");
	}
	
	/*
	 * Users accesses "Sermons"
	 * 
	 * Expected result
	 * User will be redirected to webview of sermons page
	 * 
	 */
	@Test
	public void More_18() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		backButton();
		
		mp.clickResourcesButton();
		
		mp.clickSermonsButton();
		
		Assert.assertEquals(mp.getWebViewTitle(),"Sermons", "Sermons is not opened");
	}
	
	/*
	 * Users taps on "Wesley Website" button
	 * 
	 * Expected result
	 * User will be redirected to webview of Wesley website page
	 * 
	 */
	@Test
	public void More_19() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		backButton();
		
		mp.clickWesleyWebsiteButton();
		
		Assert.assertEquals(mp.getWebViewTitle(),"Wesley Website", "Wesley Website is not opened");
	}
	
	/*
	 * Users accesses "Contact Us"
	 * 
	 * Expected result
	 * User will be redirected to webview of Contact Us page
	 * 
	 */
	@Test
	public void More_20() throws InterruptedException
	{
		MorePage mp = PageFactory.initElements(driver, MorePage.class);
		
		backButton();
		
		mp.clickContactUs();
		
		Assert.assertEquals(mp.getWebViewTitle(),"Contact Us", "Contact Us is not opened");
	}
	
}
