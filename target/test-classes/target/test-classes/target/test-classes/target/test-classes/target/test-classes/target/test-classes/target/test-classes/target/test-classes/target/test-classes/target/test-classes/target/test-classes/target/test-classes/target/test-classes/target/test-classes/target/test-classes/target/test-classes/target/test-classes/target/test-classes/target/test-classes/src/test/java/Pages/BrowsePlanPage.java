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

/**
 * @author fendyridwan
 *
 */
public class BrowsePlanPage {
	WebDriver driver;
	
	/*Browse Tab*/
	public BrowsePlanPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")
	@CacheLookup
	WebElement bannerCategory;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]")
	@CacheLookup
	WebElement BRD;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.View")
	@CacheLookup
	WebElement category1;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/plans_recycler_view")
	@CacheLookup
	WebElement detailCategoryPage;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/plans_recycler_view")
	@CacheLookup
	List<WebElement> detailCategoryPageList;
	
	@FindBy(how = How.XPATH, using = "sg.wesley:id/btn_back")
	@CacheLookup
	WebElement backButton;
	
	
	public boolean bannerCategoryisExist(String bannerTitleInput) {
		
		String bannerTitle = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(bannerCategory)).getText();
		
		if(bannerTitle.equals(bannerTitleInput)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean brdIsExist() {
		
		if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(bannerCategory)).isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean detailCategoryPageIsExist() {
		
		if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(detailCategoryPage)).isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean detailCategoryPageListIsExist() throws InterruptedException {
		Thread.sleep(3000);
		
		if(!detailCategoryPageList.isEmpty()) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void clickCategory1() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(category1)).click();
	}
	
	public void clickBackButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(backButton)).click();
	}

}
