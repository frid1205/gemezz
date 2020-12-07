/**
 * 
 */
package TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseSetting.BaseSetting;
import Pages.BrowsePlanPage;
import Pages.MyPlanPage;
import Pages.PlanPage;
import Pages.RegisterPage;

/**
 * @author fendyridwan
 *
 */
public class PlanTest extends BaseSetting{

	@Test
	public void login() throws InterruptedException
	{
		signIn();
		Thread.sleep(3000);
	}
	
	/*
	 * User accesses "My Plans" tab when user has no plan yet
	 * 
	 * Expected result
	 * Display message validation "You have no current plan. Pick one from below and start reading"
	 */
	@Test
	public void Plan_01() throws InterruptedException
	{
		PlanPage pp = PageFactory.initElements(driver, PlanPage.class);
		
		
		pp.clickPlanTab();
		//pp.clickMyPlanTab();
		cleanMyPlan();
		Assert.assertEquals(!pp.emptyPlanIsExist(), true,"empty plan page is not displayed");
	}
	
	/*
	 * User accesses "My Plans" tab when user has a plan
	 * 
	 * Expected result
	 * Plan is listed in "My Plans" tab
	 */
	@Test
	public void Plan_02() throws InterruptedException
	{
		PlanPage pp = PageFactory.initElements(driver, PlanPage.class);
		MyPlanPage mpp = PageFactory.initElements(driver, MyPlanPage.class);
		
		pp.clickPlanTab();
		pp.clickBrowsePlanTab();
		pp.selectBrowsePlan1();
		mpp.clickStartPlanButton();
		mpp.clickBackButton();
		pp.clickMyPlanTab();
		
		Assert.assertEquals(pp.contentMyPlanIsExist(), true,"My plan page is not displayed");
	}
	
	/*
	 * User tap on one plan from the list
	 * 
	 * Expected result
	 * User will be redirected to selected plan detail
	 */
	@Test
	public void Plan_03() throws InterruptedException
	{
		String titlePlan;
		PlanPage pp = PageFactory.initElements(driver, PlanPage.class);
		MyPlanPage mpp = PageFactory.initElements(driver, MyPlanPage.class);
		
		
		pp.clickPlanTab();
		
		titlePlan = mpp.getTitlePlan();
		
		pp.clickContentMyPlan();
		
		Assert.assertEquals(mpp.assertTitlePlan(titlePlan), true,"cannot find same title in detail title plan");
		
		
	}
	
	
	/*
	 * User tap on "Start reading" button while bible application is installed
	 * 
	 * Expected result
	 * User will be asked to download "Bible application"
	 */
	@Test
	public void Plan_05() throws InterruptedException
	{
		MyPlanPage mpp = PageFactory.initElements(driver, MyPlanPage.class);
		
		scrollAndClick("Start Reading");
	
		Assert.assertEquals(mpp.resolverListIsExist(), true, "Resolver list is not displaying");
		backButton();
	}
	
	/*
	 * User checklistes all chapter or tap on all "start reading" button in one list number
	 * 
	 * Expected result
	 * Selected number of list will be marked
	 * Checklistes are checked
	 * 
	 */
	@Test
	public void Plan_06() throws InterruptedException
	{
		MyPlanPage mpp = PageFactory.initElements(driver, MyPlanPage.class);
		
		mpp.clickChecklistButton1();
		mpp.clickChecklistButton1();
		mpp.clickChecklistButton2();
		mpp.clickChecklistButton3();
	
		Assert.assertEquals(mpp.checklistAreChecked(), true, "checklist are not checked");
		
	}
	
	/*
	 * User saves a notes
	 * 
	 * Expected result
	 * Note is saved
	 * 
	 */
	@Test
	public void Plan_07() throws InterruptedException
	{
		PlanPage pp = PageFactory.initElements(driver, PlanPage.class);
		MyPlanPage mpp = PageFactory.initElements(driver, MyPlanPage.class);
		MyPlanPage mpp2 = PageFactory.initElements(driver, MyPlanPage.class);
		
		scrollAndClick("Note");
		mpp.typeNotes("just for test");
		mpp.clickSaveButton();
		mpp.clickBackButton();
		pp.clickContentMyPlan();
		Thread.sleep(2000);
	
		Assert.assertEquals(mpp2.getTextNotes(), "just for test", "Note is not saved");
		
	}
	
	/*
	 * User sends a notes 
	 * 
	 * Expected result
	 * Note sent to selected app
	 * 
	 */
	@Test
	public void Plan_08() throws InterruptedException
	{
		MyPlanPage mpp = PageFactory.initElements(driver, MyPlanPage.class);
		
		mpp.clickSendButton();
		Assert.assertEquals(mpp.resolverListIsExist(), true, "resolver list is not exist");
		
		backButton();
		
	}
	
	/*
	 * User accesses "Browse Plan" page 
	 * 
	 * Expected result
	 * Display browse plan page screen
	 * Display all list of plan and categories
	 * 
	 */
	@Test
	public void Plan_09() throws InterruptedException
	{
		PlanPage pp = PageFactory.initElements(driver, PlanPage.class);
		MyPlanPage mpp = PageFactory.initElements(driver, MyPlanPage.class);
		BrowsePlanPage bp = PageFactory.initElements(driver, BrowsePlanPage.class);
		
		Thread.sleep(3000);
		mpp.clickBackButton();
		pp.clickBrowsePlanTab();
		Assert.assertEquals(bp.bannerCategoryisExist("Browse by category"), true, "text banner is not exist");
		Assert.assertEquals(bp.brdIsExist(), true, "BRD is not exist");
	}
	
	/*
	 * User taps on category 
	 * 
	 * Expected result
	 * User will be redirected to detail category
	 * 
	 */
	@Test
	public void Plan_10() throws InterruptedException
	{
		BrowsePlanPage bp = PageFactory.initElements(driver, BrowsePlanPage.class);
		
		bp.clickCategory1();
		
		Assert.assertEquals(bp.detailCategoryPageListIsExist(), true, "detail category page is not exist");
		
		
		
	}
	
	
	/*
	 * User shares plan 
	 * 
	 * Expected result
	 * App will share the link of selected plan
	 * 
	 */
	@Test
	public void Plan_12() throws InterruptedException
	{
		MyPlanPage mpp = PageFactory.initElements(driver, MyPlanPage.class);
		PlanPage pp = PageFactory.initElements(driver, PlanPage.class);
		
		backButton();
		
		pp.clickMyPlanTab();
		
		pp.clickContentMyPlan();
		
		mpp.clickShareButton();
		Thread.sleep(3000);
		
		Assert.assertEquals(mpp.resolverListIsExist(), true,"share option is displayed");
		backButton();
		
	}
	
	
}
