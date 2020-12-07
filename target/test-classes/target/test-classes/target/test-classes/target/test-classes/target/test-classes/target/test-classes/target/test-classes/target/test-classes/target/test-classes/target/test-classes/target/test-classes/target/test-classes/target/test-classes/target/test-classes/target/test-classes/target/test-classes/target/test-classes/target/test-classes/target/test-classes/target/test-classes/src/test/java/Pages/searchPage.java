/**
 * 
 */
package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseSetting.BaseSetting;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * @author fendyridwan
 *
 */
public class searchPage extends BaseSetting{
	
	AndroidDriver driver;
	
	public searchPage(AndroidDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"inputsearch\"]")
	@CacheLookup
	WebElement searchField;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),\"Search\")]")
	@CacheLookup
	WebElement searchButton;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),\"Search Result\")]")
	@CacheLookup
	WebElement textofSearchResult;
	
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),\"Space\")]")
	@CacheLookup
	WebElement searchResult;
	
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),\"Space\")]")
	@CacheLookup
	List<WebElement> searchResult1;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),\"Search\")]")
	@CacheLookup
	List<WebElement> searchPage;
	
	
	
	public void inputSearch(String text) throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(searchField)).sendKeys(text);
	}
	
	public void clickSearchButton() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(searchButton)).click();
	}
	
	public boolean searchResultisExist() {
		if(!searchResult1.isEmpty()) {
			if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(searchResult)).getText().contains("Space")) {
				return true;
			}else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public boolean isSearchPage() {
		if(!searchPage.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

}
