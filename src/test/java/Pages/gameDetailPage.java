/**
 * 
 */
package Pages;

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
public class gameDetailPage {
	WebDriver driver;
	
	/*gameDetailPage*/
	public gameDetailPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),\"PLAY\")]")
	@CacheLookup
	WebElement playButton;
	
	public void clickBanner1() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(playButton)).click();
	}
	
	public boolean verifyGameDetailPageURL() {
			
		String url = driver.getCurrentUrl();
		
		if(url.contains("/mobile/detail?idgame")) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
