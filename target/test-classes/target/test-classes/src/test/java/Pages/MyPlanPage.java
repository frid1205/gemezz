/**
 * 
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseSetting.BaseSetting;

/**
 * @author fendyridwan
 *
 */
public class MyPlanPage extends BaseSetting{

	WebDriver driver;
	
	/*Plan Tab*/
	public MyPlanPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Before start plan
	@FindBy(how = How.ID, using = "sg.wesley:id/btn_start_plan")
	@CacheLookup
	WebElement startPlanButton;
	
	//After start Plan
	@FindBy(how = How.ID, using = "sg.wesley:id/btn_back")
	@CacheLookup
	WebElement backButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_plan_title")
	@CacheLookup
	WebElement planTitleFromList;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_plans_details_title")
	@CacheLookup
	WebElement planDetailTitle;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.Button")
	@CacheLookup
	WebElement readingButton1;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.CheckBox")
	@CacheLookup
	WebElement checklistButton1;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[2]/android.widget.CheckBox")
	@CacheLookup
	WebElement checklistButton2;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[3]/android.widget.CheckBox")
	@CacheLookup
	WebElement checklistButton3;
	
	@FindBy(how = How.ID, using = "android:id/resolver_list")
	@CacheLookup
	WebElement resolverList;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/btn_stop_plan")
	@CacheLookup
	WebElement stopPlanButton;
	
	@FindBy(how = How.ID, using = "android:id/button1")
	@CacheLookup
	WebElement androidYesButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/et_notes")
	@CacheLookup
	WebElement notes;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_save")
	@CacheLookup
	WebElement saveButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/tv_send")
	@CacheLookup
	WebElement sendButton;
	
	@FindBy(how = How.ID, using = "sg.wesley:id/btn_share_bible_plan")
	@CacheLookup
	WebElement shareButton;
	
	
	
	//Before start plan
	public void clickStartPlanButton() throws InterruptedException {
		Thread.sleep(3000);
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(startPlanButton)).click();
	}
	
	
	
	//after start plan
	public void clickBackButton() throws InterruptedException {
		Thread.sleep(3000);
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(backButton)).click();
		
	}
	
	public String getTitlePlan() {
		
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(planTitleFromList)).getText();
	}
	
	public boolean assertTitlePlan(String titlePlan) {
		
		String titleDetailPlan = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(planDetailTitle)).getText();
		
		if(titlePlan.equals(titleDetailPlan)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void clickReading1() {
		
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(readingButton1)).click();
	}
	
	public void clickChecklistButton1() {
		
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(checklistButton1)).click();
	}
	
	public void clickChecklistButton2() {
			
			(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(checklistButton2)).click();
		}
	
	public void clickChecklistButton3() {
		
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(checklistButton3)).click();
	}
	
	public boolean checklistAreChecked() {
		String check1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(checklistButton1)).getAttribute("checked");
		String check2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(checklistButton2)).getAttribute("checked");
		String check3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(checklistButton3)).getAttribute("checked");
		
		System.out.println(check1+"-"+check2+"-"+check3);
		
		if(check1.equals("true")&&check2.equals("true")&&check3.equals("true")) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean resolverListIsExist() throws InterruptedException {
		Thread.sleep(3000);
		if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(resolverList)).isDisplayed()==true) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void typeNotes(String text) {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(notes)).sendKeys(text);
		hidekeyboard();
	}
	
	public String getTextNotes() {
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(notes)).getText();
	}
	
	
	public void clickStopButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(stopPlanButton)).click();
	}
	
	public void clickYesAndroidButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(androidYesButton)).click();
	}
	
	public void clickSaveButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(saveButton)).click();
	}
	
	public void clickSendButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(sendButton)).click();
	}
	
	public void clickShareButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(shareButton)).click();
	}
}
