/**
 * 
 */
package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseSetting.BaseSetting;
import Pages.HomePage;

/**
 * @author fendyridwan
 *
 */
public class LaunchWebTest extends BaseSetting{
	
	@Test
	public void A_001() throws InterruptedException {
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		
		System.out.println("-> Verify page is in homescreen");
		Assert.assertTrue(hp.assertURL(),"URL is found");
		
	}
}
