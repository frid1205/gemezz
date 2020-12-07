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
public class AboutPage {
	
	WebDriver driver;
	
	/*Landing Page*/
	public AboutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean verifyAboutURL() {
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("/mobile/about")) {
			return true;
		}else {
			return false;
		}
	}
}
