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
	
	@FindBy(how = How.XPATH, using = "//div[@class='more-winners'] //a[@class='k5-btn-short btn-indigo js-more-winners load-more-schedule' and contains(text(),'LOAD MORE')]")
	@CacheLookup
	WebElement loadMoreButton;
	
	@FindBy(how = How.XPATH, using = "//div[@class='more-winners'] //a[@class='k5-btn-short btn-indigo js-more-winners load-more-schedule' and contains(text(),'LOAD MORE')]")
	@CacheLookup
	List<WebElement> loadMoreButton1;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"all\"]/div[1]/div[3]/div/a")
	@CacheLookup
	WebElement firstList;
	
	@FindBy(how = How.XPATH, using = "//*[@id='all']/div[1]/div[3]/div/a")
	@CacheLookup
	WebElement thirdList;
	
	@FindBy(how = How.XPATH, using = "//*[@id='all']/div[2]/div[1]/div/a")
	@CacheLookup
	WebElement thirdList21;
	
	@FindBy(how = How.XPATH, using = "//*[@id='all']/div[2]/div[2]/div/a")
	@CacheLookup
	WebElement thirdList22;
	
	@FindBy(how = How.XPATH, using = "//*[@id='all']/div[2]/div[3]/div/a")
	@CacheLookup
	WebElement thirdList23;
	
	@FindBy(how = How.XPATH, using = "//*[@id='all']/div[1]/div[3]/div/a")
	@CacheLookup
	List<WebElement> thirdList1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='all']/div[2]/div[1]/div/a")
	@CacheLookup
	List<WebElement> thirdList211;
	
	@FindBy(how = How.XPATH, using = "//*[@id='all']/div[2]/div[2]/div/a")
	@CacheLookup
	List<WebElement> thirdList221;
	
	@FindBy(how = How.XPATH, using = "//*[@id='all']/div[2]/div[3]/div/a")
	@CacheLookup
	List<WebElement> thirdList231;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'NOW')]")
	@CacheLookup
	WebElement playNowButton;
	
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
	
	public void clickLoadMoreButton() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(loadMoreButton)).click();
	}
	
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
	
	public boolean verifyLoadMoreButtonIsWorkingOrNot() throws InterruptedException{
		scrollDownIntoElement("//p[@class='copyright']");
		//scrollDownIntoElement("//div[@class='more-winners'] //a[@class='k5-btn-short btn-indigo js-more-winners load-more-schedule' and contains(text(),'LOAD MORE')]");
		String getAttribute1 = "";
		String getAttribute2 = "";
		
		if(!thirdList1.isEmpty()==true) {
			getAttribute1 = thirdList.getAttribute("href");
		}
		
		if(!loadMoreButton1.isEmpty()==true) {
			clickLoadMoreButton();
		
			scrollDownIntoElement("//p[@class='copyright']");
			
			if(!thirdList211.isEmpty()==true ) {
				getAttribute2 = thirdList21.getAttribute("href");
			}else
			if(!thirdList221.isEmpty()==true) {
				getAttribute2 = thirdList22.getAttribute("href");
			}else
			if(!thirdList231.isEmpty()==true) {
				getAttribute2 = thirdList23.getAttribute("href");
			}else {
				//no more game displayed
			}
			
		}
		
		if(getAttribute1.equals(getAttribute2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void clickPlayNowButton() throws InterruptedException
	{
		clickFirstListPlayNowbutton();
		Thread.sleep(6000);
	}
	
	
}
