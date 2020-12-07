/**
 * 
 */
package Pages;

import org.openqa.selenium.WebDriver;

/**
 * @author fendyridwan
 *
 */
public class CustomerSupportPage {
	WebDriver driver;
	
	/*Landing Page*/
	public CustomerSupportPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean verifyAboutURL() {
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("/mobile/cs")) {
			return true;
		}else {
			return false;
		}
	}
}
