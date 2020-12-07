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
public class PlanPage {

	WebDriver driver;
	
	/*Plan Tab*/
	public PlanPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using = "sg.wesley:id/iv_plans_tab")
	@CacheLookup
	WebElement planTab;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/layout_empty_plan")
	@CacheLookup
	WebElement emptyPlan;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/layout_empty_plan")
	@CacheLookup
	List<WebElement> emptyPlanList;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_my_plans")
	@CacheLookup
	WebElement myPlanTab;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
	@CacheLookup
	WebElement contentMyPlan;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/layout_my_plan")
	@CacheLookup
	List<WebElement> contentMyPlanList;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
	@CacheLookup
	List<WebElement> contentMyPlan2List;
	
	
	
	//Browse Plan
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_browse_plans")
	@CacheLookup
	WebElement browsePlanTab;
	
	@FindBy(how = How.XPATH, using = "hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView")
	@CacheLookup
	WebElement browsePlan1;
	
	@FindBy(how = How.XPATH, using = "hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView")
	@CacheLookup
	WebElement browsePlan2;
	
	
	
	public void clickPlanTab() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(planTab)).click();
	}
	
	public boolean emptyPlanIsExist() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println(!emptyPlanList.isEmpty());
		if(!emptyPlanList.isEmpty()==false) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void clickMyPlanTab() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(myPlanTab)).click();
	}
	
	public boolean contentMyPlanIsExist() throws InterruptedException {
		Thread.sleep(3000);
		
		if(contentMyPlanList.isEmpty()==false) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean contentMyPlan2IsExist() throws InterruptedException {
		Thread.sleep(3000);
		
		if(contentMyPlan2List.isEmpty()==false) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void clickContentMyPlan() throws InterruptedException {
		Thread.sleep(3000);
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(contentMyPlan)).click();
	}
	
	
	
	//Browse Plan
	public void clickBrowsePlanTab() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(browsePlanTab)).click();
	}
	
	public void selectBrowsePlan1() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(browsePlan1)).click();
	}
	
	public void selectBrowsePlan2() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(browsePlan2)).click();
	}
}
