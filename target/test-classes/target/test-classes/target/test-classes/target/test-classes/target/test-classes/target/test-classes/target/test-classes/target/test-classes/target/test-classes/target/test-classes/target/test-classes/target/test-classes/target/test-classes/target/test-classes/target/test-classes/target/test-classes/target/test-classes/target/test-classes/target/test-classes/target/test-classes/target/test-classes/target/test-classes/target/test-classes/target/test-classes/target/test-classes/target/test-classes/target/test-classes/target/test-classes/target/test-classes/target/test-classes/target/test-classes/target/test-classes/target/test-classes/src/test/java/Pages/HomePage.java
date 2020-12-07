/**
 * 
 */
package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseSetting.BaseSetting;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * @author fendyridwan
 *
 */
public class HomePage extends BaseSetting{
	
	WebDriver driver;
	
	/*Landing Page*/
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[@id=\"st-trigger-effects\"]/button")
	@CacheLookup
	WebElement tribarButton;
	
	@FindBy(how = How.XPATH, using = "//a[@href=\"http://ltc.la.gemezz.mobi/index.php/mobile/\"] //img[@class=\"logo-style\"]")
	@CacheLookup
	WebElement logo;
	
	@FindBy(how = How.XPATH, using = "//i[@class=\"icon icon-search\"]")
	@CacheLookup
	WebElement search;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"menu-10\"]/div[1]/div/h4")
	@CacheLookup
	WebElement helloGuestText;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"menu-10\"]/div[1]/div/h4")
	@CacheLookup
	List<WebElement> helloGuestText1;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Schedule') and contains(@href,'competitionschedule')]")
	@CacheLookup
	WebElement schedule;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Schedule') and contains(@href,'competitionschedule')]")
	@CacheLookup
	List<WebElement> schedule1;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Winners List') and contains(@href,'winnersprizelist')]")
	@CacheLookup
	WebElement winnerList;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Winners List') and contains(@href,'winnersprizelist')]")
	@CacheLookup
	List<WebElement> winnerList1;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Home') and contains(@href,'http://ltc.la.gemezz.mobi/index.php/mobile/home')]")
	@CacheLookup
	WebElement homePageButton;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Home') and contains(@href,'http://ltc.la.gemezz.mobi/index.php/mobile/home')]")
	@CacheLookup
	List<WebElement> homePageButton1;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"menu-10\"]/div[2]/div/span")
	@CacheLookup
	List<WebElement> LanguageText;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Subscribe')]")
	@CacheLookup
	WebElement subscribeButton;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Subscribe')]")
	@CacheLookup
	List<WebElement> subscribeButton1;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Logout') and contains(@href,'http://ltc.la.gemezz.mobi/index.php/mobile/login/logout')]")
	@CacheLookup
	WebElement logoutButton;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Logout') and contains(@href,'http://ltc.la.gemezz.mobi/index.php/mobile/login/logout')]")
	@CacheLookup
	List<WebElement> logoutButton1;
	
	@FindBy(how = How.XPATH, using = "//input[@id=\"msisdn_tel\"]")
	@CacheLookup
	WebElement msisdn;
	
	@FindBy(how = How.XPATH, using = "//input[@id=\"pinflow_btn\"]")
	@CacheLookup
	WebElement sendMsisdnButton;
	
	@FindBy(how = How.XPATH, using = "//input[@id=\"pin\"]")
	@CacheLookup
	WebElement pin;
	
	@FindBy(how = How.XPATH, using = "//input[@id=\"pin_verify_btn\"]")
	@CacheLookup
	WebElement verifyPinButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"menu-10\"]/div[2]/a[1]")
	@CacheLookup
	WebElement about;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"menu-10\"]/div[2]/a[1]")
	@CacheLookup
	List<WebElement> about1;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Customer Support') and contains(@href,'cs')]")
	@CacheLookup
	WebElement cs;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Customer Support') and contains(@href,'cs')]")
	@CacheLookup
	List<WebElement> cs1;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"banner-wrap\"] //a[@class=\"main-banner-cta-button\" and contains(@href,\"/mobile/detail?idgame=\")]")
	@CacheLookup
	List<WebElement> carrouselImage;
	
	@FindBy(how = How.XPATH, using = "//i[@class=\"icon icon-keyboard_arrow_left\"]")
	@CacheLookup
	WebElement carrouselLeftButton;
	
	@FindBy(how = How.XPATH, using = "//i[@class=\"icon icon-keyboard_arrow_right\"]")
	@CacheLookup
	WebElement carrouselRightButton;
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"st-container\"]/div[2]/div/div/div/div[3]/div[1]/a/img")
	@CacheLookup
	WebElement banner1;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"st-container\"]/div[2]/div/div/div/div[3]/div[1]/a/img")
	@CacheLookup
	List<WebElement> banner11;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"st-container\"]/div[2]/div/div/div/div[3]/div[2]/a/img")
	@CacheLookup
	WebElement banner2;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"st-container\"]/div[2]/div/div/div/div[3]/div[2]/a/img")
	@CacheLookup
	List<WebElement> banner21;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"st-container\"]/div[2]/div/div/div/div[3]/div[3]/a/img")
	@CacheLookup
	WebElement banner3;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"st-container\"]/div[2]/div/div/div/div[3]/div[3]/a/img")
	@CacheLookup
	List<WebElement> banner31;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"game-section-group thumbnail-slider\"] //h3[@class=\"game-group-title\" and contains(text(),\"Puzzle\")]")
	@CacheLookup
	List<WebElement> puzzleList;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"game-section-group thumbnail-slider\"] //h3[@class=\"game-group-title\" and contains(text(),\"Arcade\")]")
	@CacheLookup
	List<WebElement> arcadeList;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"game-section-group thumbnail-slider\"] //h3[@class=\"game-group-title\" and contains(text(),\"Racing\")]")
	@CacheLookup
	List<WebElement> racingList;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"game-section-group thumbnail-slider\"] //h3[@class=\"game-group-title\" and contains(text(),\"Sport\")]")
	@CacheLookup
	List<WebElement> sportList;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"game-section-group thumbnail-slider\"] //h3[@class=\"game-group-title\" and contains(text(),\"Card\")]")
	@CacheLookup
	List<WebElement> cardlist;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"game-section-group thumbnail-slider\"] //h3[@class=\"game-group-title\" and contains(text(),\"Shooting\")]")
	@CacheLookup
	List<WebElement> shootingList;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"game-section-group thumbnail-slider\"] //h3[@class=\"game-group-title\" and contains(text(),\"Strategy\")]")
	@CacheLookup
	List<WebElement> strategyList;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"game-section-group thumbnail-slider\"] //h3[@class=\"game-group-title\" and contains(text(),\"Platformer\")]")
	@CacheLookup
	List<WebElement> platformerList;
	
	public String getURL() {
		String URL = driver.getCurrentUrl();
		return URL;

	}
	
	public void clickTribarButton() throws InterruptedException
	{
		Thread.sleep(5000);
		//98,356
		/*
		Point x = driver.findElement(MobileBy.xpath("//*[@id=\"st-trigger-effects\"]/button")).getLocation();
		System.out.println("--"+x.getX());
		System.out.println("--"+x.getY());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"st-trigger-effects\"]/button")).getLocation().x);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"st-trigger-effects\"]/button/i")).getLocation().y);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"st-trigger-effects\"]/button/i")).getLocation().getX());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"st-trigger-effects\"]/button/i")).getLocation().getY());
		
		System.out.println("get width " +driver.findElement(MobileBy.xpath("//*[@id=\"st-trigger-effects\"]/button/i")).getSize().getWidth());
		System.out.println("get height " +driver.findElement(MobileBy.xpath("//*[@id=\"st-trigger-effects\"]/button/i")).getSize().getHeight());

		//1005,343
		System.out.println(driver.findElement(By.xpath("//*[@id=\"st-container\"]/div[2]/div/div/div/div[1]/div[3]/a/i")).getLocation().getX());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"st-container\"]/div[2]/div/div/div/div[1]/div[3]/a/i")).getLocation().getY());
		
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(tribarButton)).click();*/
		//70,310
		tap(70,310);
		//TouchAction action = new TouchAction(driver);
		//t = new TouchAction((PerformsTouchActions) driver);
  	  	
		
	}
	
	public void clickBanner1() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(banner1)).click();
	}
	
	public boolean assertURL() {
		if(getURL().contains("ltc.la.gemezz.mobi")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean helloGuestTextisExist(String GuestName) {
		if(!helloGuestText1.isEmpty()) {
			System.out.println("hello guest text = "+helloGuestText.getText());
			if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(helloGuestText)).getText().contains(GuestName)) {
				return true;
			}else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public void clickLogo() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(logo)).click();
		
	}
	
	public void clickSearch() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(search)).click();
		
	}
	
	public void clickSchedule() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(schedule)).click();
		
	}
	
	public boolean scheduleIsExist() {
		if(!schedule1.isEmpty()) {
			if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(schedule)).getText().contains("Schedule")) {
				return true;
			}else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public void clickWinnerList() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(winnerList)).click();
		
	}
	
	public boolean winnerListIsExist() {
		if(!winnerList1.isEmpty()) {
			if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(winnerList)).getText().contains("Winners List")) {
				return true;
			}else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public void clickHomePageButton() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(homePageButton)).click();
		
	}
	
	public boolean homePageButtonIsExist() {
		if(!homePageButton1.isEmpty()) {
			if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(homePageButton)).getText().contains("Home")) {
				return true;
			}else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public boolean chooseLanguageIsExist() {
		if(!LanguageText.isEmpty()) {
			return true;
			
		}
		else {
			return false;
		}
	}
	
	public void clickSubcribeButton() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(subscribeButton)).click();
		
	}
	
	public boolean subcribeButtonIsExist() {
		if(!subscribeButton1.isEmpty()) {
			if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(subscribeButton)).getText().contains("Subscribe")) {
				return true;
			}else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public void typeMsisdn() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(msisdn)).sendKeys("2059431100");
	}
	
	public void submitMsisdn() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(sendMsisdnButton)).click();
	}
	
	public void typePin() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(pin)).sendKeys("1234");
	}
	
	public void submitPin() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(verifyPinButton)).click();
	}
	
	public void logoutButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(logoutButton)).click();
	}
	
	public boolean logoutButtonIsExist() {
		if(!logoutButton1.isEmpty()) {
			if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(logoutButton)).getText().contains("Logout")) {
				return true;
			}else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public boolean logoutButtonShouldnotExist() {
		boolean logoutbutton = logoutButtonIsExist();
		if(logoutbutton == true) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	public void clickAbout() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(about)).click();
		
	}
	
	public boolean aboutIsExist() {
		if(!about1.isEmpty()) {
			if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(about)).getText().contains("About")) {
				return true;
			}else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public void clickCS() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(cs)).click();
		
	}
	
	public boolean csIsExist() {
		if(!cs1.isEmpty()) {
			if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(cs)).getText().contains("Customer Support")) {
				return true;
			}else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public boolean carrouselIsExist() {
		if(!carrouselImage.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean clickCarrouselRightButton() throws InterruptedException
	{
		 
		try {
			(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(carrouselRightButton)).click();
			return true;
		}catch(Exception e) {
			System.out.println(e);
			return false;
		}
		
	}
	
	public boolean clickCarrouselLeftButton() throws InterruptedException
	{
		try {
			(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(carrouselLeftButton)).click();
			return true;
		}catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public boolean topBannersAreExist() {
		int totBanner = 0;
		scrollDownIntoElement("//*[@id=\"st-container\"]/div[2]/div/div/div/div[3]/div[1]/a/img");
		if(!banner11.isEmpty()) {
			totBanner=totBanner+1;
		}
		else {
			totBanner=totBanner-1;
		}
		
		scrollDownIntoElement("//*[@id=\"st-container\"]/div[2]/div/div/div/div[3]/div[2]/a/img");
		if(!banner21.isEmpty()) {
			totBanner=totBanner+1;
		}
		else {
			totBanner=totBanner-1;
		}
		
		scrollDownIntoElement("//*[@id=\"st-container\"]/div[2]/div/div/div/div[3]/div[3]/a/img");
		if(!banner31.isEmpty()) {
			totBanner=totBanner+1;
		}
		else {
			totBanner=totBanner-1;
		}
		
		System.out.println("total banner = "+totBanner);
		if(totBanner<3) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean puzzleListIsExist() {
		
		scrollDownIntoElement("//div[@class=\"game-section-group thumbnail-slider\"] //h3[@class=\"game-group-title\" and contains(text(),\"Puzzle\")]");
		if(!puzzleList.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean arcadeListIsExist() {
		
		scrollDownIntoElement("//div[@class=\"game-section-group thumbnail-slider\"] //h3[@class=\"game-group-title\" and contains(text(),\"Arcade\")]");
		if(!arcadeList.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean racingListIsExist() {
		
		scrollDownIntoElement("//div[@class=\"game-section-group thumbnail-slider\"] //h3[@class=\"game-group-title\" and contains(text(),\"Racing\")]");
		if(!racingList.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean sportListIsExist() {
		
		scrollDownIntoElement("//div[@class=\"game-section-group thumbnail-slider\"] //h3[@class=\"game-group-title\" and contains(text(),\"Sport\")]");
		if(!sportList.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean cardListIsExist() {
		
		scrollDownIntoElement("//div[@class=\"game-section-group thumbnail-slider\"] //h3[@class=\"game-group-title\" and contains(text(),\"Card\")]");
		if(!cardlist.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean shootingListIsExist() {
		
		scrollDownIntoElement("//div[@class=\"game-section-group thumbnail-slider\"] //h3[@class=\"game-group-title\" and contains(text(),\"Shooting\")]");
		if(!shootingList.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean strategyListIsExist() {
		
		scrollDownIntoElement("//div[@class=\"game-section-group thumbnail-slider\"] //h3[@class=\"game-group-title\" and contains(text(),\"Strategy\")]");
		if(!strategyList.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean platformerListIsExist() {
		
		scrollDownIntoElement("//div[@class=\"game-section-group thumbnail-slider\"] //h3[@class=\"game-group-title\" and contains(text(),\"Platformer\")]");
		if(!platformerList.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
}
