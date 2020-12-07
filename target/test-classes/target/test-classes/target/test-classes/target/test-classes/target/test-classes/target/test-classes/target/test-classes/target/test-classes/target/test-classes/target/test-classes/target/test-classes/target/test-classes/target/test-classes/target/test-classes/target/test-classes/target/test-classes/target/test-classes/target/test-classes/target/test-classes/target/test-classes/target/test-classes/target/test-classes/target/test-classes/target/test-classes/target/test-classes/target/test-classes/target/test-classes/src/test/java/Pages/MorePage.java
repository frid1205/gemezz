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

import BaseSetting.BaseSetting;

/**
 * @author fendyridwan
 *
 */
public class MorePage extends BaseSetting{
	WebDriver driver;
	
	/*Plan Tab*/
	public MorePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using = "sg.wesley:id/iv_more_tab")
	@CacheLookup
	WebElement moreTab;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/btn_latest_updates")
	@CacheLookup
	WebElement latestUpdatesButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_news_title")
	@CacheLookup
	WebElement webviewTitle;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/btn_worship")
	@CacheLookup
	WebElement worshipButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_worship_archives")
	@CacheLookup
	WebElement worshipArchivesButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_worship_online")
	@CacheLookup
	WebElement worshipOnlineButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_worship_schedule")
	@CacheLookup
	WebElement worshipScheduleButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_worship_archives")
	@CacheLookup
	List<WebElement> worshipArchivesButtonList;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_worship_online")
	@CacheLookup
	List<WebElement> worshipOnlineButtonList;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_worship_schedule")
	@CacheLookup
	List<WebElement> worshipScheduleButtonList;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/btn_prayer_request")
	@CacheLookup
	WebElement prayerRequestButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/btn_events_courses")
	@CacheLookup
	WebElement eventCourseButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/btn_stay_connected")
	@CacheLookup
	WebElement stayConnectedButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_connected_telegram")
	@CacheLookup
	WebElement telegramButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_connected_telegram")
	@CacheLookup
	List<WebElement> telegramButtonList;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_connected_facebook")
	@CacheLookup
	WebElement facebookButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_connected_facebook")
	@CacheLookup
	List<WebElement> facebookButtonList;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_connected_instagram")
	@CacheLookup
	WebElement instagramButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_connected_instagram")
	@CacheLookup
	List<WebElement> instagramButtonList;
	
	@FindBy(how = How.ID, using = "android:id/resolver_list")
	@CacheLookup
	List<WebElement> resolverList;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/btn_pledge")
	@CacheLookup
	WebElement givePledgeButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_give")
	@CacheLookup
	WebElement giveButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_pledge")
	@CacheLookup
	WebElement PledgeButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_give")
	@CacheLookup
	List<WebElement> giveButtonList;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_pledge")
	@CacheLookup
	List<WebElement> pledgeButtonList;
	
	
	@FindBy(how = How.ID, using = "//android.widget.TextView[@text='Giving']")
	@CacheLookup
	WebElement webContent1;
	
	@FindBy(how = How.ID, using = "//android.widget.TextView[@text='Giving']")
	@CacheLookup
	List<WebElement> webContent;
	
	@FindBy(how = How.ID, using = "com.sec.android.app.sbrowser:id/location_bar_edit_text")
	@CacheLookup
	WebElement samsungInternetURL;
	
	@FindBy(how = How.ID, using = "com.android.chrome:id/url_bar")
	@CacheLookup
	WebElement chromeURL;
	
	@FindBy(how = How.ID, using = "org.mozilla.firefox:id/mozac_browser_toolbar_url_view")
	@CacheLookup
	WebElement mozillaURL;
	
	@FindBy(how = How.ID, using = "com.sec.android.app.sbrowser:id/location_bar_edit_text")
	@CacheLookup
	List<WebElement> samsungInternetURLList;
	
	@FindBy(how = How.ID, using = "com.android.chrome:id/url_bar")
	@CacheLookup
	List<WebElement> chromeURLList;
	
	@FindBy(how = How.ID, using = "org.mozilla.firefox:id/mozac_browser_toolbar_url_view")
	@CacheLookup
	List<WebElement> mozillaURLList;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/btn_resources")
	@CacheLookup
	WebElement resourcesButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_wesley_weekly")
	@CacheLookup
	WebElement wesleyWeekleyButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_wesley_weekly")
	@CacheLookup
	List<WebElement> wesleyWeekleyList;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_wesley_tidings")
	@CacheLookup
	WebElement wesleyTidingButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_wesley_tidings")
	@CacheLookup
	List<WebElement> wesleyWeeklyList;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_sermons")
	@CacheLookup
	WebElement sermonsButtons;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_sermons")
	@CacheLookup
	List<WebElement> sermonslist;
	
	
	@FindBy(how = How.ID, using = "sg.wesley:id/btn_website")
	@CacheLookup
	WebElement wesleyWebsiteButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/btn_contacts")
	@CacheLookup
	WebElement contactUsButton;
	
	
	public void clickMoreTab() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(moreTab)).click();
	}
	
	public void clickLatestUpdate() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(latestUpdatesButton)).click();
	}
	
	public String getWebViewTitle() {
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(webviewTitle)).getText();
	}
	
	public void clickWorshipAchiveButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(worshipArchivesButton)).click();
	}
	
	public void clickWorshipOnlineButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(worshipOnlineButton)).click();
	}
	
	public void clickWorshipScheduleButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(worshipScheduleButton)).click();
	}
	
	public void clickWorshipButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(worshipButton)).click();
	}
	
	public boolean allWorshipButtonsAreExist() {
		if(!worshipArchivesButtonList.isEmpty()==true && !worshipOnlineButtonList.isEmpty()==true && !worshipScheduleButtonList.isEmpty()==true) {
			return true;
		}else {
			return false;
		}
	}
	
	public void clickPrayerRequestButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(prayerRequestButton)).click();
	}
	
	public void clickEventCourseButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(eventCourseButton)).click();
	}
	
	public void clickStayConnectedButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(stayConnectedButton)).click();
	}
	
	public boolean allStayConnectionOptionsAreExist() {
		if(!facebookButtonList.isEmpty()==true && !telegramButtonList.isEmpty()==true && !instagramButtonList.isEmpty()==true) {
			return true;
		}else {
			return false;
		}
	}
	
	public void clickTelegramButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(telegramButton)).click();
	}
	
	public void clickFacebookButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(facebookButton)).click();
	}
	
	public void clickInstagramButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(instagramButton)).click();
	}
	
	public boolean resolverListIsExist() {
		if(!resolverList.isEmpty()==true) {
			return true;
		}else {
			return false;
		}
	}
	
	public void clickGivePledgeButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(givePledgeButton)).click();
	}
	
	public void clickGiveButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(giveButton)).click();
	}
	
	public void clickPledgeButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(PledgeButton)).click();
	}
	
	public boolean givePledgeButtonAreExist() {
		if(!giveButtonList.isEmpty()==true && !pledgeButtonList.isEmpty()==true) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean displayResolverList() {
		
		//if device shows 
		if(resolverListIsExist()==true) {
			return true;
		}else {
			
			return false;
		}
		
	}
	
	public boolean checkForContentWebGive() {
		
		if(displayResolverList()==false) {
			
			if(!chromeURLList.isEmpty()) {
				if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(chromeURL)).getText().contains("wesleymc.org/get-involved/e-giving")) {
					return true;
				}else {return false;}
			}else if(!mozillaURLList.isEmpty()) {
				if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(mozillaURL)).getText().contains("wesleymc.org/get-involved/e-giving")) {
					return true;
				}else {return false;}
			}else if(!samsungInternetURLList.isEmpty()) {
				if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(samsungInternetURL)).getText().contains("wesleymc.org")) {
					return true;
				}else {return false;}
			}else {
				System.out.println("browser is not recognised");
				return false;
			}
		
		}
		else {
			return true;
		}
	
	}
	
	public boolean checkForContentWebPledge() {
		
		if(displayResolverList()==false) {
			
			if(!chromeURLList.isEmpty()) {
				if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(chromeURL)).getText().contains("https://wesleymc.org/mypledge")) {
					return true;
				}else {return false;}
			}else if(!mozillaURLList.isEmpty()) {
				if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(mozillaURL)).getText().contains("https://wesleymc.org/mypledge")) {
					return true;
				}else {return false;}
			}else if(!samsungInternetURLList.isEmpty()) {
				if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(samsungInternetURL)).getText().contains("wesleymc.org")) {
					return true;
				}else {return false;}
			}else {
				System.out.println("browser is not recognised");
				return false;
			}
		
		}
		else {
			return true;
		}
	
	}
	
	public void clickResourcesButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(resourcesButton)).click();
	}
	
	public void clickWesleyWeeklyButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(wesleyWeekleyButton)).click();
	}
	
	public void clickWesleyTidingButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(wesleyTidingButton)).click();
	}
	
	public void clickSermonsButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(sermonsButtons)).click();
	}
	
	public boolean checkResourcesOptionsAreExist() {
		if(!wesleyWeekleyList.isEmpty()&&!wesleyWeeklyList.isEmpty()&&!sermonslist.isEmpty()) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public void clickWesleyWebsiteButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(wesleyWebsiteButton)).click();
	}
	
	public void clickContactUs() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(contactUsButton)).click();
	}

}
