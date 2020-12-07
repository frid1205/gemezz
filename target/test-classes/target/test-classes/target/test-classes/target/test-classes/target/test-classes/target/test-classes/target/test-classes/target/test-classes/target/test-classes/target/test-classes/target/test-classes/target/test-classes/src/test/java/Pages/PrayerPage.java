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
public class PrayerPage {
	
	WebDriver driver;
	
	/*Plan Tab*/
	public PrayerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_prayer_tab")
	@CacheLookup
	WebElement prayerTab;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
	@CacheLookup
	List<WebElement> prayerTitle;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_church")
	@CacheLookup
	WebElement wesleyTab;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_ministries")
	@CacheLookup
	WebElement ministriesTab;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_pray_together")
	@CacheLookup
	WebElement prayTogetherTab;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/btn_prayer_download")
	@CacheLookup
	WebElement downloadPrayerPointer;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView")
	@CacheLookup
	WebElement prayButton;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.ImageView")
	@CacheLookup
	WebElement shareButton;
	
	@FindBy(how = How.ID, using = "android:id/resolver_list")
	@CacheLookup
	List<WebElement> shareList;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	@CacheLookup
	WebElement prayerMarked;
	
	
	public void clickPrayerTab() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(prayerTab)).click();
	}
	
	public boolean prayerTitleIsExist() {
		if(!prayerTitle.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void clickWesleyTab() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(wesleyTab)).click();
	}
	
	public void clickMinistriesTab() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(ministriesTab)).click();
	}
	
	public void clickPrayTogetherTab() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(prayTogetherTab)).click();
	}
	
	public void clickPrayButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(prayButton)).click();
	}
	
	public void clickShareButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(shareButton)).click();
	}
	
	public boolean shareListIsExist() {
		if(!shareList.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public String prayMarked() {
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(prayerMarked)).getText();
	}
	
	public void clickDownloadPointer() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(downloadPrayerPointer)).click();
	}

}
