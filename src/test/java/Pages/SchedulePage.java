/**
 * 
 */
package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import BaseSetting.BaseSetting;

/**
 * @author fendyridwan
 *
 */
public class SchedulePage extends BaseSetting{

	WebDriver driver;
	
	/*gameDetailPage*/
	public SchedulePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[@class='tab-link type_tab' and contains(text(),'CURRENT')]")
	@CacheLookup
	WebElement CurrentTab;
	
	@FindBy(how = How.XPATH, using = "//a[@class='tab-link type_tab' and contains(text(),'CURRENT')]")
	@CacheLookup
	List<WebElement> CurrentTab1;
	
	@FindBy(how = How.XPATH, using = "//a[@class='tab-link type_tab' and contains(text(),'COMMING SOON')]")
	@CacheLookup
	WebElement CoomingSoonTab;
	
	@FindBy(how = How.XPATH, using = "//a[@class='tab-link type_tab' and contains(text(),'COMMING SOON')]")
	@CacheLookup
	List<WebElement> CoomingSoonTab1;
	
	@FindBy(how = How.XPATH, using = "//a[@class='tab-link type_tab' and contains(text(),'FINISH')]")
	@CacheLookup
	WebElement FinishTab;
	
	@FindBy(how = How.XPATH, using = "//a[@class='tab-link type_tab' and contains(text(),'FINISH')]")
	@CacheLookup
	List<WebElement> FinishTab1;
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"all\"]/div[1]/div[1]/div/a")
	@CacheLookup
	WebElement firstList;
	
	
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'NOW')]")
	@CacheLookup
	WebElement playNowButton;
	
	//==========================Current Tab=================
	@FindBy(how = How.XPATH, using = "//*[@id='comingsoon']/div[1]/div[1]/div/a")
	@CacheLookup
	WebElement firstListCurrentTabSoon;
	
	@FindBy(how = How.XPATH, using = "//*[@id='all']/div[1]")
	@CacheLookup
	WebElement firstSessionListCurrentTab;
	
	@FindBy(how = How.XPATH, using = "//*[@id='all']/div[2]")
	@CacheLookup
	WebElement secondSessionListCurrentTab;
	
	@FindBy(how = How.XPATH, using = "//*[@id='all']/div[3]")
	@CacheLookup
	WebElement secondSessionListCurrentTab2;
	
	@FindBy(how = How.XPATH, using = "//*[@id='all']/div[1]")
	@CacheLookup
	List<WebElement> firstSessionListCurrentTab1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='all']/div[2]")
	@CacheLookup
	List<WebElement> secondSessionListCurrentTab1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='all']/div[3]")
	@CacheLookup
	List<WebElement> secondSessionListCurrentTab21;
	
	@FindBy(how = How.XPATH, using = "//div[@class='more-winners'] //a[@class='k5-btn-short btn-indigo js-more-winners load-more-schedule' and contains(text(),'LOAD MORE')]")
	@CacheLookup
	WebElement loadMoreButtonCurrent;
	
	@FindBy(how = How.XPATH, using = "//div[@class='more-winners'] //a[@class='k5-btn-short btn-indigo js-more-winners load-more-schedule' and contains(text(),'LOAD MORE')]")
	@CacheLookup
	List<WebElement> loadMoreButtonCurrent1;
	
	
	//=========================Comming Soon tab===============
	@FindBy(how = How.XPATH, using = "//*[@id='comingsoon']/div[1]/div[1]/div/a")
	@CacheLookup
	WebElement firstListCommingSoon;
	
	@FindBy(how = How.XPATH, using = "//*[@id='comingsoon']/div[1]")
	@CacheLookup
	WebElement firstSessionListCommingSoonTab;
	
	@FindBy(how = How.XPATH, using = "//*[@id='comingsoon']/div[2]")
	@CacheLookup
	WebElement secondSessionListCommingSoonTab;
	
	@FindBy(how = How.XPATH, using = "//*[@id='comingsoon']/div[3]")
	@CacheLookup
	WebElement secondSessionListCommingSoonTab2;
	
	@FindBy(how = How.XPATH, using = "//*[@id='comingsoon']/div[1]")
	@CacheLookup
	List<WebElement> firstSessionListCommingSoonTab1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='comingsoon']/div[2]")
	@CacheLookup
	List<WebElement> secondSessionListCommingSoonTab1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='comingsoon']/div[3]")
	@CacheLookup
	List<WebElement> secondSessionListCommingSoonTab21;
	
	@FindBy(how = How.XPATH, using = "//div[@id='comingsoon'] //*[@id=\"morebtn_today\"]/div/a")
	@CacheLookup
	WebElement loadMoreButtonCS;
	
	@FindBy(how = How.XPATH, using = "//div[@id='comingsoon'] //*[@id=\"morebtn_today\"]/div/a")
	@CacheLookup
	List<WebElement> loadMoreButtonCS1;
	
	
	//=================================Finish Tab=====================
	@FindBy(how = How.XPATH, using = "//*[@id=\"finish\"]/div[1]/div[1]/div/a")
	@CacheLookup
	WebElement firstListFinishTab;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"finish\"]/div[1]")
	@CacheLookup
	WebElement firstSessionListFinishTab;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"finish\"]/div[2]")
	@CacheLookup
	WebElement secondSessionListFinishTab;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"finish\"]/div[3]")
	@CacheLookup
	WebElement secondSessionListFinishTab2;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"finish\"]/div[1]")
	@CacheLookup
	List<WebElement> firstSessionListFinishTab1;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"finish\"]/div[2]")
	@CacheLookup
	List<WebElement> secondSessionListFinishTab1;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"finish\"]/div[3]")
	@CacheLookup
	List<WebElement> secondSessionListFinishTab21;
	
	@FindBy(how = How.XPATH, using = "//div[@id='finish'] //*[@id=\"morebtn_today\"]/div/a")
	@CacheLookup
	WebElement loadMoreButtonFinish;
	
	@FindBy(how = How.XPATH, using = "//div[@id='finish'] //*[@id=\"morebtn_today\"]/div/a")
	@CacheLookup
	List<WebElement> loadMoreButtonFinish1;
	
	
	public void clickCurrentTab() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(CurrentTab)).click();
	}
	
	
	public boolean currentTabIsExist() {
		if(!CurrentTab1.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void clickCoomingSoonTab() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(CoomingSoonTab)).click();
	}
	
	public boolean commingSoonTabIsExist() {
		if(!CoomingSoonTab1.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void clickFinishTab() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(FinishTab)).click();
	}
	
	public boolean finishTabIsExist() {
		if(!FinishTab1.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void clickFirstListPlayNowbutton() throws InterruptedException
	{
		
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(firstList)).click();
	}
	
	//===============Load More button from all tab============================//
	public void clickLoadMoreButton() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(loadMoreButtonCurrent)).click();
	}
	
	public void clickLoadMoreButtonCS() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(loadMoreButtonCS)).click();
	}
	
	public void clickLoadMoreButtonFinish() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(loadMoreButtonFinish)).click();
	}
	//========================================================================//
	
	public void click3tab() {
		SoftAssert sac = new SoftAssert();
		try {
			clickCurrentTab();
		}catch(Exception e) {
			sac.assertTrue(false, ""+e);
		}
		
		try {
			clickCoomingSoonTab();
		}catch(Exception e) {
			sac.assertTrue(false, ""+e);
		}
		
		try {
			clickFinishTab();
		}catch(Exception e) {
			sac.assertTrue(false, ""+e);
		}
		
		try {
			clickCurrentTab();
		}catch(Exception e) {
			sac.assertTrue(false, ""+e);
		}
		
		sac.assertAll();
		
	}
	
	public boolean verifyLoadMoreButtonInCurrentTab() throws InterruptedException{
		int getExist1 = 0;
		int loadMoreisExist = 0;
		int i=1;
		if(!firstSessionListCurrentTab1.isEmpty()) {
			getExist1 = getExist1 + 1;
		}
		
		while(i<=3) {
			scrollDownIntoElement("//p[@class='copyright']");
			//scrollDownIntoElement("//div[@class='more-winners'] //a[@class='k5-btn-short btn-indigo js-more-winners load-more-schedule' and contains(text(),'LOAD MORE')]");
			
			if(!loadMoreButtonCurrent1.isEmpty()==true) {
				clickLoadMoreButton();
				
				if(!secondSessionListCurrentTab1.isEmpty()) {
					//System.out.println(secondSessionListCurrentTab1.getAttribute("value")+" isvisible"+secondSessionListCurrentTab1.isDisplayed());
					if(secondSessionListCurrentTab.isDisplayed()) {
						getExist1 = getExist1 + 1;
					}
					
				}
				else 
				if(!secondSessionListCurrentTab21.isEmpty()) {
					if(secondSessionListCurrentTab2.isDisplayed()) {
						getExist1 = getExist1 + 1;
					}
					
				}
				loadMoreisExist = loadMoreisExist + 1;
			}
			i++;
		}
		
		if(loadMoreisExist>0) 
		{
			if(getExist1==loadMoreisExist) 
			{
				return true;
			}else
			{
				return false;
			}
		}else
		{
			return true;
		}
	}
	
	public void clickPlayNowButton() throws InterruptedException
	{
		clickFirstListPlayNowbutton();
		Thread.sleep(6000);
	}
	
	public void clickFirstListCommingSoon() throws InterruptedException
	{
		
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(firstListCommingSoon)).click();
		Thread.sleep(6000);
	}
	
	public boolean verifyLoadMoreButtonIsWorkingInCommingSoon() throws InterruptedException 
	{
		int getExist1 = 0;
		int loadMoreisExist = 0;
		int i=1;
		if(!firstSessionListCommingSoonTab1.isEmpty()) {
			getExist1 = getExist1 + 1;
		}
		
		while(i<=3) {
			
			scrollDownIntoElement("//p[@class='copyright']");
			//scrollDownIntoElement("//div[@class='more-winners'] //a[@class='k5-btn-short btn-indigo js-more-winners load-more-schedule' and contains(text(),'LOAD MORE')]");
			
			if(!loadMoreButtonCS1.isEmpty()==true) 
			{
				clickLoadMoreButtonCS();
				if(!secondSessionListCommingSoonTab1.isEmpty() && i==1) {
					if(secondSessionListCommingSoonTab.isDisplayed()) {
						getExist1 = getExist1 + 1;
					}
					
				}else 
				if(!secondSessionListCommingSoonTab21.isEmpty() && i==2)
				{
					if(secondSessionListCommingSoonTab2.isDisplayed()) {
						getExist1 = getExist1 + 1;
					}
				}
				loadMoreisExist = loadMoreisExist + 1;
			}
			i++;
		}

		if(loadMoreisExist>0) 
		{
			if(getExist1==loadMoreisExist) 
			{
				return true;
			}else
			{
				return false;
			}
		}else
		{
			return true;
		}
	}
	
	public void clickFirstListFinishTab() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(firstListFinishTab)).click();
	}
	
	public boolean verifyLoadMoreButtonIsWorkingInFinishTab() throws InterruptedException 
	{
		int getExist1 = 0;
		int loadMoreisExist = 0;
		int i = 1;
		if(!firstSessionListFinishTab1.isEmpty()) {
			getExist1 = getExist1 + 1;
		}
		
			while(i<=3) {
			scrollDownIntoElement("//p[@class='copyright']");
			//scrollDownIntoElement("//div[@class='more-winners'] //a[@class='k5-btn-short btn-indigo js-more-winners load-more-schedule' and contains(text(),'LOAD MORE')]");
			
			if(!loadMoreButtonFinish1.isEmpty()==true) {
				clickLoadMoreButtonFinish();
				
				if(!secondSessionListFinishTab1.isEmpty()) {
					if(secondSessionListFinishTab.isDisplayed()) {
						getExist1 = getExist1 + 1;
					}
					
				}else
				if(!secondSessionListFinishTab21.isEmpty()) {
					if(secondSessionListFinishTab2.isDisplayed()) {
						getExist1 = getExist1 + 1;
					}
					
				}
				loadMoreisExist = loadMoreisExist + 1;
			}
			i++;
		}
		
		if(loadMoreisExist>0) 
		{
			if(getExist1==loadMoreisExist) 
			{
				return true;
			}else
			{
				return false;
			}
		}else
		{
			return true;
		}
	}
	
}
