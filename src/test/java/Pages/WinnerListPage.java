/**
 * 
 */
package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author fendyridwan
 *
 */
public class WinnerListPage {
	
	WebDriver driver;
	
	/*Winner List Page*/
	public WinnerListPage(WebDriver driver) {
		this.driver = driver;
	}

	
	@FindBy(how = How.XPATH, using = "//ul[@class='tab tab-block competition-games']")
	@CacheLookup
	List<WebElement> allMenuTab;
	
	@FindBy(how = How.XPATH, using = "//div[@class='panel-content boundary-padding'] //*[contains(text(),'Winner')]")
	@CacheLookup
	List<WebElement> tabContent;
	
	@FindBy(how = How.XPATH, using = "//*[@id='page']/div/div/div/div[2]/div/div[2]/div[1]/ul/li[1]/a")
	@CacheLookup
	WebElement tabAll;
	
	@FindBy(how = How.XPATH, using = "//li[@class='tab-item active'] //a[@class='tab-link game_tab']")
	@CacheLookup
	WebElement tabActive;
	
	@FindBy(how = How.XPATH, using = "//li[@class='tab-item active'] //a[@class='tab-link game_tab']")
	@CacheLookup
	List<WebElement> tabActive1;
	
	@FindBy(how = How.XPATH, using = "//li[@class='tab-item active'] //a[@class='tab-link game_tab']")
	@CacheLookup
	WebElement tabActive2;
	
	@FindBy(how = How.XPATH, using = "//li[@class='tab-item active'] //a[@class='tab-link game_tab']")
	@CacheLookup
	List<WebElement> tabActive21;
	
	@FindBy(how = How.XPATH, using = "//*[@id='page']/div/div/div/div[2]/div/div[2]/div[1]/ul/li[2]/a")
	@CacheLookup
	WebElement tab1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='page']/div/div/div/div[2]/div/div[2]/div[1]/ul/li[3]/a")
	@CacheLookup
	WebElement tab2;
	
	public boolean verifyWinnerPage() {
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("/mobile/winnersprizelist")) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifyAllMenuTabIsDisplayed() {
		if(!allMenuTab.isEmpty()) {
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean verifyContentofTabIsDisplayed() {
		if(!tabContent.isEmpty()) {
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean verifyTabsSelected(WebElement element, WebElement elementActive, List<WebElement> elementList) {
		String href = element.getAttribute("href");
		String href2 = elementActive.getAttribute("href");

		if(!elementList.isEmpty() && href.contains(href2)==true)
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	
	public void clickTabAll() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(tabAll)).click();
	}
	
	public boolean verifyTabAllisSelected() {
		if(verifyTabsSelected(tabAll,tabActive, tabActive1)==true) {
			return true;
		}else {
			return false;
		}
	}
	
	public void clickTab1() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(tab1)).click();
	}
	
	public boolean verifyTab1isSelected() {
		if(verifyTabsSelected(tab1,tabActive, tabActive1)==true) {
			return true;
		}else {
			return false;
		}
	}
	
	public void clickTab2() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(tab2)).click();
	}
	
	public boolean verifyTab2isSelected() {
		if(verifyTabsSelected(tab2, tabActive2, tabActive21)==true) {
			return true;
		}else {
			return false;
		}
	}
	

}
