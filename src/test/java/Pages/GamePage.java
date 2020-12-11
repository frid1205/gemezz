/**
 * 
 */
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author fendyridwan
 *
 */
public class GamePage {
	WebDriver driver;
	
	/*gameDetailPage*/
	public GamePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean verifyGamePageURL() {
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("assets/game/") && url.contains("userid")) {
			return true;
		}else {
			return false;
		}
	}

}
