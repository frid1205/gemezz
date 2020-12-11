/**
 * 
 */
package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
public class gameDetailPage extends BaseSetting {
	WebDriver driver;
	
	/*gameDetailPage*/
	public gameDetailPage(WebDriver driver) {
		this.driver = driver;
	}

	
	@FindBy(how = How.XPATH, using = "//*[@id=\"st-container\"]/div[3]/div/div/div/div[4]/div[1]/div[1]")
	@CacheLookup
	WebElement likeButton;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"fb-like fb_iframe_widget fb_iframe_widget_fluid\"]")
	@CacheLookup
	List<WebElement> likeButton1;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"st-container\"]/div[3]/div/div/div/div[4]/div[1]/div[2]")
	@CacheLookup
	WebElement shareButton;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class,'fb-share')]")
	@CacheLookup
	List<WebElement> shareButton1;
	
	@FindBy(how = How.XPATH, using = "//button[contains(@class,'leaderboard')]")
	@CacheLookup
	WebElement leaderBoardTab;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'currentwin')]")
	@CacheLookup
	WebElement currentWinnerTab;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'daily')]")
	@CacheLookup
	WebElement dailyTab;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'weekly')]")
	@CacheLookup
	WebElement weeklyTab;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'monthly')]")
	@CacheLookup
	WebElement montlyTab;
	
	@FindBy(how = How.XPATH, using = "//div[@id='tab'] //button[contains(@class,'review')]")
	@CacheLookup
	WebElement reviewTab;
	
	@FindBy(how = How.XPATH, using = "//div[@id='tab'] //button[contains(@class,'review')]")
	@CacheLookup
	WebElement whatsapp;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'whatsapp')]")
	@CacheLookup
	List<WebElement> whatsapp1;
	
	@FindBy(how = How.XPATH, using = "//a[@id='playsgamesID' or @class='new-play-button text-white _ga_playButtonNoLogin']")
	@CacheLookup
	WebElement playGameButton;
	
	@FindBy(how = How.XPATH, using = "//a[@id='playsgamesID' or @class='new-play-button text-white _ga_playButtonNoLogin']")
	@CacheLookup
	List<WebElement> playGameButton1;
	
	
	
	public boolean verifyGameDetailPageURL() {
			
		String url = driver.getCurrentUrl();
		
		if(url.contains("/mobile/detail?idgame")) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifyGameDetailFromScheduleFinish() {
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("/mobile/winnersprizelist?gameid=")) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifyLikeButtonIsExist() {
		try {
			scrollDownIntoElement("//button[@type=\"submit\" and contains(@title,\"Like\")]");
			
			if(!likeButton1.isEmpty()) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean verifyShareButtonIsExist() {
		try {
			scrollDownIntoElement("//a[contains(@href,\"share\")] //button[@type=\"submit\"]");
			
			if(!shareButton1.isEmpty()) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			return false;
		}
	}
	
	public void clickLikeButton() throws InterruptedException
	{
		scrollDownIntoElement("//div[@class=\"game-share clearfix\"]");
		Thread.sleep(2000);
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(likeButton)).click();
		
		
	}
	
	public void clickShareButton() throws InterruptedException
	{
		scrollDownIntoElement("//div[@class=\"game-share clearfix\"]");
		Thread.sleep(2000);
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(shareButton)).click();
		
	}
	
	public void clickTapLeaderBoard() throws InterruptedException
	{
		scrollDownIntoElement("//div[@id='tab']");
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(leaderBoardTab)).click();
	}
	
	public void clickCurrentWinner() throws InterruptedException
	{
		scrollDownIntoElement("//div[@id='tab']");
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(currentWinnerTab)).click();
	}
	
	public void clickTodayTab() throws InterruptedException
	{
		scrollDownIntoElement("//div[@id='tab']");
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(dailyTab)).click();
	}
	
	public void clickWeeklyTab() throws InterruptedException
	{
		scrollDownIntoElement("//div[@id='tab']");
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(weeklyTab)).click();
	}
	
	public void clickMonthlyTab() throws InterruptedException
	{
		scrollDownIntoElement("//div[@id='tab']");
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(montlyTab)).click();
	}
	
	public boolean verifyCurrentDailyWeeklyMonthly() {
		try {
			clickTapLeaderBoard();
			clickCurrentWinner();
			clickTodayTab();
			clickWeeklyTab();
			clickMonthlyTab();
			
			return true;
		}catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public void clickOnReviewTab() throws InterruptedException
	{
		scrollDownIntoElement("//div[@id='tab']");
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(reviewTab)).click();
	}
	
	public boolean verifyReviewTabisTapped() {
		try {
			clickOnReviewTab();
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean verifyLikeButtonIsWorkingOrNot() {
		try {
			System.out.println("-> Click on like button");
			clickLikeButton();
			Thread.sleep(4000);
			backButton();
			return true;
		}catch(Exception e) {
			System.out.println(e);
			backButton();
			return false;
			
		}
		       
		
	}
	
	public boolean verifyShareButtonIsWorkingOrNot() {
		try {
			System.out.println("-> Click on share button");
			clickShareButton();
			Thread.sleep(3000);
			backButton();
			return true;
		}catch(Exception e) {
			System.out.println(e);
			return false;
		}
		

	}
	
	public boolean verifyWhatsappButtonIsworkingOrNot() {
		try {
			System.out.println("-> Click on whatsapp button");
			clickWhatsAppButton();
			Thread.sleep(3000);
			backButton();
			return true;
		}catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public void clickWhatsAppButton() {
		scrollDownIntoElement("//div[@class=\"game-share clearfix\"]");
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(whatsapp)).click();
		
	}
	
	public void clickPlayButton() throws InterruptedException
	{
		
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(playGameButton)).click();
	}
	
}
